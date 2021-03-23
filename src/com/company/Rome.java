package com.company;

public class Rome {
    static int num1 = 0;
    static int num2 = 0;
    static int d = 0;
    static int sum = 0;

    //static String otvet="";
    public static void rome(String readline) {
        boolean numberb1 = numerberN1(Main.result[0].trim());
        boolean numberb2 = numerberN2(Main.result[1].trim());
        if (numberb1 == numberb2) {
            switch (Main.result[0].trim()) {
                case "I":
                    num1 = 1;
                    break;
                case "II":
                    num1 = 2;
                    break;
                case "III":
                    num1 = 3;
                    break;
                case "IV":
                    num1 = 4;
                    break;
                case "V":
                    num1 = 5;
                    break;
                case "VI":
                    num1 = 6;
                    break;
                case "VII":
                    num1 = 7;
                    break;
                case "VIII":
                    num1 = 8;
                    break;
                case "IX":
                    num1 = 9;
                    break;
                case "X":
                    num1 = 10;
                    break;
                default:
                    System.out.println("Первое значение не подходит!");
            }
            switch (Main.result[1].trim()) {
                case "I":
                    num2 = 1;
                    break;
                case "II":
                    num2 = 2;
                    break;
                case "III":
                    num2 = 3;
                    break;
                case "IV":
                    num2 = 4;
                    break;
                case "V":
                    num2 = 5;
                    break;
                case "VI":
                    num2 = 6;
                    break;
                case "VII":
                    num2 = 7;
                    break;
                case "VIII":
                    num2 = 8;
                    break;
                case "IX":
                    num2 = 9;
                    break;
                case "X":
                    num2 = 10;
                    break;
                default:
                    System.out.println("Второе значение не подходит!");

            }
        } else {
            System.out.println("Только римские или арабские цифры должны быть!");
        }
        //String[] rom = readline.split("");
        //int[] number12=new int[2];
        //int number=1;
       /* for (int i=0;i< rom.length;i++){
            if(rom[i].equals("+") || rom[i].equals("-") || rom[i].equals("*") || rom[i].equals("/")){
                number++;
            }
            if(number==1){
                if(rom[i].equals("I")){
                    num1+=d;
                }

                if (rom[i].equals("V")){
                    num1+=5;
                    if(i>0)
                    if(rom[i - 1].equals("I")){
                        num1-=2;
                    }
                }

                if(rom[i].equals("X")){
                    num1+=10;
                    if(i>0)
                    if(rom[i - 1].equals("I")){
                        num1-=2;
                    }
                }

                if(rom[i].equals("L")){
                    num1+=50;
                    if(i>0)
                    if(rom[i - 1].equals("X")){
                        num1-=20;
                    }
                }

                if(rom[i].equals("C")){
                    num1+=100;
                    if(i>0)
                    if (rom[i - 1].equals("X")){
                        num1-=20;
                    }
                }

                if(rom[i].equals("D")){

                    num1+=500;
                    if(i>0)
                    if(rom[i].equals("C")){
                        num1-=200;
                    }
                }
                if(rom[i].equals("M")){
                    d=1000;
                    num1+=1000;
                    if(i>0)
                    if(rom[i].equals("C")){
                        num1-=200;
                    }
                }
            }

            if (number==2){
                if(rom[i].equals("I")){
                    num2++;
                }

                if (rom[i].equals("V")){
                    num2+=5;
                    if(rom[i - 1].equals("I")){
                        num2-=2;
                    }
                }

                if(rom[i].equals("X")){
                    num2+=10;
                    if(rom[i - 1].equals("I")){
                        num1-=2;
                    }
                }

                if(rom[i].equals("L")){
                    num2+=50;
                    if(rom[i - 1].equals("X")){
                        num2-=20;
                    }
                }

                if(rom[i].equals("C")){
                    num2+=100;
                    if (rom[i - 1].equals("X")){
                        num1-=20;
                    }
                }

                if(rom[i].equals("D")){
                    num1+=500;
                    if(rom[i].equals("C")){
                        num1-=200;
                    }
                }
                if(rom[i].equals("M")){
                    num1+=1000;
                    if(rom[i].equals("C")){
                        num1-=200;
                    }
                }

            }

        }
        //System.out.println(otvet);*/


    }

    private static boolean numerberN1(String res1) throws NumberFormatException {
        try {
            Integer.parseInt(res1);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean numerberN2(String res2) throws NumberFormatException {
        try {
            Integer.parseInt(res2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

