package edu.utvt.kardex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.utvt.kardex.persistence.entities.Course;
import edu.utvt.kardex.persistence.service.CourseService;



@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
	@Autowired
    private CourseService courseService;
    
    @GetMapping("/{id}")
    public List<Course> findByCareerId(@PathVariable("id") Long id) {
        return courseService.findByCareerId(id);
    }
    
    @PostMapping
    public ResponseEntity<Course> postMethodName(@RequestBody Course course) {
        return ResponseEntity.created(null).body(courseService.save(course));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Course> putMethodName(@PathVariable Long id, @RequestBody Course course) {
        return ResponseEntity.ok(courseService.update(id, course));
    }
}