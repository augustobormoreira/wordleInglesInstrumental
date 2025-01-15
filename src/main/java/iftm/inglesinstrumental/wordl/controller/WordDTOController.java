package iftm.inglesinstrumental.wordl.controller;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;


import iftm.inglesinstrumental.wordl.model.WordDTO;

@RestController
@RequestMapping("/getWord")
public class WordDTOController {
    @Autowired
    private WebClient.Builder builder;

    @GetMapping("/all")
    public ResponseEntity<WordDTO> getWordFromMicroService() {

        Random random = new Random();
        int randomNumber = random.nextInt(7 - 3) + 3;

        String newWord = builder.build()
                .get()
                .uri("https://random-word-api.herokuapp.com/word?length=" + randomNumber)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        WordDTO newWordDTO = new WordDTO(newWord);

        return new ResponseEntity<>(newWordDTO, HttpStatus.OK);
    }


}
