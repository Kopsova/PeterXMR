import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
        int a = 8;
        System.out.println("Guess a positive number");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b < a) {
            System.out.println("The stored number is higher");
        } else if (b > a) {
            System.out.println("The stried number is lower");
        } else {
            System.out.println("You found the number: 8");
        }
    }
}