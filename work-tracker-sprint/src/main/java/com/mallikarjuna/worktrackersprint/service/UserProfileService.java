package com.mallikarjuna.worktrackersprint.service;

import com.mallikarjuna.worktrackersprint.model.UserProfile;

public interface UserProfileService {

	public UserProfile createUserProfile(UserProfile userProfile);

	public UserProfile updateUserProfile(Long id, UserProfile userProfile);

	public UserProfile getUserProfile(Long id);

	public void deleteUserProfile(Long id);

	public UserProfile authenticateUser(String userName, String password);
}
