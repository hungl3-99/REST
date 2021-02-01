package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long>{

}
