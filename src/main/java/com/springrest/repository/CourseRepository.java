package com.springrest.repository;

import java.util.List;

import com.springrest.model.Course;

public interface CourseRepository {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
