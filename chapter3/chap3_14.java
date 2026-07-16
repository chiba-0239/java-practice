package chapter3;
import java.util.Random;
public class chap3_14 {
  public static void main(String[] args) {
    omikuji();
  }
  static void omikuji() {
    String[] kuji = {"大吉","中吉","小吉","末吉","凶"};
    Random rnd = new Random();
    int id = rnd.nextInt(kuji.length);
    System.out.println(kuji[id]);
  }
}
