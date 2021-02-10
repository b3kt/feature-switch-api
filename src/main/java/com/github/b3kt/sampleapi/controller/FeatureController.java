package com.github.b3kt.sampleapi.controller;

import java.util.List;
import java.util.Optional;

import com.github.b3kt.sampleapi.entity.Feature;
import com.github.b3kt.sampleapi.entity.Permission;
import com.github.b3kt.sampleapi.entity.User;
import com.google.gson.JsonObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController extends BaseController {

	@GetMapping("/feature")
	@ResponseBody
	public String featureInquiry(String email, String featureName) {

		Boolean canAccess = Boolean.FALSE;

		// VALIDATING REQUEST
		if (StringUtils.isNotBlank(email) && StringUtils.isNotBlank(featureName)) {
			canAccess = serviceLocator.getUserService().checkHasPermission(email, featureName);
		}
		logger.info("email: {}, feature: {}, canAccess : {} ", email, featureName, canAccess);

		// BUILD RESPONSE
		response.addProperty("canAccess", canAccess);
		return gson.toJson(response);
	}

	@PostMapping("/feature")
	@ResponseBody
	public ResponseEntity<String> featureUpdate(@RequestBody String content) {
		logger.info("req {} ", content);

		if (StringUtils.isNotBlank(content)) {
			// VALIDATE REQUEST
			final JsonObject request = gson.fromJson(content, JsonObject.class);
			if (request.has("featureName") && request.has("email") && request.has("enable")) {

				// CHECK EXISTING
				Permission permission = serviceLocator.getPermissionService().changeUserAccess(
						request.get("email").getAsString(), request.get("featureName").getAsString(),
						request.get("enable").getAsBoolean());

				if (permission != null) {
					logger.info("OK ");
					return new ResponseEntity<String>(HttpStatus.OK);
				}
			}
		}

		return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);
	}

}
