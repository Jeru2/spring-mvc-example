package com.mindtree.studentregistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.studentregistration.model.Hobby;
import com.mindtree.studentregistration.repository.HobbyRepository;

@Service
public class HobbyService
{
	@Autowired
	StudentService stuServ;
	
	@Autowired
	HobbyRepository hobbyRepo;
	/*
	public boolean checkIfHobbyExists(String hobby)
	{
		if(hobbyRepo.findByName(hobby))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	*/
	public Hobby returnHobbyByName(int id)
	{
		return hobbyRepo.getById(id);
	}
}
