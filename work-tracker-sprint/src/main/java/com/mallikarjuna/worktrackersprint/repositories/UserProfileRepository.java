package com.mallikarjuna.worktrackersprint.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mallikarjuna.worktrackersprint.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

	Optional<UserProfile> findByUserNameAndPassword(String userName, String password);

	@Query(value = "select * from user_profile where user_name=?1 OR email_id=?2", nativeQuery = true)
	List<UserProfile> checkUserNameOrEmailPresent(String userName, String email);
}
