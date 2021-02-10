package com.github.b3kt.sampleapi.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

import com.github.b3kt.sampleapi.entity.Feature;
import com.github.b3kt.sampleapi.entity.Permission;
import com.github.b3kt.sampleapi.entity.User;
import com.github.b3kt.sampleapi.service.IPermissionService;

@Service
public class PermissionService extends BaseService implements IPermissionService {

    @Override
    public Permission changeUserAccess(String email, String featureName, Boolean status) {
        
        User user = serviceLocator.getUserService().findUserByEmail(email);
        if(user != null){
            Feature feature = serviceLocator.getFeatureService().findFeatureByName(featureName);
            if(feature != null){
                Optional<Permission> permission = repositoryLocator.getPermissionRepository().findByUserAndFeature(user, feature);

                Permission perm = permission.orElse(new Permission()); 
                perm.setCanAccess(status);
                perm.setUser(user);
                perm.setFeature(feature);

                perm.setCreatedBy("System");
                perm.setCreatedDate(new Date());
                perm.setLastModifiedBy("System");
                perm.setLastModifiedDate(new Date());

                return repositoryLocator.getPermissionRepository().save(perm);
            }
        }        
        return null;
    }

}
