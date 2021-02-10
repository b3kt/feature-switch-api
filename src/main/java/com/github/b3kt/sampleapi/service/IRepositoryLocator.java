package com.github.b3kt.sampleapi.service;

import com.github.b3kt.sampleapi.repository.FeatureRepository;
import com.github.b3kt.sampleapi.repository.PermissionRepository;
import com.github.b3kt.sampleapi.repository.UserRepository;

public interface IRepositoryLocator {
	
	UserRepository getUserRepository();
	
	FeatureRepository getFeatureRespository();
	
	PermissionRepository getPermissionRepository();

}
