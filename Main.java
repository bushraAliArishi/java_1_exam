import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Write a Java program that accept three numbers from the user and print the largest number
        System.out.println("the largest number is  " + largestNumber());
        //Write a Java program that accept a String and a number from the user,then print the character in the given index .
        System.out.println("the result is  " + characterAtIndex());
        // Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        System.out.println("the result is  " + totalSum());
        System.out.println();
        /*Write a Java program to find positive and negative numbers of a given array:
       -  Original Array:
      [10, -21 , 30, 31, -25]
     -  Expected Output:
     10  is a positive number
     -21 is a negative number
      30 is a positive number
      31 is a positive number
     -25 is a negative number
*/
        int[] numArray = {10, -21, 30, 31, -25};
        for (int v : numArray) {
            if (v >= 0) {
                System.out.println(v + " is a positive number ");
            } else {
                System.out.println(v + " is a negative number ");
            }

        }
        /*Write a Java program to find a shortest word of a given array:
        - Original Array:
         [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
        - Expected Output:
           JAVA
*/
        System.out.println("the shortest word is  " + shortestWord());

    }

    public static double largestNumber() {
        System.out.println("find the largest number");
        Scanner input = new Scanner(System.in);
        int count = 0;
        double bNum = 0;
        while (count < 3) {
            System.out.println(count+" Enter a number ");
            double num = input.nextDouble();
            count++;
            if (bNum < num) {
                bNum = num;
            } else {continue;}

        }
        return bNum;
    }

    public static char characterAtIndex() {
        System.out.println("find the character by the index");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word ");
        String text = input.nextLine();
        System.out.println("Enter a number ");
        int indexNum = input.nextInt();

        return text.charAt(indexNum);
    }

    public static double totalSum() {
        System.out.println("find the total sum to stop enter 000 ");
        Scanner input = new Scanner(System.in);
        boolean enter = true;
        double sum = 0;
        while (enter) {
            System.out.println("Enter a number ");
            double num = input.nextDouble();
            if (num == 000) {
                enter = false;
                break;
            } else{ sum = sum + num;}

        }
        return sum;
    }

    public static String shortestWord() {

        System.out.println("find the shortest word");
        String[] wrodArray = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        String shoortWord = wrodArray[0];
        for (String v : wrodArray) {
            if (v.length() < shoortWord.length()) {
                shoortWord = v;

            }

        }
        return shoortWord;
    }

}