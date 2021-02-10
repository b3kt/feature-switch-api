package com.github.b3kt.sampleapi.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.b3kt.sampleapi.service.IRepositoryLocator;
import com.github.b3kt.sampleapi.service.IServiceLocator;

public class BaseService {
	
	protected Logger logger = LoggerFactory.getLogger(BaseService.class);
	
	@Autowired
	protected IRepositoryLocator repositoryLocator;

	@Autowired
	protected IServiceLocator serviceLocator;

}
