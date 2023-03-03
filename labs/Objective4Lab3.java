
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int currentYear = 2023;
    int age;
    int birthYear; 

    
    System.out.println("How old are you?");
    age = input.nextInt();
    birthYear = currentYear - age;


    /*
    Your solution goes here
    */

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}