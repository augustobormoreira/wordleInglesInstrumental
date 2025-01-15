package iftm.inglesinstrumental.wordl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import iftm.inglesinstrumental.wordl.model.Attempt;
import iftm.inglesinstrumental.wordl.repository.AttemptRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AttemptService {
    private final AttemptRepository attemptRepository;

    public Attempt saveAttempt(Attempt attempt){
        return this.attemptRepository.save(attempt);
    }

    public List<Attempt> getAttempts(){
        return this.attemptRepository.findAll();
    }
    

    
}
