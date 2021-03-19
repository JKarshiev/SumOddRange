//This bunch of code finds out odd numbers in the given range of numbers and add the together
// at the end it prints out sum of that numbers to the console
package com.karshiev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert two numbers that you want to find odd ones among them and sum them up: ");
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        System.out.println("Sum of the odd numbers from " + startNumber + " to " + endNumber + " equals to " + sumOdd(startNumber,endNumber));
    }
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        return number % 2 != 0;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                  if ( isOdd(i)){
                      sum +=i;
                  }
            }
            return sum;
        }else return -1;
    }
}
