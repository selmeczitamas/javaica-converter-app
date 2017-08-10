package com.javaica;

public class distanceConverter {
    private double km;
    private double miles;

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }


    public static void distanceExchanger(int exChangeableValue) {
        String printOutMsg;
        double exchangeRate = 0.621371192;
        distanceConverter changeMe = new distanceConverter();
        switch (exChangeableValue) {
            case 1:
                printOutMsg = "Please enter the amount of distance in kilometers that you want to exchange to miles.";
                changeMe.setKm(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getKm() + " kilometers equals to " + changeMe.getKm() * exchangeRate + " miles.");
                System.out.println("----------------------------------------");
                Main.distanceConverterMenu();
                break;

            case 2:
                printOutMsg = "Please enter the amount of distance in miles that you want to exchange to kilometers.";
                changeMe.setMiles(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getMiles() + " miles equals to " + changeMe.getMiles() / exchangeRate + " kilometers.");
                System.out.println("----------------------------------------");
                Main.distanceConverterMenu();
                break;

            case 0:
                Main.showMainMenu();
                break;

            default:
                Main.distanceConverterMenu();
                break;
        }
    }
}
