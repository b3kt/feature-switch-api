package com.github.b3kt.sampleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.github.b3kt.sampleapi.entity.Permission;
import com.github.b3kt.sampleapi.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findUserByEmail(String email);

	@Query("SELECT p FROM User u " +
		" JOIN Permission p ON p.user = u " +
		" JOIN Feature f ON f = p.feature " +
		" WHERE u.email = :email AND f.name = :featureName ")
	Optional<Permission> checkHasPermission(@Param("email") String email, @Param("featureName") String featureName);
}
