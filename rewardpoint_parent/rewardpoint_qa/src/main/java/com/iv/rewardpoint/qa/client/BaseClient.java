package com.iv.rewardpoint.qa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iv.rewardpoint.qa.client.impl.BaseClientImpl;

import entity.Result;

@FeignClient(value = "rewardpoint-base", fallback = BaseClientImpl.class)
public interface BaseClient {
	
	@RequestMapping(value = "/label/{labelId}", method = RequestMethod.GET)
	public Result findById(@PathVariable("labelId") String labelId);

}
