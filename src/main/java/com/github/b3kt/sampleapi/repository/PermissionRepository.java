package com.github.b3kt.sampleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.github.b3kt.sampleapi.entity.Feature;
import com.github.b3kt.sampleapi.entity.Permission;
import com.github.b3kt.sampleapi.entity.User;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    @Query("SELECT p FROM User u " +
		" JOIN Permission p ON p.user = u " +
		" JOIN Feature f ON f = p.feature " +
		" WHERE u = :user AND f = :feature ")
	Optional<Permission> findByUserAndFeature(@Param("user") User user, @Param("feature") Feature feature);

}
