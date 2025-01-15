package iftm.inglesinstrumental.wordl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iftm.inglesinstrumental.wordl.model.Attempt;
import iftm.inglesinstrumental.wordl.service.AttemptService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@AllArgsConstructor
@RequestMapping("/attempts")
public class AttemptController {
    private final AttemptService attemptService;

    @PostMapping("/saveAttempt")
    public ResponseEntity<Attempt> saveNewAttempt(@RequestBody Attempt attempt) {
        Attempt newAttempt = this.attemptService.saveAttempt(attempt);

        return new ResponseEntity<>(newAttempt, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Attempt>> getAllAttempts() {
        List<Attempt> listOfAttempts = this.attemptService.getAttempts();
        return new ResponseEntity<>(listOfAttempts, HttpStatus.OK);
    }
    
    
}
