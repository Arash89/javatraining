package com.example.helloWorld;

public class ThisOrClassName {
  static int cube(int x){
    return x*x*x;
  }

  public static void main(String args[]){
    int result= ThisOrClassName.cube(5);
    System.out.println(result);
  }
//  public int cube(int n) {
//    return n * n;
//  }
  public void run() {
//    System.out.println("non static: " + this.cube(2));
    System.out.println("static: " + ThisOrClassName.cube(2));
  }

}
