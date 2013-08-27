package com.yao.ssh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yao.ssh.dao.StudentDao;
import com.yao.ssh.model.Student;
import com.yao.ssh.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	
	@Resource(name="studentDao")
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Student get(String id) {
		return studentDao.get(id);
	}

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}

}
