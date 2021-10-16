package com.example.stockexchange.stockexchange.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.stockexchange.stockexchange.entity.Users;


public interface UserRepository extends CrudRepository<Users,Integer>{

}
