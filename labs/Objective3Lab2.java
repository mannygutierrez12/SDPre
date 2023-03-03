public class Objective3Lab2 {
    public static void main(String[] args){
        double num1 = 10;
        double num1Square = num1 * num1;
        double num2 = 8;
        double num2Square = num2 * num2;
        double sum = num1Square + num2Square;
        double result = Math.sqrt(sum);
        System.out.printf("The hypotenuse of a triangle with sides %f and %f is %f", num1, num2, result);
    }




}