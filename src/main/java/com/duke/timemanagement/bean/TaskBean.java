package com.duke.timemanagement.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.duke.timemanagement.common.Constant;

public class TaskBean {
	private Integer taskId;
	private Integer projectId;
	private Integer taskTypeId;
	private String name;
	private Double estimatedDuration;
	private Double actualDuration;
	@DateTimeFormat(pattern = Constant.FORMAT_DATE)
	private Date deadlineDate;
	@DateTimeFormat(pattern = Constant.FORMAT_TIME)
	private Date deadlineTime;
	private String note;
	private Double completedPercentage;
	private Boolean isFinished;

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getTaskTypeId() {
		return this.taskTypeId;
	}

	public void setTaskTypeId(Integer taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getEstimatedDuration() {
		return this.estimatedDuration;
	}

	public void setEstimatedDuration(Double estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	public Double getActualDuration() {
		return this.actualDuration;
	}

	public void setActualDuration(Double actualDuration) {
		this.actualDuration = actualDuration;
	}

	public Date getDeadlineDate() {
		return this.deadlineDate;
	}

	public void setDeadlineDate(Date deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public Date getDeadlineTime() {
		return this.deadlineTime;
	}

	public void setDeadlineTime(Date deadlineTime) {
		this.deadlineTime = deadlineTime;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Double getCompletedPercentage() {
		return this.completedPercentage;
	}

	public void setCompletedPercentage(Double completedPercentage) {
		this.completedPercentage = completedPercentage;
	}

	public Boolean getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
}
