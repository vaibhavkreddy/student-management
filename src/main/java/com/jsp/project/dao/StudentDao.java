package com.jsp.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.project.entity.Student;

@Component(value = "dao")
public class StudentDao {
	@Autowired
	private EntityManager entityManager;
	
	public void savestudent(Student student) {
//		EntityManager entityManager=EntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		System.out.println("Student is saved");
		
	}

	public Student getStudent(int id) {
//		EntityManager entityManager=EntityManagerFactory.createEntityManager();
		
		String query="select s from Student s where s.id=?1";
		Query q=entityManager.createQuery(query);
		q.setParameter(1, id);
		return (Student) q.getSingleResult();
		
		
		
	}

}
