package chapter5.chapter5_1;

public class MyClass {
  private String myName = "";//ここでフィールドをprivateにして隠すことでsetterメゾットを使わないと書き込めないようにする。ただしここだけ直してもMain.javaでエラーの原因になる。
  void hello() {
    System.out.println(myName + "です。こんにちは。");
  }
  public void setMyName(String name) {
    if (myName == "") {//名前が空っぽの時は命名できる。
      myName = name;
    }
  }
  public void renameMyName (String name) {
    if (myName != "") {//名前がついていたら改名できる。
      myName = name;
    }
  }
}
