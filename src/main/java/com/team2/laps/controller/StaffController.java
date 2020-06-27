package com.team2.laps.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team2.laps.model.User;
import com.team2.laps.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

	@Autowired
	StaffService sService;
	
	@GetMapping("/list")
	public ArrayList<String> staffList() {
		return sService.findAllStaffNames();
	}
	
	@DeleteMapping("/delete/{id}")
	public ArrayList<String> deleteStaff(@PathVariable Long id) {
		sService.deleteStaff(id);
		return sService.findAllStaffNames();
	}
}