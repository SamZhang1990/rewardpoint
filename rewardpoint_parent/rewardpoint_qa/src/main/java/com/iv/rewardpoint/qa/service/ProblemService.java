package com.iv.rewardpoint.qa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.iv.rewardpoint.qa.client.BaseClient;
import com.iv.rewardpoint.qa.dao.ProblemDao;
import com.iv.rewardpoint.qa.pojo.Problem;

import util.IdWorker;

@Service
@Transactional
public class ProblemService {

	@Autowired
	private ProblemDao problemDao;
	
	@Autowired
	private IdWorker idWorker;
	
	@Autowired
	private BaseClient baseClient;
	
	public Page<Problem> newList(String labelId, int page, int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		return problemDao.newList(labelId, pageable);
	}
	
	public Page<Problem> hotList(String labelId, int page, int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		return problemDao.hotList(labelId, pageable);
	}
	
	public Page<Problem> waitList(String labelId, int page, int size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		return problemDao.waitList(labelId, pageable);
	}

	@Transactional
	@TxTransaction
	public List<Problem> findAll() {
		baseClient.findById("1");
		return problemDao.findAll();
	}

	public Problem findById(String problemId) {
		return problemDao.findById(problemId).get();
	}

	public void save(Problem problem) {
		problem.setId(idWorker.nextId() + "");
		problemDao.save(problem);
	}

	public void update(Problem problem) {
		problemDao.save(problem);
	}

	public void deleteById(String problemId) {
		problemDao.deleteById(problemId);
	}
	
	
}
