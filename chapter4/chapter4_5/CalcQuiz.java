package chapter4.chapter4_5;
import java.util.Random;
public class CalcQuiz {//計算問題を１個作るクラス
  protected String question;//問題を保存するフィールド
  protected String answer;//答えを保存するフィールド

  protected CalcQuiz() {//コントラクタ
    System.out.println("コンストラクタが呼ばれました");
    createQuestion();
  }
  //ランダムに問題を１つ作る
  void createQuestion() {
    Random rnd = new Random();
    int a = rnd.nextInt(100);
    int b = rnd.nextInt(100);
    this.question = a + "x" + b + "=?";//問題の文字列を作る
    this.answer = Integer.toString(a * b);//答えの文字列を作る
  }
  public String getQuestion() {//問題を出してくれるメゾット
    return this.question;
  }
  public String getAnswer() {//答えを教えてくれるメゾット
    return this.answer;
  }
}
