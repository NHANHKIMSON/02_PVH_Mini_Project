package org.example.validation;

import java.time.Year;
import java.util.Scanner;
import java.util.regex.Pattern;

public class inputUtil {



    String rege="^[0-9]+$";
    String nameRegex="^[a-zA-Z]+$";
    String optionRegex="^[a-zA-Z]+$";

    Scanner sc=new Scanner(System.in);
    String regeDouble="[0-9]{1,13}(.[0-9]*)$";
    String YesNo= "^[y|n]$";

    public String address(String text){
        System.out.print(text);
        String date;
        date= sc.next();
        return date;
    }


    public  String InputYN() {
        String answer;
        while (true){
            System.out.println(Utils.green+"=>Do you want to cotineu? (y/n):"+Utils.reset);
            answer= sc.next().trim().toLowerCase();
            if (Pattern.matches(YesNo, answer)) {
                break;
            } else {
                System.out.println(Utils.red + "Invalid input. Please enter a valid number." + Utils.reset);
            }
        }
        return  answer;
    }

    public int qty(String text ){
        String number;
        do {
            System.out.print(text);
            number =sc.next();
            if (Pattern.matches(rege, number)){
                break;
            }else {
                System.out.println(Utils.red+"input only number"+Utils.reset);
            }
        }while (true);

        return  Integer.parseInt(number);
    }

    public String Inputname(String text){
        String name;
        do {
            System.out.print(text);
            name = sc.next();
            if (Pattern.matches(nameRegex,name)){
                break;
            }else {
                System.out.println(Utils.red+"You can input number....."+Utils.reset);
            }
        }while (true);

        return name;
    }


    public String option(String text){
        String name;
        do {
            System.out.print(text);
            name = sc.next();
            if (Pattern.matches(optionRegex,name)){
                break;
            }else {
                System.out.println(Utils.red+"You can input number....."+Utils.reset);
            }
        }while (true);

        return name;
    }





    public double inputPrice(String text){
        String balance;
        do {
            System.out.print(text);
            balance=sc.next();

            if (Pattern.matches(regeDouble, balance)){
                break;
            }else {
                System.out.println(Utils.red+"Invalid data....."+Utils.reset);
            }
        }while (true);
        return Double.parseDouble(balance);
    }




}
