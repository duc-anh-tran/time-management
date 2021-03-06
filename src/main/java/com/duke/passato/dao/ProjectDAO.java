package com.duke.passato.dao;

import java.math.BigDecimal;
import java.util.List;

import com.duke.passato.model.Project;

public interface ProjectDAO {

	public List<Project> listProjects();

	public List<Project> listRecentProjects(int number);

	public List<Project> listProject(Integer pageNumber, Integer maxResultsPerPage);

	public void insertProject(Project project);

	public Project findProjectById(Integer projectId);

	public void updateProject(Project project);

	public void deleteProject(Project project);

	public BigDecimal calculateAverageProgress();

	public List<Object> calculateProjectDurationByTaskType(Project project);

	public Object calculateProjectDuration(Project project);

	public Long getProjectCount();

}
