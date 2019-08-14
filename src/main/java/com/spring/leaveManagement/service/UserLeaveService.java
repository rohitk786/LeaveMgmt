package com.spring.leaveManagement.service;

import java.util.List;
import java.util.Optional;

import com.spring.leaveManagement.domain.UserLeave;

public interface UserLeaveService {

	Optional<UserLeave> findById(String id);
	
	void save(UserLeave entity);
	
	List<UserLeave> findAll();
}
