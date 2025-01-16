export class TotalAttemptsDTO {
    word: String;
    numberOfAttempts: number;

    constructor(receivedWord: String, totalNumberOfAttempts: number){
        this.word = receivedWord;
        this.numberOfAttempts = totalNumberOfAttempts;
    }
}