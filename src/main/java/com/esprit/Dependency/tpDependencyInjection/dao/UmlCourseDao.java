package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UmlCourseDao implements IToDoDao {

	@Override
	public List<String> getCoursesList() {

		List<String> courses = new ArrayList<String>();
		courses.add("diagramme de cas utilisation");
		courses.add("diagramme de classes");
		courses.add("diagramme de séquences");
		courses.add("diagramme état transition");
		return courses;
	}
}
