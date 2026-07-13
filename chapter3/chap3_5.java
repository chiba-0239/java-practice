package chapter3;

import java.util.Random;

public class chap3_5 {
  public static void main(String[] args) {
    Random rnd = new Random();
    int answer = rnd.nextInt(10);
    String question = "";
    for(int i = 0; i <= 9; i++) {
      question = question + "[" + (answer * i) + "]";
      System.out.println(question);
    }

  }
}
