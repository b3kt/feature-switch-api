package com.github.b3kt.sampleapi.service;

import com.github.b3kt.sampleapi.entity.User;

public interface IUserService {
    
    User findUserByEmail(String email);

    Boolean checkHasPermission(String email, String featureName);
}
