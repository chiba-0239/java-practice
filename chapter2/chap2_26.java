package chapter2;

public class chap2_26 {
  public static void main(String[] args) {
    int intA = 12345;
    //double doubleA = 1234.5678;
    String StringA = Integer.toString(intA);
    //String StringB = Double.toString(doubleA);
    System.out.println(1 + StringA);//＋は文字列との接続に使えるが、
    //System.out.println(1 - StringB);//ーは文字列との組み合わせに対する演算が定義されていないためコンパイラが処理を決められずエラーになる。
  }
}
