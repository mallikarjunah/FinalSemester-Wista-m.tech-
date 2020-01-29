package com.mallikarjuna.worktrackersprint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description = "project details")
@SequenceGenerator(initialValue = 1, name = "project_seq", sequenceName = "project_seq")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq")
	private Integer id;

	@Column(unique = true)
	private String projectName;

	public Project() {
	}

	public Project(Integer id, String projectName) {
		super();
		this.id = id;
		this.projectName = projectName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
