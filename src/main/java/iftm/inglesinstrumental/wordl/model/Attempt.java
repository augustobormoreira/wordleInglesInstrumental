package iftm.inglesinstrumental.wordl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Attempt {

    public Attempt(String word, int numberofAttempts){
        this.word = word;
        this.numberofAttempts = numberofAttempts;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private int numberofAttempts;
    
}
