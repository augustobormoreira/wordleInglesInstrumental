import { Component, OnInit } from '@angular/core';
import { Word } from 'src/app/model/Word';
import { WordService } from 'src/app/service/word.service';

@Component({
  selector: 'app-attempts',
  templateUrl: './attempts.component.html',
  styleUrls: ['./attempts.component.css']
})
export class AttemptsComponent implements OnInit {

  wordReceived!: Word;

  constructor(private wordService: WordService) {}

  ngOnInit(): void {
    this.wordService.getWord().subscribe((receivedWord: Word) => {
      this.wordReceived = receivedWord;
      console.log(this.wordReceived);
    });
  }

}
