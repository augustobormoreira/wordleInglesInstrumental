package iftm.inglesinstrumental.wordl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iftm.inglesinstrumental.wordl.model.Attempt;

public interface AttemptRepository extends JpaRepository<Attempt, Long> {
    
}
