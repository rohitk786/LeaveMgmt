package com.spring.leaveManagement.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.leaveManagement.domain.UserLeave;
import com.spring.leaveManagement.service.UserLeaveService;

@RestController
@RequestMapping("/api/")
public class UserLeaveController {

	@Autowired
	UserLeaveService userLeaveService;
	
	@GetMapping("/userLeaveById/{id}")
	public Optional<UserLeave> findById(@PathVariable String id) {
		
		return userLeaveService.findById(id);
	}
	
	@PostMapping("/userLeaveSavingData")
	public void save(@RequestBody UserLeave entity) {
		userLeaveService.save(entity);
		
	}
	
	@GetMapping("/userLeaveData")
	public List<UserLeave> findAll() {
		
		return userLeaveService.findAll();
	}
	
}
