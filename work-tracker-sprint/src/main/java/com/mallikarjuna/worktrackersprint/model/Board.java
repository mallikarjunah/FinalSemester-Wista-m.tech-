package com.mallikarjuna.worktrackersprint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@SequenceGenerator(initialValue = 1, name = "board_seq_gen", sequenceName = "board_seq_gen")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq_gen")
	private Integer id;

	@NotBlank
	private String boardName;

	@NotNull
	private String projectName;

	public Board() {

	}

	public Board(Integer id, @NotBlank String boardName, @NotNull String projectName) {
		super();
		this.id = id;
		this.boardName = boardName;
		this.projectName = projectName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardName == null) ? 0 : boardName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		Board other = (Board) obj;
		if (boardName == null) {
			if (other.boardName != null)
				return false;
		} else if (!boardName.equals(other.boardName))
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
		return true;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", boardName=" + boardName + ", projectName=" + projectName + "]";
	}

}
