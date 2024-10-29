import java.util.*;
public class GuessingGame {
    public static void main(String[] args){
        int randomNumber = (int)(Math.random() * 101);
        int user = 555;
        int count = 0;
        Scanner input = new Scanner(System.in);
        while(user != randomNumber){
            System.out.println("Guess a number from 0 - 100: ");
            user = input.nextInt();
            if(user > randomNumber){
                System.out.println("Too High!");
            }
            else if(user < randomNumber){
                System.out.println("Too Low!");
            }
            count++;
        }
        System.out.println("It took you " + count + " tries to guess the number.");
        if (count <= 7){
            System.out.println("Good Job!");
        }
    }
}
