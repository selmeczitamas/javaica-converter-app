package com.javaica;

public class weightConverter {
    private double kg;
    private double lbs;

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getLbs() {
        return lbs;
    }

    public void setLbs(double lbs) {
        this.lbs = lbs;
    }

    public static void weightExchanger(int exChangeableValue) {
        String printOutMsg;
        double exchangeRate = 0.45359237;
        weightConverter changeMe = new weightConverter();

        switch (exChangeableValue) {
            case 1:
                printOutMsg = "Please Enter the amount of weight in kilograms that you want to exchange to pounds: ";
                changeMe.setKg(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getKg() + " kilograms equals to " + (changeMe.getKg() / exchangeRate) + " pounds.");
                System.out.println("----------------------------------------");
                Main.weightConverterMenu();
                break;

            case 2:
                printOutMsg = "Please Enter the amount of weight in pounds that you want to exchange to kilograms: ";
                changeMe.setLbs(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getLbs() + " pounds equals to " + (changeMe.getLbs() * exchangeRate) + " kilograms.");
                System.out.println("----------------------------------------");
                Main.weightConverterMenu();
                break;

            case 0:
                Main.showMainMenu();
                break;

            default:
                Main.weightConverterMenu();
                break;
        }
    }
}
