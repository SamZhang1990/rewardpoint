package com.iv.rewardpoint.recruit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.iv.rewardpoint.recruit.pojo.Recruit;

public interface RecruitDao extends JpaRepository<Recruit, String>, JpaSpecificationExecutor<Recruit> {
	public List<Recruit> findTop6ByStateOrderByCreatetimeDesc(String state);
	
	public List<Recruit> findTop6ByStateNotOrderByCreatetimeDesc(String state);
}
