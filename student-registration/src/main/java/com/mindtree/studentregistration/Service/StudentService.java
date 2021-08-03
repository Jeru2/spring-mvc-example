package com.mindtree.studentregistration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.studentregistration.model.Hobby;
import com.mindtree.studentregistration.model.Student;
import com.mindtree.studentregistration.repository.StudentRepository;

@Service
public class StudentService
{
	@Autowired
	StudentRepository stuRepo;
	
	@Autowired
	HobbyService hobbyServ;
	
	public Student addHobby(Student student)
	{
		List<Hobby> hobbyList = new ArrayList<Hobby>();
		for(String hb : student.getHobbyNames())
		{
			Hobby hob = new Hobby(hb);
			hobbyList.add(hob);
		}
		student.setHobbies(hobbyList);
		return student;
	}
	
	public void addStudent(Student student)
	{	
		/*
		for(Hobby h : student.getHobbies())
		{
			//if(hobbyServ.checkIfHobbyExists(h.getName()))
			{
				Hobby current = hobbyServ.returnHobbyByName(h.getId());
				List<Hobby> rep = student.getHobbies();
				rep.remove(h);
				rep.add(current);
			}
		}
		*/
		
		stuRepo.save(student);
	}
}
