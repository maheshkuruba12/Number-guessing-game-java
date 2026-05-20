import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int number=random.nextInt(100)+1;
        int guess=0;
        System.out.println("Welcome to NumberGuessing Game");
        System.out.println("Guess a Number Between 1 to 100");

        while (guess!=number) {
            System.out.println("Guess the Number: ");
            guess=sc.nextInt();

            if(guess>number){
                System.out.println("Too High!");
            }
            else if(guess<number){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("Correct! You Guess the correct Number.");
            }
        }
        sc.close();
    }
}
