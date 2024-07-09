package edu.utvt.kardex.persistence.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.utvt.kardex.persistence.entities.Course;
import edu.utvt.kardex.persistence.repositories.CourseRepository;

@Service
@Transactional
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findByCareerId(Long careerId) {
        return courseRepository.findByCareerId(careerId);
    }

    @Override
    public Optional<Course> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course update(Long id, Course course) {
        Optional<Course> existingCourse = courseRepository.findById(id);
        if (existingCourse.isPresent()) {
            Course updatedCourse = existingCourse.get();
            updatedCourse.setCareerId(course.getCareerId());
            updatedCourse.setName(course.getName());
            updatedCourse.setDescription(course.getDescription());
            return courseRepository.save(updatedCourse);
        } else {
            throw new RuntimeException("Course not found with id " + id);
        }
    }
}
