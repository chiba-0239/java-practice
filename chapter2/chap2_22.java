package chapter2;
import java.util.Random;
public class chap2_22 {
  public static void main(String[] args) {
    Random rnd = new Random();
    int a = rnd.nextInt(100);
    int b = rnd.nextInt(100);
    System.out.println(a + b / 2);
  }
}
