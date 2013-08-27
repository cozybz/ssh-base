package com.yao.ssh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yao.ssh.model.Student;
import com.yao.ssh.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	private StudentService studentService;

	@Resource(name="studentService")
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping("/{id}/get")
	public ModelAndView get(@PathVariable String id,HttpServletRequest request,HttpServletResponse response){
		Student student = studentService.get(id);
		HashMap<String, String> model = new HashMap<String, String>();
		model.put("id", student.getId());
		model.put("name", student.getName());
		return new ModelAndView("getStudent", "student", model);
	}
	
	
	@RequestMapping("/save")
	public ModelAndView save(Student student,HttpServletRequest request,HttpServletResponse response){
		return new ModelAndView("showStudents");
	}
	
}
