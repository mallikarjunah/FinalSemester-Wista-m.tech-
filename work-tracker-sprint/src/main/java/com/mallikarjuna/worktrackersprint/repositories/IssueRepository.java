package com.mallikarjuna.worktrackersprint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mallikarjuna.worktrackersprint.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {

}