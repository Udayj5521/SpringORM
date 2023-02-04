package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.dto.Student;

public class App {
	public static void main(String[] args)

	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao sd = context.getBean("studentDao", StudentDao.class);

		Student s = new Student(1, "Sandeep", "Bangalore");
		sd.save(s);
		System.out.println("Data Inserted");

	}
}
