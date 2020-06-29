package com.mvn.courseapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.mvn.courseapi.model.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> getCourseByName(String name);

    //public List<Course> findById(String id);
    
    public List<Course> findByTopicId(String topicId);

    public List<Course> getCourseByTopic(String topicId);
}