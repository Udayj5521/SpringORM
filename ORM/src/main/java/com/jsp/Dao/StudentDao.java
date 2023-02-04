package com.jsp.Dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.jsp.Entity.Student;
public class StudentDao
{
	private HibernateTemplate dinga;
	//save studnet
	@Transactional
	public int insert(Student student)
	{
//		int i=(int)this.dinga.save(student);
		return (Integer) dinga.save(student);
	}
	public Student getStudent(int studentId)
	{
		Student student= this.dinga.get(Student.class, studentId);
		return student;
	}
	public List<Student> getAllStudnets()
	{
		List<Student> student= this.dinga.loadAll(Student.class);
		return student;
	}
	@Transactional
	public void delete(int studentId)
	{
		Student student= this.dinga.get(Student.class, studentId);
		this.dinga.delete(student);
	}
	public HibernateTemplate getDinga()
	{
		return dinga;
	}
	public void setDinga(HibernateTemplate dinga)
	{
		this.dinga = dinga;
	}
}
