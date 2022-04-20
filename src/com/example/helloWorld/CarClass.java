package com.example.helloWorld;

public class CarClass {
    public String carName;
    private String carMade;

    public CarClass(String carName, String carMade) {
        System.out.println("Constructor first");
        this.carName = carName;
        this.carMade = carMade;
        System.out.println("Constructor End");
    }

    public String giveMeMyCarName() {
        return "My Car is Toyota Camry 2020" + " " + this.sedan() + " " + sedan();
    }

    private String sedan() {
        return "Sedan";
    }

    public String useMethod() {
        return this.giveMeMyCarName();
    }

    public String useMethod2() {
        return giveMeMyCarName();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarMade() {
        return carMade;
    }

    public void setCarMade(String carMade) {
        System.out.println("++++++++++++++++++=");
        this.carMade = carMade;
    }
}
