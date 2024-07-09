package edu.utvt.kardex.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.kardex.persistence.entities.Career;

public interface CareerRepository extends JpaRepository<Career, Long> {

}
