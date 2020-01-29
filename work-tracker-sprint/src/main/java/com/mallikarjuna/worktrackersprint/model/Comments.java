package com.mallikarjuna.worktrackersprint.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Mallikarjuna H
 *
 */
public class Comments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String comment;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private Date commentedAt;

	@NotNull
	private String commentedBy;

	public Comments() {

	}

	public Comments(@NotNull String comment, Date commentedAt, @NotNull String commentedBy) {
		super();
		this.comment = comment;
		this.commentedAt = commentedAt;
		this.commentedBy = commentedBy;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentedAt() {
		return commentedAt;
	}

	public void setCommentedAt(Date commentedAt) {
		this.commentedAt = commentedAt;
	}

	public String getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((commentedAt == null) ? 0 : commentedAt.hashCode());
		result = prime * result + ((commentedBy == null) ? 0 : commentedBy.hashCode());
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
		Comments other = (Comments) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (commentedAt == null) {
			if (other.commentedAt != null)
				return false;
		} else if (!commentedAt.equals(other.commentedAt))
			return false;
		if (commentedBy == null) {
			if (other.commentedBy != null)
				return false;
		} else if (!commentedBy.equals(other.commentedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comments [comment=" + comment + ", commentedAt=" + commentedAt + ", commentedBy=" + commentedBy + "]";
	}

}
