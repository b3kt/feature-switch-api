package com.github.b3kt.sampleapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.b3kt.sampleapi.repository.FeatureRepository;
import com.github.b3kt.sampleapi.repository.PermissionRepository;
import com.github.b3kt.sampleapi.repository.UserRepository;
import com.github.b3kt.sampleapi.service.IRepositoryLocator;

@Service
public class RepositoryLocator implements IRepositoryLocator {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FeatureRepository featureRepository;

	@Autowired
	private PermissionRepository permissionRepository;

	@Override
	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Override
	public FeatureRepository getFeatureRespository() {
		return featureRepository;
	}

	@Override
	public PermissionRepository getPermissionRepository() {
		return permissionRepository;
	}

}
