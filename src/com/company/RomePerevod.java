package com.company;

public class RomePerevod {
    static int sum = Main.sum;
    static String otvet = "";

    public static void perevod() {
        while (sum > 0) {
            if (sum - 1000 >= 0) {
                otvet += "M";
                sum -= 1000;
                continue;
            }

            if (sum == 900) {
                otvet += "CM";
                sum -= 900;
                continue;
            }
            if (sum - 500 >= 0) {
                otvet += "D";
                sum -= 500;
                continue;
            }
            if (sum == 400) {
                otvet += "CD";
                sum -= 400;
                continue;
            }
            if (sum - 100 >= 0) {
                otvet += "C";
                sum -= 100;
                continue;
            }
            if (sum == 90) {
                otvet += "XC";
                sum -= 90;
                continue;
            }
            if (sum - 50 >= 0) {
                otvet += "L";
                sum -= 50;
                continue;
            }
            if (sum == 40) {
                otvet += "XL";
                sum -= 40;
                continue;
            }
            if (sum - 10 >= 0) {
                otvet += "X";
                sum -= 10;
                continue;
            }
            if (sum == 9) {
                otvet += "IX";
                sum -= 9;
                continue;
            }
            if (sum - 5 >= 0) {
                otvet += "V";
                sum -= 5;
                continue;
            }
            if (sum == 4) {
                otvet += "IV";
                sum -= 4;
                continue;
            }
            if (sum - 1 >= 0) {
                otvet += "I";
                sum -= 1;
                continue;
            }
        }
    }
}

