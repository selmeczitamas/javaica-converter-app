package com.javaica;

public class currencyConverter {
    private double huf;
    private double eur;
    private double exchangeRate;

    public double getHuf() {
        return huf;
    }

    public void setHuf(double huf) {
        this.huf = huf;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public static void moneyExchanger(int exChangeableValue) {
        String printOutMsg;
        double dailyEuroRate = 304.61;
        currencyConverter changeMe = new currencyConverter();
        switch (exChangeableValue) {

            case 1:
                changeMe.setExchangeRate(dailyEuroRate);
                printOutMsg = "Please Enter the amount of money in HUF that you want to exchange to EUR: ";
                changeMe.setHuf(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getHuf() + " Forint equals to " + (changeMe.getHuf() / changeMe.getExchangeRate()) + " Euro.");
                System.out.println("----------------------------------------");
                Main.currencyConverterMenu();
                break;

            case 2:
                changeMe.setExchangeRate(dailyEuroRate);
                printOutMsg = "Please Enter the amount of money in EUR that you want to exchange to HUF: ";
                changeMe.setEur(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getEur() + " Euro equals to " + (changeMe.getEur() * changeMe.getExchangeRate()) + " HUF.");
                System.out.println("----------------------------------------");
                Main.currencyConverterMenu();
                break;

            case 3:
                System.out.println("----------------------------------------");
                System.out.println("The current Euro exchange rate is: " + dailyEuroRate);
                System.out.println("----------------------------------------");
                Main.currencyConverterMenu();
                break;

            case 0:
                Main.showMainMenu();
                break;

            default:
                Main.currencyConverterMenu();
                break;
        }
    }
}
