package com.mallikarjuna.worktrackersprint.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mallikarjuna.worktrackersprint.model.UserProfile;
import com.mallikarjuna.worktrackersprint.service.UserProfileService;

@RestController
@CrossOrigin
@RequestMapping("/sprint")
public class UserProfileController {

	@Autowired
	private UserProfileService profileService;

	@PostMapping(path = "/createUser")
	public UserProfile createUserProfile(@Valid @RequestBody UserProfile userProfile) {
		return profileService.createUserProfile(userProfile);
	}

	@GetMapping(path = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
	public UserProfile authenticate(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		return profileService.authenticateUser(userName, password);
	}
}
