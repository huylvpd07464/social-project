package com.social.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.social.models.Reel;

public interface ReelRepository extends JpaRepository<Reel, Integer> {

	public List<Reel> findByUserId(Integer userId);
}
