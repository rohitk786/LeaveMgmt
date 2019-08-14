package com.spring.leaveManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.leaveManagement.domain.PublicHolidays;

@Repository
public interface PublicHolidaysRepository extends MongoRepository<PublicHolidays, String>{

}
