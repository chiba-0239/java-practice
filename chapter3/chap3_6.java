package chapter3;

/*public class chap3_6 {
  public static void main(String[] args) {
    int [] scorelist= {64,100,78,80,72};
    for(int i:scorelist) {
      if (i % 4 == 0) {
        System.out.println(i);
      }
    }
  }
}*/

public class chap3_6 {
  public static void main(String[] args) {
    int [] scorelist= {64,100,78,80,72};
    int total = 0;
    for(int i:scorelist) {
      total += i;
    }
    int average = total / scorelist.length;
  System.out.println("合計：" + total);
  System.out.println("平均：" + average);
  }
}