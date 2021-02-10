package com.github.b3kt.sampleapi.service;

import com.github.b3kt.sampleapi.entity.Permission;

public interface IPermissionService {

	Permission changeUserAccess(String email, String featureName, Boolean status);

}
