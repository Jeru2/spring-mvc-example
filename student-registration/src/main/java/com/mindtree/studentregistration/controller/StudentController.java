package com.mindtree.studentregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.studentregistration.Service.StudentService;
import com.mindtree.studentregistration.model.Hobby;
import com.mindtree.studentregistration.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentService stuServ;

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @GetMapping("/registration")
   public String registrationRedirect(ModelMap studentModel)
   {
	   studentModel.addAttribute("student", new Student());	  
	   studentModel.addAttribute("hobby", new Hobby());
	   return "registration";
   }
   @PostMapping("/success")
   public String sayHello(@ModelAttribute("registeredStudent") Student student) {
	   
	   Student stu = stuServ.addHobby(student);
	   stuServ.addStudent(stu);
      return "success";
   }
}
