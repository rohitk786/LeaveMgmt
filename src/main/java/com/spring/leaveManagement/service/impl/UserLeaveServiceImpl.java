package com.spring.leaveManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.leaveManagement.domain.UserLeave;
import com.spring.leaveManagement.repository.UserLeaveRepository;
import com.spring.leaveManagement.service.UserLeaveService;

@Service
public class UserLeaveServiceImpl implements UserLeaveService{

	@Autowired
	UserLeaveRepository userLeaveRepository;
	
	@Override
	public Optional<UserLeave> findById(String id) {
		
		return userLeaveRepository.findById(id);
	}

	@Override
	public void save(UserLeave entity) {
		userLeaveRepository.save(entity);
		
	}

	@Override
	public List<UserLeave> findAll() {
		
		return userLeaveRepository.findAll();
	}

}
