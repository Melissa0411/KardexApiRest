package edu.utvt.kardex.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.kardex.persistence.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCareerId(Long careerId);

}
