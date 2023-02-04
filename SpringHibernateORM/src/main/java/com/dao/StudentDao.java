package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dto.Student;

public class StudentDao {
	private HibernateTemplate hTemplate;

	@Transactional
	public void save(Student student) {
		hTemplate.save(student);
	}

	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

}
