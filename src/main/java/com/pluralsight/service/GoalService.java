package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

public interface GoalService {
	Goal saveGoal(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> finalAllGoalReports();
}
