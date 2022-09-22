package de.wehnerts;

import java.util.Scanner;

public class BinarySearchRecursion {
    static int[] someIntegers = {2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 19};
    static int indexMax = someIntegers.length;

    static int hitIdx = -2;
    //Funktion, die sich aus sich selbst aufruft

    private static int searchReku(int indexMax, int indexMin, int searchedNumber) {
        int indexToCheck = indexMin + (indexMax - indexMin) / 2;
        System.out.println("Index to Check: " + indexToCheck + " indexMin: " + indexMin + " IndexMax: " + indexMax);
        if (indexMin + 1 == indexMax && someIntegers[indexToCheck] != searchedNumber) {
            hitIdx = -1;
        } else if (someIntegers[indexToCheck] == searchedNumber) {
            hitIdx = indexToCheck;
        } else if (searchedNumber < someIntegers[indexToCheck]) {
            indexMax = indexToCheck;
            hitIdx = searchReku(indexMax, indexMin, searchedNumber);
        } else if (searchedNumber > someIntegers[indexToCheck]) {
            indexMin = indexToCheck;
            hitIdx = searchReku(indexMax, indexMin, searchedNumber);
        }
        return hitIdx;
    }

    public static void main(String[] args) {
        int indexMin = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Which Number do you search? ");
        int searchedNumber = scan.nextInt();
        hitIdx = searchReku(indexMax, indexMin, searchedNumber);
        if (hitIdx == -1) {
            System.out.println("Sorry Dude! This number is not in the Array");
        } else {
            System.out.println(searchedNumber + " is at Position: " + hitIdx);
        }
    }
}
