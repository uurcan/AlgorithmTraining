package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class Main {
    private static boolean isPolyndrome(String word){
        StringBuilder newWord = new StringBuilder();

        for (int i = 0; i < word.length();i++){
            int count = word.length();
            newWord.append(word.charAt(count - i - 1));
        }
        return word.equals(newWord.toString());
    }

    private  static void checkPolyndrome(){
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a String");
        word = scanner.nextLine();
        if (isPolyndrome(word)){
            System.out.println("Polyndrome word");
        } else System.out.println("Non polyndrome word");
    }

    private static void digitTotal(){
        int num,first,second,third;
        Scanner in = new Scanner(System.in);
        System.out.println("Define a variable");
        num = in.nextInt();
        first = num%10;
        second = (num%100)/10;
        third = (num%1000)/100;
        System.out.println((first+second+third));
    }
    private static void star(){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Define a variable");
        num = in.nextInt();
        for (int i = 0;i<num;i++){
            for (int j = 0 ;j <i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    private static void factorial(){
         int sonuc = 1;
         int sayi;
         System.out.println("Sayi giriniz.");
         sayi = new Scanner(System.in).nextInt();
         for (int i = 1;i<=sayi;i++) {
             sonuc *= i;
         }System.out.println(sonuc);
    }
    private static String parse(int number){
        int first,second,third;
        String firstChar = "",secondChar= "",thirdChar = "";
        first = number%10;
        second = (number%100)/10;
        third = (number%1000)/100;
        firstChar = getString(first, firstChar);
        secondChar = getString(second, secondChar);
        thirdChar = getString(third, thirdChar);
        return thirdChar+secondChar+firstChar;
    }

    private static String getString(int first, String character) {
        switch (first){
            case 1: character = "1"; break;
            case 2: character = "2"; break;
            case 3: character = "3"; break;
            case 4: character = "4"; break;
            case 5: character = "5"; break;
            case 6: character = "6"; break;
            case 7: character = "7"; break;
            case 8: character = "8"; break;
            case 9: character = "9"; break;
            case 0: character = "0"; break;
        }
        return character;
    }

    private static void primeNumberList(){
        int count;
        int sayi = 0;
        System.out.println("How many prime numbers do you want to see ? ");
        count = new Scanner(System.in).nextInt();
        int num = 2;
        while (sayi < count) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                sayi++;
                if (sayi % 10 == 0){
                    System.out.print("\n");
                }else System.out.print(num+ " ");
            }
            num++;
        }
    }

    private static void ChangetoString(){
        System.out.println("Please define a variable to parse..");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Parsed value is : '"+ parse(number)+"' debug to see resutls.");
    }

    private static void decreaseAndIncrease(){
        int num = new Scanner(System.in).nextInt();
        for (int i = num;i>0;i--){
            System.out.print(i);
            for (int j=i-1 ;j>0;j--){
                System.out.print(j);
            }
            for (int k=2 ;k<=i;k++){
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Algorithm Console \n Please Select the operation you want to use \n" +
                    " 1.)Check Polyndrome \n 2.)Total digit of number \n 3.)Star Application \n 4.)Increase and Decrease" +
                    " \n 5.)Prime Number List \n 6.)Factorial \n 7.)Parse \n 8.)Exit ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    checkPolyndrome();
                    break;
                case 2:
                    digitTotal();
                    break;
                case 3:
                    star();
                    break;
                case 4:
                    decreaseAndIncrease();
                    break;
                case 5:
                    primeNumberList();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    ChangetoString();
                    break;
                case 8:
                    System.out.println("So long!");
                    System.exit(0);
                    break;
            }
        }while (choice>=1 && choice<=8);
    }
}
