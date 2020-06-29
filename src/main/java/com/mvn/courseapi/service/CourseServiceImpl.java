package com.mvn.courseapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvn.courseapi.model.Course;
import com.mvn.courseapi.repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public boolean addCourse(Course course) {
		courseRepository.save(course);

		List<Course> courses = courseRepository.getCourseByName(course.getName());
		
		if (courses.size() > 0) {
			return false;
		}

		courseRepository.save(course);

		return true;
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		Course aCourse = getCourse(id);
		courseRepository.delete(aCourse);
	}
}