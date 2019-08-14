package com.spring.leaveManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.leaveManagement.domain.LeaveHistory;
import com.spring.leaveManagement.repository.LeaveHistoryRepository;
import com.spring.leaveManagement.service.LeaveHistoryService;

@Service
public class LeaveHistoryServiceImpl implements LeaveHistoryService{

	@Autowired
	LeaveHistoryRepository leaveHistoryRepository;
	
	@Override
	public List<LeaveHistory> findAll() {
		return leaveHistoryRepository.findAll();
	}

	@Override
	public void save(LeaveHistory history) {
		leaveHistoryRepository.save(history);
		
	}

	@Override
	public Optional<LeaveHistory> findById(String id) {
		return leaveHistoryRepository.findById(id);
	}

}
