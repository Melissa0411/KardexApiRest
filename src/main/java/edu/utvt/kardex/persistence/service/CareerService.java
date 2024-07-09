package edu.utvt.kardex.persistence.service;

import java.util.List;

import java.util.Optional;


import edu.utvt.kardex.persistence.entities.Career;

public interface CareerService {

    List<Career> findAll();

    Optional<Career> findById(Long id);

    Career save(Career career);

    Career update(Long id, Career career);
}