package com.mallikarjuna.worktrackersprint.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallikarjuna.worktrackersprint.exception.NotFoundException;
import com.mallikarjuna.worktrackersprint.exception.RecordPresent;
import com.mallikarjuna.worktrackersprint.model.UserProfile;
import com.mallikarjuna.worktrackersprint.repositories.UserProfileRepository;
import com.mallikarjuna.worktrackersprint.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepo;

	@Override
	public UserProfile createUserProfile(UserProfile userProfile) {
		List<UserProfile> checkUserNamePresent = userProfileRepo.checkUserNameOrEmailPresent(userProfile.getUserName(),
				null);
		if (checkUserNamePresent != null) {
			throw new RecordPresent("UserName is present", " Please try with different userName");
		}
		List<UserProfile> checkEmailPresent = userProfileRepo.checkUserNameOrEmailPresent(null,
				userProfile.getEmailId());
		if (checkEmailPresent != null) {
			throw new RecordPresent("emailId is present", " Please try with different emailId");
		}
		UserProfile profile = userProfileRepo.save(userProfile);
		return profile;
	}

	@Override
	public UserProfile updateUserProfile(Long id, UserProfile userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfile getUserProfile(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserProfile(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserProfile authenticateUser(String userName, String password) {
		Optional<UserProfile> profile = userProfileRepo.findByUserNameAndPassword(userName, password);
		if (!profile.isPresent()) {
			throw new NotFoundException("User not found.");
		}
		return profile.get();
	}

}
