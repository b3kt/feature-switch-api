package com.github.b3kt.sampleapi.service;

public interface IServiceLocator {

	IUserService getUserService();
	
	IFeatureService getFeatureService();
	
	IPermissionService getPermissionService();
	
}
