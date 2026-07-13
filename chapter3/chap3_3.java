package chapter3;
import java.util.Random;
public class chap3_3 {
  public static void main(String[] args) {
    Random rnd = new Random();
    int score = rnd.nextInt(5);
    switch (score) {
      case 0:
        System.out.println("大吉");
        break;
      case 1:
        System.out.println("中吉");
        break;
      case 2:
        System.out.println("小吉");
        break;
      case 3:
       System.out.println("末吉");
       break;
    default:
      System.out.println("凶");
      break;
    }
  }
}