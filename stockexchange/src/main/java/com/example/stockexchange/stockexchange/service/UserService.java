package com.example.stockexchange.stockexchange.service;

import java.util.List;

import com.example.stockexchange.stockexchange.entity.Users;

public interface UserService {
	
	public void addUser(Users user);
	public void deleteUser(Users user);
	public List<Users> getAllUser();
	public Users updateUser(Users user);
	public Users getUserById(Integer id);
}
                                                