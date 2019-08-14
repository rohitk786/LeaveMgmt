package com.spring.leaveManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.leaveManagement.domain.LeaveHistory;

@Repository
public interface LeaveHistoryRepository extends MongoRepository<LeaveHistory, String>{

}
