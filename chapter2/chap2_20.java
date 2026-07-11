package chapter2;

public class chap2_20 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    String question = "点" + (a + b);//()の中を先に計算してintの30を作り、その結果を使って式全体を左から評価する。途中で左側がStringになった瞬間、それ以降は文字列として連結される。
    System.out.println(question);
  }
}
