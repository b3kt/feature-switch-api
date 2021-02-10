package com.github.b3kt.sampleapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.b3kt.sampleapi.service.IFeatureService;
import com.github.b3kt.sampleapi.service.IPermissionService;
import com.github.b3kt.sampleapi.service.IServiceLocator;
import com.github.b3kt.sampleapi.service.IUserService;

@Service
public class ServiceLocator implements IServiceLocator{

	@Autowired
	IUserService userService;
	
	@Autowired
	IFeatureService featureSrevice;
	
	@Autowired
	IPermissionService permissionService;
	
	@Override
	public IUserService getUserService() {
		return userService;
	}

	@Override
	public IFeatureService getFeatureService() {
		return featureSrevice;
	}

	@Override
	public IPermissionService getPermissionService() {
		return permissionService;
	}

}
