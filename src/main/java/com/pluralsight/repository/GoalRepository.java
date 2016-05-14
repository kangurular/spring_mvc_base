package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;

public interface GoalRepository {
	Goal saveGoal(Goal goal);

	List<Goal> loadAll();
}
