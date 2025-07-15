package Java.Projects;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int RandomInt= rand.nextInt(100+1);

        int guess=0;
        int attempts=0;
        while(true){
            System.out.print("Guess a number between 1 and 100:");
            guess=sc.nextInt();
            attempts++;
            if(guess>100 || guess<0){
                System.out.println("Please enter a valid output");
                attempts++;
            }
            else if(guess>RandomInt){
            System.out.println("Your guess is higher");
            attempts++;
            }
            else if(guess<RandomInt){
                System.out.println("Your guess is lower");
            attempts++;
            }
            else if(guess==RandomInt){
                System.out.println("Congratulations you guessed the number "+RandomInt+" correctly in "+attempts+" attempts");
                break;
            }
            else{
                System.out.println("Sorry! There's an issue");
                attempts++;
            }
        }
    }
}
