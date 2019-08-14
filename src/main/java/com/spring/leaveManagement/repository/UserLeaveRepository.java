package com.spring.leaveManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.leaveManagement.domain.UserLeave;

@Repository
public interface UserLeaveRepository extends MongoRepository<UserLeave, String>{

}
