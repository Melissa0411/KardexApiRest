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

import edu.utvt.kardex.persistence.entities.Career;
import edu.utvt.kardex.persistence.service.CareerService;




@RestController
@RequestMapping("/api/v1/careers")
public class CareerController {
	
	@Autowired
	private CareerService careerService;
	
	@GetMapping
	public List<Career> findAll() {
		return this.careerService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Career> findById(@PathVariable Long id) {
		return ResponseEntity.of(this.careerService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Career> save(@RequestBody Career career) {
		return ResponseEntity.created(null).body(this.careerService.save(career));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Career> update(@PathVariable Long id, @RequestBody Career career) {
		return ResponseEntity.ok(this.careerService.update(id, career)) ;
	}

}