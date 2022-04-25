package com.example.helloWorld;

public class ThisPassArg {
  int counter = 0;
  ThisPassArg(int counter) {
    this.counter = counter;
  }
  void m(ThisPassArg obj){
    System.out.println("method is invoked");
    System.out.println("Counter");
    System.out.println(obj);
    System.out.println("++++++++++++++++++++");
    System.out.println(this);
    System.out.println(this.counter);
  }
  void p(){


    m(this);
  }
  public static void main(String args[]){
    ThisPassArg s1 = new ThisPassArg(110);
    s1.p();
  }
}


