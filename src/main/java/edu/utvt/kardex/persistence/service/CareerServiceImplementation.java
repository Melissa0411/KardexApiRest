package edu.utvt.kardex.persistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.utvt.kardex.persistence.entities.Career;
import edu.utvt.kardex.persistence.repositories.CareerRepository;

@Service
@Transactional
public class CareerServiceImplementation implements CareerService {
	@Autowired
    private CareerRepository careerRepository;

    @Override
    public List<Career> findAll() {
        return careerRepository.findAll();
    }

    @Override
    public Optional<Career> findById(Long id) {
        return careerRepository.findById(id);
    }

    @Override
    public Career save(Career career) {
        return careerRepository.save(career);
    }

    @Override
    public Career update(Long id, Career career) {
        Optional<Career> existingCareer = careerRepository.findById(id);
        if (existingCareer.isPresent()) {
            Career updatedCareer = existingCareer.get();
            updatedCareer.setName(career.getName());
            updatedCareer.setDescription(career.getDescription());
            return careerRepository.save(updatedCareer);
        } else {
            throw new RuntimeException("Career not found with id " + id);
        }
    }
}
