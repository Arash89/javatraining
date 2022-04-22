package com.example.helloWorld;


public class ThisVsClassName {
  private int nVar = 2;
  private static int sVar = 3;

  public int multipleTwo (int n) {
    return 2 * n;
  }

  public int useMultipleTwo(int multipleTwo) {
    return this.multipleTwo(multipleTwo);
//    return multipleTwo(multipleTwo);
  }

  public static int plusTwo (int n) {
    return n + 2;
  }

  public static int usePlusTwo(int plusTwo) {
    return ThisVsClassName.plusTwo(plusTwo);
//    return plusTwo(plusTwo);
  }

  public int addTwo(int nVar, int sVar) {
    System.out.println("Inner nVar: " + nVar);
    System.out.println("This is outer nVar: " + this.nVar);
    System.out.println("This might be sVar: " + sVar);
    System.out.println("This is the outer static sVar: " + ThisVsClassName.sVar);

    return this.nVar + nVar + sVar + ThisVsClassName.sVar;
  }

  public void run() {
    System.out.println(useMultipleTwo(12));
    System.out.println(usePlusTwo(12));
    System.out.println(addTwo(100, 300));
  }
}
