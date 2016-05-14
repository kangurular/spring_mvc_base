package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Goal;

public interface GoalService {
	Goal saveGoal(Goal goal);

	List<Goal> findAllGoals();
}
