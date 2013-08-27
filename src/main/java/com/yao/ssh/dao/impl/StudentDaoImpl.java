package com.yao.ssh.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yao.ssh.dao.StudentDao;
import com.yao.ssh.model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public Student get(String id) {
		return (Student)sessionFactory.getCurrentSession().get(Student.class ,id);
	}

}
