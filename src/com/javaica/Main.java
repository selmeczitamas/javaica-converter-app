package com.javaica;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        showLogo();
        showMainMenu();
        sayBye();
    }

    public static int input(String printOutMessage) {
        Scanner reader = new Scanner(System.in);
        System.out.println(printOutMessage);
        int inputNumber = -1;
        try {
            inputNumber = reader.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("----------------------------------------");
            System.out.println("     Error. I'm waiting for a number    ");
            System.out.println("    You transferred back to Main menu   ");
            System.out.println("----------------------------------------");
            showMainMenu();
        }
        return inputNumber;
    }

    public static void showLogo() {
        System.out.println("");
        System.out.println("Welcome to Javaica Converter Application");
        System.out.println("");
    }

    public static void showMainMenu() {
        System.out.println("----------------------------------------");
        System.out.println("               Main Menu                ");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("You can choose from the following options:");
        System.out.println("(1) Currency converter");
        System.out.println("(2) Distance converter");
        System.out.println("(3) Weight converter");
        System.out.println("(4) Temperature converter");
        System.out.println("(0) Exit");
        System.out.println("");
        chooseMainMenu(input("Please Enter a number: "));
    }

    public static void chooseMainMenu(int number) {
        switch (number) {

            case 1:
                currencyConverterMenu();
                break;

            case 2:
                distanceConverterMenu();
                break;

            case 3:
                weightConverterMenu();
                break;

            case 4:
                temperatureConverterMenu();
                break;

            case 0:
                break;

            case 666:
                System.out.println("----------------------------------------");
                System.out.println("             WHO ARE YOU???             ");
                System.out.println("----------------------------------------");
                showMainMenu();
                break;

            default:
                System.out.println("----------------------------------------");
                System.out.println("Please choose from option: 1,2,3 or 4");
                System.out.println("----------------------------------------");
                showMainMenu();
                break;
        }
    }

    public static void currencyConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("         Currency converter menu        ");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert HUF to EUR");
        System.out.println("(2) Convert EUR to HUF");
        System.out.println("(3) Check the daily exchange rate");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
        currencyConverter.moneyExchanger(input("Please Enter a number: "));
    }

    public static void distanceConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("         Distance converter menu"        );
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert km to miles");
        System.out.println("(2) Convert miles to km");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
        distanceConverter.distanceExchanger(input("Please Enter a number: "));
    }

    public static void weightConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("          Weight converter menu         ");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert kg to lbs");
        System.out.println("(2) Convert lbs to kg");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
        weightConverter.weightExchanger(input("Please Enter a number: "));
    }

    public static void temperatureConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("       Temperature converter menu       ");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("(1) Convert Celsius to Fahrenheit");
        System.out.println("(2) Convert Fahrenheit to Celsius");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
        temperatureConverter.temperatureExchanger(input("Please Enter a number: "));
    }

    public static void sayBye() {
        System.out.println("----------------------------------------");
        System.out.println("            See you! Bye! :)            ");
        System.out.println("----------------------------------------");
        System.exit(0);
    }
}
