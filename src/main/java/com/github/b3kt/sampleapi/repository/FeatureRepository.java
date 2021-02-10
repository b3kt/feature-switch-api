package com.github.b3kt.sampleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.github.b3kt.sampleapi.entity.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long>{

	Optional<Feature> findFeatureByName(String featureName);

}
