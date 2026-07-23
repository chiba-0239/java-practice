package chapter5.chapter5_5;

import chapter4.chapter4_5.CalcQuiz;

public class Main {
  public static void main(String[] args) {
    int quizNum = 5;
    CalcQuiz [] quiz = new CalcQuiz[quizNum];
    for (int i = 0; i < quizNum; i++) {
      quiz[i] = new MusikuiQuiz();
    }
    for (int i = 0; i < quizNum; i++) {
      System.out.println("問" + i + ":" + quiz[i].
    getQuestion());
    }
    System.out.println("----------");
    for(int i = 0; i < quizNum; i++) {
      System.out.println("答" + i + ":" + quiz[i].
      getAnswer());
      }
  }
}
