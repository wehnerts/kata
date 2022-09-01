package de.wehnerts;

import java.util.Scanner;

public class FirstApproach {
    static int[] someIntegers = {2,3,4,6,7,8,9,10,11,12,14,19};
    static int indexMax = someIntegers.length;
    static int indexMin = 0;

    private static int search(int searchedNumber){
        int step = -2;
        int count=0;
        do {
            int indexToCheck = indexMin + (indexMax - indexMin) / 2;
            System.out.println("Index to Check: "+indexToCheck+" indexMin: "+indexMin+" IndexMax: "+indexMax);

            if (indexMin+1 == indexMax && someIntegers[indexToCheck] != searchedNumber){
                step=-1;
            } else if (someIntegers[indexToCheck] == searchedNumber) {
                step = indexToCheck;
            } else if (searchedNumber < someIntegers[indexToCheck]) {
                //Take left part of Array
               indexMax = indexToCheck;
            } else if (searchedNumber > someIntegers[indexToCheck]) {
                //Take right part of Array
               indexMin = indexToCheck;

            }
            count++;
        }while (step==-2);

       return step;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which Number do you search? ");
        int searchedNumber = scan.nextInt();
        if ( search(searchedNumber)==-1){
            System.out.println("Sorry Dude! This number is not in the Array");
        }else{
            System.out.println(searchedNumber+" is at Position: "+  search(searchedNumber));
        }
    }
}