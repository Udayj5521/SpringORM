package com.jsp.Dao;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jsp.Dao.StudentDao;
import com.jsp.Entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Application execution Started..!!!");
		ApplicationContext context =
				new ClassPathXmlApplicationContext(" config.xml");
		StudentDao d = context.getBean("studentDao", StudentDao.class);
Student s=new Student(70,"Ashish Raj","Delhi");
int result=d.insert(s);
System.out.println("Record ...!!"+result);
//System.out.println( d.getStudent(70));
//List<Student> a=d.getAllStudnets();
//for(Student b:a)
//{
//System.out.println(b);
//}
//d.delete(72);
		System.out.println("Application execution Ended..!!!");
	}
}