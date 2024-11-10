package com.jsp.project;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.project.config.StudentConfig;
import com.jsp.project.dao.StudentDao;
import com.jsp.project.entity.Student;

public class B {
	@Autowired
	private EntityManagerFactory EntityManagerFactory;

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao dao=ac.getBean("dao",StudentDao.class);
		Student s=new Student();
//		s.setName("aunvika");
//		s.setAddress("srinivaspur");
//		s.setSchool("vision");
//		s.setPnone(9876);
//		dao.savestudent(s);
		Student st=dao.getStudent(1);
		System.out.println(st.getAddress());
		System.out.println(st.getName());
		System.out.println(st.getSchool());
		

	
	}

}
