package com.mallikarjuna.worktrackersprint.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Mallikarjuna H
 *
 */
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "issue_seq", sequenceName = "issue_seq")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonStringType.class),
		@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class) })
public class Issue implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "issue_seq")
	@ApiModelProperty(example = "1")
	private Long id;

	@NotNull
	@ApiModelProperty(example = "summary for the issue.")
	private String summary;

	@ApiModelProperty(example = "description of the issue we are about to create")
	private String description;

	@NotNull
	@ApiModelProperty(example = "Mallikarjuna Ltd")
	private String projectName;

	@ApiModelProperty(example = "Mallikarjuna board")
	private String boardName;

	@NotNull
	private String priority;

	private String linkedBy;

	@NotNull
	private String issueType;

	@NotNull
	private String assignee;

	private Double estimatedHours;

	private Double remainingHours;

	private Double hoursSpent;

	@NotNull
	private String createdBy;

	@CreatedDate
	@Column(updatable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	@ApiModelProperty(example = "dd-MM-yyyy HH:mm:ss")
	private Date createdAt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private Date updatedAt;

	private String status;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private List<Comments> comments;

	public Issue() {
	}

	public Issue(Long id, @NotNull String summary, String description, @NotNull String projectName, String boardName,
			@NotNull String priority, String linkedBy, @NotNull String issueType, @NotNull String assignee,
			Double estimatedHours, Double remainingHours, Double hoursSpent, @NotNull String createdBy, Date createdAt,
			Date updatedAt, String status, List<Comments> comments) {
		super();
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.projectName = projectName;
		this.boardName = boardName;
		this.priority = priority;
		this.linkedBy = linkedBy;
		this.issueType = issueType;
		this.assignee = assignee;
		this.estimatedHours = estimatedHours;
		this.remainingHours = remainingHours;
		this.hoursSpent = hoursSpent;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getLinkedBy() {
		return linkedBy;
	}

	public void setLinkedBy(String linkedBy) {
		this.linkedBy = linkedBy;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public Double getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(Double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public Double getRemainingHours() {
		return remainingHours;
	}

	public void setRemainingHours(Double remainingHours) {
		this.remainingHours = remainingHours;
	}

	public Double getHoursSpent() {
		return hoursSpent;
	}

	public void setHoursSpent(Double hoursSpent) {
		this.hoursSpent = hoursSpent;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignee == null) ? 0 : assignee.hashCode());
		result = prime * result + ((boardName == null) ? 0 : boardName.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((estimatedHours == null) ? 0 : estimatedHours.hashCode());
		result = prime * result + ((hoursSpent == null) ? 0 : hoursSpent.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((issueType == null) ? 0 : issueType.hashCode());
		result = prime * result + ((linkedBy == null) ? 0 : linkedBy.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((remainingHours == null) ? 0 : remainingHours.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
		Issue other = (Issue) obj;
		if (assignee == null) {
			if (other.assignee != null)
				return false;
		} else if (!assignee.equals(other.assignee))
			return false;
		if (boardName == null) {
			if (other.boardName != null)
				return false;
		} else if (!boardName.equals(other.boardName))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (estimatedHours == null) {
			if (other.estimatedHours != null)
				return false;
		} else if (!estimatedHours.equals(other.estimatedHours))
			return false;
		if (hoursSpent == null) {
			if (other.hoursSpent != null)
				return false;
		} else if (!hoursSpent.equals(other.hoursSpent))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (issueType == null) {
			if (other.issueType != null)
				return false;
		} else if (!issueType.equals(other.issueType))
			return false;
		if (linkedBy == null) {
			if (other.linkedBy != null)
				return false;
		} else if (!linkedBy.equals(other.linkedBy))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (remainingHours == null) {
			if (other.remainingHours != null)
				return false;
		} else if (!remainingHours.equals(other.remainingHours))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Issue [id=" + id + ", summary=" + summary + ", description=" + description + ", projectName="
				+ projectName + ", boardName=" + boardName + ", priority=" + priority + ", linkedBy=" + linkedBy
				+ ", issueType=" + issueType + ", assignee=" + assignee + ", estimatedHours=" + estimatedHours
				+ ", remainingHours=" + remainingHours + ", hoursSpent=" + hoursSpent + ", createdBy=" + createdBy
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", status=" + status + ", comments="
				+ comments + "]";
	}

}