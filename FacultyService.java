package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Faculty;

@Service
public interface FacultyService {
	public List<Faculty> getAllfaculty();
	public Faculty findfacultyBYID(int faculty_id);
	public void DeletefacultyBYID(int faculty_id);
	public Faculty ADDfaculty(Faculty faculty);
	public Faculty Updatefaculty(Faculty faculty);
}
