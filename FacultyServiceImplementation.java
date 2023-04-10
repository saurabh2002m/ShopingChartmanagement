package com.example.Service.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Faculty;
import com.example.Repository.FacultyRepository;
import com.example.Service.FacultyService;
@Repository
public class FacultyServiceImplementation implements FacultyService{
	@Autowired
	FacultyRepository facultyRepository;

	@Override
	public List<Faculty> getAllfaculty() {
		// TODO Auto-generated method stub
		return facultyRepository.findAll();
	}

	@Override
	public Faculty findfacultyBYID(int faculty_id) {
		// TODO Auto-generated method stub
		return facultyRepository.findById(faculty_id).get();
	}

	@Override
	public void DeletefacultyBYID(int faculty_id) {
		// TODO Auto-generated method stub
		facultyRepository.deleteById(faculty_id);
	}

	@Override
	public Faculty ADDfaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepository.save(faculty);
	}

	@Override
	public Faculty Updatefaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		Faculty update_faculty=facultyRepository.findById(faculty.getFaculty_id()).get();
		update_faculty.setFaculty_name(update_faculty.getFaculty_name());
		update_faculty.setCourses(faculty.getCourses());
		return update_faculty;
	}
	

}
