package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Primary
@Component
public class SpringCourseDao implements IToDoDao {
	@Override
	public List<String> getCoursesList() {

		List<String> courses = new ArrayList<String>();
		courses.add("Maven");
		courses.add("Dependency Injection");
		courses.add("Spring Data JPA");
		courses.add("Spring AOP");
		return courses;
	}
}
