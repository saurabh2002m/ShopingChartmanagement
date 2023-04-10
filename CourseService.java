package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.Entity.Course;

@Service
public interface CourseService {
	public List<Course> getAllCourses();
	public Course findCourseBYID(int course_id);
	public void DeleteCourseBYID(int course_id);
	public Course ADDCourse(Course course);
	public Course UpdateCourse(Course course);
}
