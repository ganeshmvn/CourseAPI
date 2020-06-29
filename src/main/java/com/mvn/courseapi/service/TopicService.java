package com.mvn.courseapi.service;

import java.util.List;

import com.mvn.courseapi.model.Topic;

public interface TopicService {
	
	public List<Topic> getAllTopics();

	public Topic getTopic(String id);

	public boolean addTopic(Topic topic);

	public void updateTopic(String id, Topic topic);

	public void deleteTopic(String id);
}
