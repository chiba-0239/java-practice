package chapter3;
public class chap3_12 {
  public static void main(String[] args) {
    double ans = postTaxPrice(980);
    System.out.println(ans + "円");
  }
  static double postTaxPrice(int price) {
    double ans = price * 1.08;
    return ans;
  }
}
