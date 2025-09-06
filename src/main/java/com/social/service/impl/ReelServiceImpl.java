package com.social.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.models.Reel;
import com.social.models.User;
import com.social.repository.ReelRepository;
import com.social.service.ReelService;
import com.social.service.UserService;

@Service
public class ReelServiceImpl implements ReelService {
	
	@Autowired
	private ReelRepository reelRepository;
	
	@Autowired
	private UserService userService;

	@Override
	public Reel createReel(Reel reel, User user) {
		Reel createReel = new Reel();
		createReel.setTitle(reel.getTitle());
		createReel.setUser(user);
		createReel.setVideo(reel.getVideo());
		
		return reelRepository.save(createReel);
	}

	@Override
	public List<Reel> findAllReels() {
		// TODO Auto-generated method stub
		return reelRepository.findAll();
	}

	@Override
	public List<Reel> findUsersReel(Integer userId) throws Exception {
		
		userService.findUserById(userId);
		return reelRepository.findByUserId(userId);
	}

}
