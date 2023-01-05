package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.model.Course;
import com.springrest.repository.CourseRepository;

@Service
public class CourseService implements CourseRepository{
	
	List<Course> list;
	
	public CourseService() {
		
		list=new ArrayList<>();
		list.add(new Course(145,"Java Course","this is java course"));
		list.add(new Course(123,"Python","this is python course"));
		list.add(new Course(456,"spring boot","this is course on spring boot"));
	}
	

	@Override
	public List<Course> getCourses() {
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c =null;
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
