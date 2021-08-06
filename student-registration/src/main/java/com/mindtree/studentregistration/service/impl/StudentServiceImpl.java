package com.mindtree.studentregistration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.studentregistration.model.Student;
import com.mindtree.studentregistration.repository.StudentRepository;
import com.mindtree.studentregistration.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository stuRepo;
	
	
	@Override
	public void addStudent(Student student)
	{	
		stuRepo.save(student);
	}
}
