import java.util.Scanner;

public class Drills {

    public static void main(String[] args){

        // Declare 5 different data types with initial values
        int a = 5;
        double b = 4.5;
        float c = 4.33f;
        boolean d = true;
        String e = "everything";

        // A standard for loop printing a message three times
        for(int i = 0; i <= 2; i++) {
            System.out.println("I love AP Computer Science A");
        }

        // A for-each loop traversing a String[array]
        String[] names = {"Mike", "Matt", "Mack", "Maam"};
        for(String whoseName : names) {
            System.out.println(whoseName + " ");
        }

        // An infinite loop
        while(true) {
            System.out.println("hey there!");
        }

        // a short-circuit conditional with four tests
        if(a > b && b < a || c > a && c < b) {
            System.out.println("Alright, you win!");
        }


        // Break a loop if a conditional passes
        for(int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
            if(i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
        }

        // Loop through each char in a String
        String example = "potatoes";
        for(int i = 0; i < example.length(); i++)
            System.out.println(example.charAt(i));

        // Print only the first three letters in “word”
        String str = "word";
        String arrrMatey = str.substring(0, 3);
        System.out.println(arrrMatey);

        // Print all the odd numbers from 1 - 100
        for(int num = 1; num < 100; num += 2) {
            System.out.println(num);
        }

        // Create a Scanner and take an input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        
        // Create a Scanner, take a number, and count down from that number to 0
        Scanner scan = new Scanner(System.in);
        System.out.print("The number I should count down from is: ");
        int inputer = scan.nextInt();
        for(int i = inputer; i >= 0; i--) {
            System.out.println(i);
        }


    }

    // Create a method that returns a comparison (include a JavaDoc comment)
   
    /** 
     * Compares 2 intergers and returns a string based off of their comparison
     * 
     * @param num1
     * @param num2
     * @return
     */

    public String compareNums(int num1, int num2) {
        if(num1 < num2) return "I really like " + num2;
        else if(num2 < num1) return "I really like " + num1; 
        else return "Welp, this is lame";
    }


}