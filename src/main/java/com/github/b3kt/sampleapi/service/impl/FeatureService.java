package com.github.b3kt.sampleapi.service.impl;

import org.springframework.stereotype.Service;

import com.github.b3kt.sampleapi.entity.Feature;
import com.github.b3kt.sampleapi.service.IFeatureService;

@Service
public class FeatureService extends BaseService implements IFeatureService {

    @Override
    public Feature findFeatureByName(String featureName) {
        return repositoryLocator.getFeatureRespository().findFeatureByName(featureName).orElse(null);
    }

}
