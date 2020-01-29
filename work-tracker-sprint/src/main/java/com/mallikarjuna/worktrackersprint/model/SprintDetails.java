package com.mallikarjuna.worktrackersprint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@SequenceGenerator(initialValue = 1, sequenceName = "sprint_seq_gen", name = "sprint_seq_gen")
public class SprintDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sprint_seq_gen")
	private Integer id;

	@Size(min = 5)
	private String sprintName;

	@Future
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;

	@Future
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDdate;

	private String projectName;

	private String boardName;

	public SprintDetails() {
	}

	public SprintDetails(Integer id, @Size(min = 5) String sprintName, @Future Date startDate, @Future Date endDdate,
			String projectName, String boardName) {
		super();
		this.id = id;
		this.sprintName = sprintName;
		this.startDate = startDate;
		this.endDdate = endDdate;
		this.projectName = projectName;
		this.boardName = boardName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSprintName() {
		return sprintName;
	}

	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDdate() {
		return endDdate;
	}

	public void setEndDdate(Date endDdate) {
		this.endDdate = endDdate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardName == null) ? 0 : boardName.hashCode());
		result = prime * result + ((endDdate == null) ? 0 : endDdate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((sprintName == null) ? 0 : sprintName.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SprintDetails other = (SprintDetails) obj;
		if (boardName == null) {
			if (other.boardName != null)
				return false;
		} else if (!boardName.equals(other.boardName))
			return false;
		if (endDdate == null) {
			if (other.endDdate != null)
				return false;
		} else if (!endDdate.equals(other.endDdate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (sprintName == null) {
			if (other.sprintName != null)
				return false;
		} else if (!sprintName.equals(other.sprintName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SprintDetails [id=" + id + ", sprintName=" + sprintName + ", startDate=" + startDate + ", endDdate="
				+ endDdate + ", projectName=" + projectName + ", boardName=" + boardName + "]";
	}

}
