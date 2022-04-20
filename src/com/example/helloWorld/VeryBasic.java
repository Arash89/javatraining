package com.example.helloWorld;

public class VeryBasic {
    public void runVeryBasic() {
        int a = 1000;
        short b = (short) (a / 2);
        System.out.println(b);
        System.out.println(printName("Nelin", "Soudishoar"));
        System.out.println(getSqrt(100));
        CarClass toyota = new CarClass("Toyota", "Camry");
        System.out.println(toyota.giveMeMyCarName());
        System.out.println(toyota.getCarName());
        System.out.println(toyota.getCarMade());
        toyota.setCarName("Civc");
        toyota.carName = "Honda";
        System.out.println(toyota.getCarName());
        System.out.println(toyota.getCarMade());
        System.out.println(toyota.useMethod());
        System.out.println(toyota.useMethod2());
        toyota.setCarMade("Audi");
        System.out.println(toyota.getCarMade());
    }

    public String printName(String first, String last) {
        return first.toUpperCase() + " " + last.toUpperCase();
    }

    public double getSqrt(float numb) {
        return Math.sqrt(numb);
    }
}
