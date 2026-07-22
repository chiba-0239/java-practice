package chapter5.chapter5_1;

public class Main {
  public static void main(String[] args) {
    MyClass iroha = new MyClass();

    iroha.setMyName("いろは");//最初に命名する。

    iroha.renameMyName("タヌキチ");//後から命名する。

    iroha.hello();
  }
}
