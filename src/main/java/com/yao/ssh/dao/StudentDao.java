package com.yao.ssh.dao;

import com.yao.ssh.model.Student;

public interface StudentDao {
	public void save(Student student);
	public Student get(String id);
}
