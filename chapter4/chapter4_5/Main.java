package chapter4.chapter4_5;

public class Main {
  public static void main(String[] args) {
    int quizNum = 5;//問題数
    CalcQuiz [] quiz = new CalcQuiz[quizNum];//問題を作るインスタンスを入れる配列
    //問題を作るインスタンスを作る
    for(int i = 0; i < quizNum; i++) {
      quiz[i] = new CalcQuiz();
    }
    //すべての問題を表示する
    for(int i = 0; i < quizNum; i++) {
      System.out.println("問" + i + ":" + quiz[i].getQuestion());
    }
    System.out.println("----------");
    //すべての答えを表示する
    for(int i = 0; i < quizNum; i++) {
      System.out.println("答" + i + ":" + quiz[i].getAnswer());
    }
  }
}
