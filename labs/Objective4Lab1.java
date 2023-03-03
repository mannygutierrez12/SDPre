import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name?");
    String userFirstName = keyboard.nextLine();
    System.out.println("What is your last name?");
    String userLastName = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    String userFavoriteAnimal= keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String userFavoriteFood = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    String userFavoriteSong= keyboard.nextLine();
    System.out.println("My name is " + userFirstName + userLastName);
    System.out.println("My favorite animal is the " + userFavoriteAnimal);
    System.out.println("My favorite food is " + userFavoriteFood);
    System.out.println("my favorite song is " +  userFavoriteSong);

    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}