package com.app.pojos;

public class Meeting {
	private int startTime;
	private int endTime;
	@Override
	public String toString() {
		return "Meeting [startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public Meeting(int startTime, int endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}

}
