package za.ac.mandela.wrpv301.wrpv301;

import java.util.Scanner;

public class Task1 {

        public static void main(String args[]) {
            System.out.println("Please enter your number");
            Scanner in = new Scanner(System.in);
            String sNumber = in.nextLine();
            System.out.println("Iterative method = " + iterative(sNumber));
            System.out.println("Recursive method = " + recursive(sNumber));

        }

        private static int iterative(String sInput) {
            int iSum = 0;
            for (int i = 0; i < sInput.length(); i++)
            {iSum += Character.getNumericValue(sInput.charAt(i));}
            return iSum;
        }
        private static int recursive(String sRinput){
            return doRecursive(sRinput, sRinput.length());
        }
        private static int doRecursive(String sInput, int iCount){
            if(iCount == 0)
                return 0;
            else
                iCount--;
                return  Character.getNumericValue(sInput.charAt(iCount)) + doRecursive(sInput, iCount);
        }
    }