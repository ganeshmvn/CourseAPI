package com.mvn.courseapi.service;

import java.util.List;

import com.mvn.courseapi.model.Course;

public interface CourseService {
	
	public List<Course> getAllCourses();
	
	 public List<Course> getAllCourses(String topicId);

	    public Course getCourse(String id) ;

	    public boolean addCourse(Course course) ;

	    public void updateCourse(Course course) ;

	    public void deleteCourse(String id);
}
