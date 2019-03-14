package com.iv.rewardpoint.friend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iv.rewardpoint.friend.pojo.NoFriend;

public interface NoFriendDao extends JpaRepository<NoFriend, String> {
	NoFriend findByUseridAndFriendid(String userid, String friendid);
}
