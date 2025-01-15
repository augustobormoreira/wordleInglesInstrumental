package iftm.inglesinstrumental.wordl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attempt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String word;
    private int numberofAttempts;
    
}
