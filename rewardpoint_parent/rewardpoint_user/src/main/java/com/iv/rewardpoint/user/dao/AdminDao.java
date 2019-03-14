package com.iv.rewardpoint.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.iv.rewardpoint.user.pojo.Admin;

public interface AdminDao extends JpaRepository<Admin, String>, JpaSpecificationExecutor<Admin> {

	Admin findByLoginname(String loginname);

}
