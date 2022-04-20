package com.example.helloWorld;

public class Operators {
    public void runMain() {
        System.out.println("Salam Arash");
        double bill = 20.00;
        double price = 80.00;
        double total = (bill + price) * 100;
        double remainder = total % 40;
        boolean isReminderZero = remainder == 0;
        System.out.println("Total: " + total);
        System.out.println("Reminder: " + remainder);
        if (isReminderZero) {
            System.out.println("Got some reminder.");
        }
    }
}
