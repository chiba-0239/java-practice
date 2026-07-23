package chapter5.chapter5_5;
import java.util.Random;

import chapter4.chapter4_5.CalcQuiz;
class MusikuiQuiz extends CalcQuiz {
  MusikuiQuiz () {
    createQuestion();
  }
  void createQuestion() {
    Random rnd = new Random();
    int dan = rnd.nextInt(10);
    int qID = rnd.nextInt(10);
    this.question = "";

    for(int i = 0; i < 10; i++) {
      if (i == qID) {
        this.question += "[◯]";
      } else {
        this.question += "[" + ( dan * i) + "]";
      }
    }
    this.question += "◯に入る数字は何でしょう？";
    this.answer = "答え" + (dan * qID);
  }
}
