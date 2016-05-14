package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;

	@Transactional
	public Goal saveGoal(Goal goal) {
		return goalRepository.save(goal);
	}

	@Transactional
	public List<Goal> findAllGoals() {
		return goalRepository.findAll();
	}

	@Override
	public List<GoalReport> finalAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}
