import java.util.Random;
import java.util.Scanner;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        rockPaperScissors();
    }
    public static void restart(){
        rockPaperScissors();
    }
    public static void rockPaperScissors(){
        String Comp;
        String Human = "";
        Random random = new Random();
        int a = random.nextInt(4);
        switch (a){
            case 1 -> Comp = "Rock";
            case 2 -> Comp = "Paper";
            case 3 -> Comp = "Scissors";
            default -> Comp = "";
        }
        System.out.println("Choose:\n 1 for rock\n 2 for Paper \n 3 for Scissors");
        int b = scanner.nextInt();
        switch (b){
            case 1 -> Human = "Rock";
            case 2 -> Human = "Paper";
            case 3 -> Human = "Scissors";
        }
        switch (Comp){
            case "Rock": switch (Human){
                    case "Rock" -> System.out.println("Both Chose Rock! It's a Draw.");
                    case "Paper" -> System.out.println("Computer chose Rock! You won.");
                    case "Scissors" -> System.out.println("Computer chose Rock! You lost.");
            }
            break;
            case "Paper" :switch (Human){
                    case "Rock" -> System.out.println("Computer chose Paper! You Lost.");
                    case "Paper" -> System.out.println("Both chose Paper! It's a Draw.");
                    case "Scissors" -> System.out.println("Computer chose Paper! You Won.");
            }
            break;
            case "Scissors":switch (Human){
                case "Rock" -> System.out.println("Computer chose Scissor! You won.");
                case "Paper" -> System.out.println("Computer chose Scissor! You lost.");
                case "Scissors" -> System.out.println("Computer chose Scissor! It's a Draw.");
            }
            break;
            default: {
                System.out.println("Something went Wrong");
                restart();
            }
            break;
        }
        restart();
    }

}
