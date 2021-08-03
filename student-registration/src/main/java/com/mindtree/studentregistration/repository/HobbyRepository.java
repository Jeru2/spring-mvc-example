package com.mindtree.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.studentregistration.model.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Integer>
{
	boolean findByName(String hobby);
}
