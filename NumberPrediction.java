package MathAndStringClasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberPrediction {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int randNumber = rand.nextInt(100);
        int number, right = 0;
        int[] falseNumbers = new int[5];


        while (right != 5) {

            System.out.print("Lütfen bir sayı giriniz: ");
            number = inp.nextInt();

            if (number < 0 || number > 100) {
                System.out.println("Lütfen 0 ve 100 arası bir sayı giriniz");
                continue;
            }

            if (number == randNumber) {
                System.out.println("Tebrikler rasgele üretilen " + randNumber + " sayısını doğru tahmin ettiniz.");
                break;
            } else {
                falseNumbers[right] = number;
                ++right;
                if (number > randNumber) {
                    System.out.println("Tahmin ettiğiniz sayı rasgele sayıdan büyük.");
                    System.out.println("Kalan Tahmin Hakkınız => " + (5 - right));
                } else {
                    System.out.println("Tahmin ettiğiniz sayı rasgele sayıdan küçük.");
                    System.out.println("Kalan Tahmin Hakkınız => " + (5 - right));
                }

            }
            if (right == 5) {
                System.out.println("-------------------");
                System.out.println("Üzgünüz Tahmin Hakkınız Kalmadı. Üretilen Rasgele Sayı => " + randNumber);
                System.out.println("Tahmin Ettiğiniz Sayılar:\n" + Arrays.toString(falseNumbers));
                break;
            }
        }


    }
}
