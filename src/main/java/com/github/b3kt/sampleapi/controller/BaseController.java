package com.github.b3kt.sampleapi.controller;

import javax.persistence.MappedSuperclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.b3kt.sampleapi.service.IServiceLocator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@MappedSuperclass
public class BaseController {
	
	protected Logger logger = LoggerFactory.getLogger(BaseController.class);

	protected Gson gson = new Gson();

	protected JsonObject response = new JsonObject();
	
	@Autowired
	protected IServiceLocator serviceLocator;


}
