package MyProject;

import java.util.Scanner;

class ProjectRun { // ---- main class
    Scanner sc = new Scanner(System.in);

    public class Guesser { // ----- guesser class
        int guessernum = 0;

        public int takeGuesserNumber() {
              System.out.println();
            System.out.print("Guesser, guess a number : ");
            guessernum = sc.nextInt();
            return guessernum;
        }

    }

    public class Players { // ----players class
        int playernum = 0;

        public int takePlayersNumber() {
            System.out.println();
            System.out.print("take a number from player : ");
            playernum = sc.nextInt();
            return playernum;
        }
    }

    public class Umpire { // ----umpire class

        public void compare() {
            Guesser g = new Guesser();
            int guessernum = g.takeGuesserNumber();
            Players p = new Players();
            int player1 = p.takePlayersNumber();
            int player2 = p.takePlayersNumber();
            int player3 = p.takePlayersNumber();
            if (guessernum == player1) {
                if (guessernum == player2 && guessernum == player3) {
                    System.out.println(" \n All players won the game");
                } else if (guessernum == player2) {
                    System.out.println("\n player1 and player2 won the game");
                } else if (guessernum == player3) {
                    System.out.println("\n player1 and player3 won the game");
                } else {
                    System.out.println("\n player1 won the game");
                }
            } else if (guessernum == player2) {
                if (guessernum == player3) {
                    System.out.println("\n player2 and player3 won the game");
                } else {
                    System.out.println("\n player2 won the game");
                }
            } else if (guessernum == player3) {
                System.out.println("\n player3 won the game");
            } else {
                System.out.println("\n ------Mis-match try again-----");
            }
        }
    }

    public void run() {
        Umpire u = new Umpire();
        u.compare();
    }

    public static void main(String[] args) {
        ProjectRun r = new ProjectRun();
        r.run();
        

    }
}