package com.social.service;

import java.util.List;

import com.social.models.Reel;
import com.social.models.User;

public interface ReelService {
	
	public Reel createReel(Reel reel, User user);
	
	public List<Reel> findAllReels();
	
	public List<Reel> findUsersReel(Integer UserId) throws Exception;
}
