package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

public interface GoalRepository {
	Goal saveGoal(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();
}
