package chapter3;

public class chap3_8 {
  public static void main(String[] args) {
    for(int i = 0; i <= 9; i++) {
      for(int j = 0; j <= 9; j++) {
        if (i == 2) {
          break;//ここだと２の段だけ抜け落ちる。もう一つ外側なら２の段以降表示されない。
        }
        System.out.println(i + "x" +j+ "=" + (i * j));
      }
    }
  }
}
