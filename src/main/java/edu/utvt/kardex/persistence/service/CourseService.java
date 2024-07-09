package edu.utvt.kardex.persistence.service;

import java.util.List;

import java.util.Optional;


import edu.utvt.kardex.persistence.entities.Course;

public interface CourseService {
	
    List<Course> findByCareerId(Long careerId);

    Optional<Course> findById(Long id);

    Course save(Course course);

    Course update(Long id, Course course);
}