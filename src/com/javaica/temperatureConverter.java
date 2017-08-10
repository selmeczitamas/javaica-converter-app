package com.javaica;

public class temperatureConverter {
    private double celsius;
    private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public static void temperatureExchanger(int exChangeableValue) {
        String printOutMsg;
        temperatureConverter changeMe = new temperatureConverter();

        switch (exChangeableValue) {

            case 1:
                printOutMsg = "Please Enter the amount of temperature in Celsius that you want to exchange to Fahrenheit: ";
                changeMe.setCelsius(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getCelsius() + " Celsius equals to " + (9 * (changeMe.getCelsius() / 5) + 32) + " Fahrenheit.");
                System.out.println("----------------------------------------");
                Main.temperatureConverterMenu();
                break;

            case 2:
                printOutMsg = "Please Enter the amount of temperature in Fahrenheit that you want to exchange to Celsius: ";
                changeMe.setFahrenheit(Main.input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getFahrenheit() + " Fahrenheit equals to " + ((changeMe.getFahrenheit() - 32) * 5 / 9) + " Celsius.");
                System.out.println("----------------------------------------");
                Main.temperatureConverterMenu();
                break;

            case 0:
                Main.showMainMenu();
                break;

            default:
                Main.temperatureConverterMenu();
                break;
        }
    }
}
