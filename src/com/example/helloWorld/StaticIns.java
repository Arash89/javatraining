package com.example.helloWorld;

public class StaticIns {
  public String name;
  int id;

  public static void run() {
    StaticIns staticIns = new StaticIns();
    staticIns.name = "Azizam Nelin";
    staticIns.id = 110;
    System.out.println("Static Name: " + staticIns.name);
    System.out.println("Static Id: " + staticIns.id);
  }
}
