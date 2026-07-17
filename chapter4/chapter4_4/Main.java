package chapter4.chapter4_4;

public class Main {
  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    MyClass iroha = new MyClass();
    MyClass sensei = new MyClass();

    iroha.myName = "いろは";
    sensei.myName = "センセイ";

    myClass.hello();
    iroha.hello();
    sensei.hello();

  }
}