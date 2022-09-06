package de.wehnerts.tdd;

import java.util.Arrays;

public class chopIterative {

    public static int chop(int[] arrayToChop, int searchTarget) {
        int idxToReturn = -2;
        int idxToCheck = arrayToChop.length/2;
        int idxMax = arrayToChop.length;
        int idxMin = 0;
        if (idxMax==0){
            return -1;
        }
        do {
            if (arrayToChop[idxToCheck]==searchTarget){
                System.out.println("yeah!");
                idxToReturn = idxToCheck;
            }else if (idxMin+1 == idxMax &&  arrayToChop[idxToCheck]!=searchTarget){
                idxToReturn = -1;
            } else if (arrayToChop[idxToCheck]<searchTarget) {
                idxMin=idxToCheck;
            }else if (arrayToChop[idxToCheck]>searchTarget) {
                idxMax=idxToCheck;
            }
            idxToCheck=idxMin+(idxMax-idxMin)/2;
        }while (idxToReturn==-2);

        System.out.println(searchTarget);
        ;return idxToReturn;
    }

    public static void main(String[] args) {
        int idxOfTarget = chop(new int[] {3, 4, 6, 8, 11}, 8);
        System.out.println(idxOfTarget);
    }
}
