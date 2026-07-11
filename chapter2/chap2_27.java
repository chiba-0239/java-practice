package chapter2;

public class chap2_27 {
  public static void main(String[] args) {
    String StringA = "12345";
    String StringB = "1234.5678";
    int intA = Integer.parseInt(StringA);
    double doubleA = Double.parseDouble(StringB);
    System.out.println(1 + intA);//+は文字列にも使える。
    System.out.println(1 - doubleA);//-は数値型同士の計算として定義されているため、Stringとの組み合わせでは使えない
  }
}
