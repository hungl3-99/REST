package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.User;

public interface UserRepository extends CrudRepository<User , String>{

}
