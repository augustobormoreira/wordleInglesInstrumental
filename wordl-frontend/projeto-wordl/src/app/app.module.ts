import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AttemptsComponent } from './components/attempts/attempts.component';
import { ScreenkeyboardComponent } from './components/screenkeyboard/screenkeyboard.component';
import { LineattemptComponent } from './components/attempts/lineattempt/lineattempt.component';
import { LetterboxComponent } from './components/attempts/lineattempt/letterbox/letterbox.component';
import { KeyComponent } from './components/screenkeyboard/key/key.component';
import { WordService } from './service/word.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AttemptsComponent,
    ScreenkeyboardComponent,
    LineattemptComponent,
    LetterboxComponent,
    KeyComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [WordService],
  bootstrap: [AppComponent]
})
export class AppModule { }
