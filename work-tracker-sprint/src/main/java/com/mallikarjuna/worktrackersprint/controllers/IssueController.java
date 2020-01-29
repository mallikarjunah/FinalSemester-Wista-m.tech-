package com.mallikarjuna.worktrackersprint.controllers;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mallikarjuna.worktrackersprint.model.Issue;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/sprint")
public class IssueController {

	@PostMapping(path = "/createTask", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Issue createTask(@Valid @RequestBody Issue issue) {
		return null;
	}
}
