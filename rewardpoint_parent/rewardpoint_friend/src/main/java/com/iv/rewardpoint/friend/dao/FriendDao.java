package com.iv.rewardpoint.friend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.iv.rewardpoint.friend.pojo.Friend;

public interface FriendDao extends JpaRepository<Friend, String> {

	public Friend findByUseridAndFriendid(String userid, String friendid);

	@Modifying
	@Query(value = "update tb_friend set islike = ?1 where userid = ?2 and friendid = ?3 ", nativeQuery = true)
	public void updateIslike(String islike, String userid, String friendid);

	@Modifying
	@Query(value = "delete from tb_friend where userid = ?1 and friendid = ?2 ", nativeQuery = true)
	public void deleteFriend(String userid, String friendid);
	
}
