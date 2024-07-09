package edu.utvt.kardex.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor

@Data
@Entity(name = "te_course")
public class Course {
	

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Long careerId;
	    private String name;
	    private String description;

	    public Course() {
	    }

	    public Course(Long careerId, String name, String description) {
	        this.careerId = careerId;
	        this.name = name;
	        this.description = description;
	    }

	    // Getters y Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Long getCareerId() {
	        return careerId;
	    }

	    public void setCareerId(Long careerId) {
	        this.careerId = careerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	}