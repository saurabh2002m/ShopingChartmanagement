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

import com.example.Entity.Faculty;
import com.example.Service.FacultyService;

@RestController
public class FacultyController {
	@Autowired
	FacultyService facultyService;
	@PostMapping(value="/postfaculty")
	public Faculty addfaculty(@RequestBody Faculty faculty) {
		return facultyService.ADDfaculty(faculty);
		
	}
	@GetMapping(value="/getfacultys")
	public List<Faculty> getAllFaculty(){
		return facultyService.getAllfaculty();
		
	}
	@DeleteMapping(value="/deletefaculty/{faculty_id}")
	public String DeleteFaculty(@PathVariable int faculty_id) {
		facultyService.DeletefacultyBYID(faculty_id);
		return "Faculty is Deleted";
	}
	@PutMapping(value="/updatefaculty")
	public Faculty updateFaculty(@RequestBody Faculty faculty){
		
		return facultyService.Updatefaculty(faculty);
		
	}
	@GetMapping(value="/getfaculty/{faculty_id}")
	public Faculty GetFacUltyBYid(@PathVariable int faculty_id) {
		return facultyService.findfacultyBYID(faculty_id);
	}
}
