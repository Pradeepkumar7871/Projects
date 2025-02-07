package Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        String[] play = {"Rock", "Paper", "Scissor"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your move from (Rock , paper, Scissor)  ");
        String move = sc.nextLine();
        System.out.println("your move= " + move);


        int index = new Random().nextInt(play.length);
        String compmove = play[index];
        System.out.println("Computer move= " + compmove);

        if (move.equalsIgnoreCase(compmove)) {
            System.out.println("game tie");
        } else {
            switch (move.toLowerCase()) {
                case "rock":
                    if (compmove.equals("Scissor")) {
                        System.out.println("You win");
                    } else {
                        System.out.println("you lose");
                    }
                    break;
                case "scissor":
                    if (compmove.equals("rock")) {
                        System.out.println("you win");
                    } else {
                        System.out.println("You lose");
                    }
                    break;
                case "paper":
                    if (compmove.equals("scissor")) {
                        System.out.println("you win");
                    } else {
                        System.out.println("You lose");
                    }
                    break;
                default:
                    System.out.println("please enter valid move");
            }


        }


    }
}


