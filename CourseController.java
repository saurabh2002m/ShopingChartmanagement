package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Course;
import com.example.Service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping(value="/getcourses")
	public List<Course> getAllCourse(){
		return courseService.getAllCourses();
		
	}
	@PostMapping(value="/postcourse")
	public Course addcourse(@RequestBody Course course) {
		return courseService.ADDCourse(course);
	}
	@GetMapping(value = "/getcourse/{course_id}")
	public Course GetCourseBYID(@PathVariable int course_id) {
		return courseService.findCourseBYID(course_id);
	}
	@PutMapping(value="/updatecourse")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.UpdateCourse(course);
	}
	@DeleteMapping(value="/deletecourse/{course_id}")
	public String DeleteCourseByID(@PathVariable int course_id) {
		courseService.DeleteCourseBYID(course_id);
		return "Course Deleted";
	}
}
