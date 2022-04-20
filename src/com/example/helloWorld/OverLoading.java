package com.example.helloWorld;

public class OverLoading {
  public void run() {
    System.out.println(returnSomething("Salam"));
    System.out.println(returnSomething(2));
  }

  public String returnSomething(String input) {
    System.out.println("In the String ONE");
    return input;
  }

  public String returnSomething(int input) {
    System.out.println("In the integer ONE");
    return Integer.toString(input);
  }
  public int returnSomething(String input, String input2) {
    System.out.println("In the integer ONE");
    return 1;
  }
}
