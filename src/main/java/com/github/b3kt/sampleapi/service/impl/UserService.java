package com.github.b3kt.sampleapi.service.impl;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.github.b3kt.sampleapi.entity.Permission;
import com.github.b3kt.sampleapi.entity.User;
import com.github.b3kt.sampleapi.service.IUserService;

@Service
public class UserService extends BaseService implements IUserService {

    @Override
    public User findUserByEmail(String email) {
        return repositoryLocator.getUserRepository().findUserByEmail(email).orElse(null);
    }

    @Override
    public Boolean checkHasPermission(String email, String featureName) {
        Optional<Permission> permission = repositoryLocator.getUserRepository().checkHasPermission(email, featureName);
        logger.info("permission {} ", permission);
        
        if(permission.isPresent()){
           return permission.get().getCanAccess();
        }
        return Boolean.FALSE;
    }

}
