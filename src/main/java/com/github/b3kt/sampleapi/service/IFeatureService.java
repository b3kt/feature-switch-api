package com.github.b3kt.sampleapi.service;

import com.github.b3kt.sampleapi.entity.Feature;

public interface IFeatureService {

	Feature findFeatureByName(String featureName);

}
