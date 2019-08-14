package com.spring.leaveManagement.service;

import java.util.List;
import java.util.Optional;

import com.spring.leaveManagement.domain.LeaveHistory;

public interface LeaveHistoryService {

	List<LeaveHistory> findAll();
	public void save(LeaveHistory history);
	Optional<LeaveHistory> findById(String id);
	
}
