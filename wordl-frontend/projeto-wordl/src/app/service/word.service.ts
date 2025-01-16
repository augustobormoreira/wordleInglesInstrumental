import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from "@angular/common/http";
import { Word } from '../model/Word';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WordService {
  private getWordUrl: string = `${environment.WORD_URL}`;

  constructor(private httpClient: HttpClient) { }

  getWord(): Observable<Word>{
    return this.httpClient.get<Word>(this.getWordUrl);
  }
}
