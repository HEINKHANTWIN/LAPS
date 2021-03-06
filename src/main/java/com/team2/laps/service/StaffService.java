package com.team2.laps.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team2.laps.model.User;
import com.team2.laps.repository.LeaveRepository;
import com.team2.laps.repository.UserRepository;

@Service
public class StaffService {
	
	private static final Logger logger = LoggerFactory.getLogger(LeaveService.class);

    @Autowired
    LeaveRepository leaveRepository;

    @Autowired
    UserRepository userRepository;
    
	public boolean saveStaff(User user) {
		if (userRepository.save(user)!=null) return true; else return false;
	}
	
	public void deleteStaff(Long userId) {
		userRepository.deleteById(userId);
	}
	
	public ArrayList<String> findAllStaffNames() {
		return userRepository.findAllStaffNames();
	}
	
	public User findStaffById(Long userId) {
		return userRepository.findById(userId).get();
	}
	
	public User findStaffByName(String name) {
		return userRepository.findByName(name).get();
	}
}
