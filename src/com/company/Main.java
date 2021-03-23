package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    static int sum = 0;
    static String result[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readline = scanner.nextLine();

        result = readline.split("[+,*,/,-]");
        if (!readline.contains(".") && !readline.contains(",")) {
            if (result.length == 2) {
                //System.out.println("2");
                boolean numberb = numerberP(result[0].trim(), result[1].trim());
                // System.out.println(numberb);

                if (numberb) {
                    int a = Integer.parseInt(result[0].trim());
                    int b = Integer.parseInt(result[1].trim());
                    if (a > 0 && a < 11 && b > 0 && b < 11) {
                        calAr(readline, a, b);
                        System.out.println("Ответ " + sum);
                    } else {
                        System.out.println("Недопустимое значение!");
                    }
                } else {
                    Rome.rome(readline);
                    if (Rome.num1 != 0 && Rome.num2 != 0) {
                        calAr(readline, Rome.num1, Rome.num2);
                        RomePerevod.perevod();
                        System.out.println("Ответ " + RomePerevod.otvet);
                    } else {

                    }

                }
            } else {
                System.out.println("Нет такой операции!");
                //исключение
            }
        } else {
            System.out.println("Только целые числа!");
        }


    }

    private static boolean numerberP(String res1, String res2) throws NumberFormatException {
        try {
            Integer.parseInt(res1);
            Integer.parseInt(res2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void calAr(String readline, int num1, int num2) {
//        int sum =0;
        // String[] result = readline.split("[+,-.*,/]");
        if (readline.contains("+")) {
            sum = num1 + num2;
        } else if (readline.contains("-")) {
            sum = num1 - num2;

        } else if (readline.contains("*")) {
            sum = num1 * num2;

        } else if (readline.contains("/")) {
            sum = num1 / num2;

        } else {
            System.out.println("Нет знака!");
        }

        //System.out.println("Ответ = "+sum);
    }


//    public static void rome(String readline){
//        String[] rom = readline.split("");
//        int num1=0;
//        int num2=0;
//        int number=1;
//        //int[] number12=new int[2];
//        for (int i=0;i< rom.length;i++){
//            if(rom[i].equals("+") || rom[i].equals("-") || rom[i].equals("*") || rom[i].equals("/")){
//                number++;
//            }
//            if(number==1){
//                if(rom[i].equals("I")){
//                    num1++;
//                }
//
//                if (rom[i].equals("V")){
//                    num1+=5;
//                    if(rom[i - 1].equals("I")){
//                        num1-=2;
//                    }
//                }
//
//                if(rom[i].equals("X")){
//                    num1+=10;
//                    if(rom[i - 1].equals("I")){
//                        num1-=2;
//                    }
//                }
//
//                if(rom[i].equals("L")){
//                    num1+=50;
//                    if(rom[i - 1].equals("X")){
//                        num1-=20;
//                    }
//                }
//
//                if(rom[i].equals("C")){
//                    num1+=100;
//                    if (rom[i - 1].equals("X")){
//                        num1-=20;
//                    }
//                }
//
//                if(rom[i].equals("D")){
//                    num1+=500;
//                    if(rom[i].equals("C")){
//                        num1-=200;
//                    }
//                }
//                if(rom[i].equals("M")){
//                    num1+=1000;
//                    if(rom[i].equals("C")){
//                        num1-=200;
//                    }
//                }
//            }
//
//
//            if (number==2){
//                if(rom[i].equals("I")){
//                    num2++;
//                }
//
//                if (rom[i].equals("V")){
//                    num2+=5;
//                    if(rom[i - 1].equals("I")){
//                        num2-=2;
//                    }
//                }
//
//                if(rom[i].equals("X")){
//                    num2+=10;
//                    if(rom[i - 1].equals("I")){
//                        num1-=2;
//                    }
//                }
//
//                if(rom[i].equals("L")){
//                    num2+=50;
//                    if(rom[i - 1].equals("X")){
//                        num2-=20;
//                    }
//                }
//
//                if(rom[i].equals("C")){
//                    num2+=100;
//                    if (rom[i - 1].equals("X")){
//                        num1-=20;
//                    }
//                }
//
//                if(rom[i].equals("D")){
//                    num1+=500;
//                    if(rom[i].equals("C")){
//                        num1-=200;
//                    }
//                }
//                if(rom[i].equals("M")){
//                    num1+=1000;
//                    if(rom[i].equals("C")){
//                        num1-=200;
//                    }
//                }
//
//            }
//
//            System.out.println(num1);
//            System.out.println(num2);
//
//            }


}





