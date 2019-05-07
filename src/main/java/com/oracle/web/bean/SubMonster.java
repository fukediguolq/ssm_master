package com.oracle.web.bean;

public class SubMonster extends Monster {

	
	public School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "SubMonster [school=" + school + "]";
	}
	
}
