package com.yao.ssh.service;

import com.yao.ssh.model.Student;

public interface StudentService {
	public Student get(String id);
	public void save(Student student);
}
