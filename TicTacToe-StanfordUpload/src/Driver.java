import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);
        String spot;
        String playerTurn;
        boolean gameOver = false;
        System.out.println(game.getBoard());
        playerTurn = "X";

        while(gameOver == false)
        {
            System.out.print("Enter your move: ");
            spot = input.nextLine();
            game.move(spot, playerTurn);
            System.out.println(game.getBoard());
            if (game.getWinner() == 'N') {
                if(playerTurn == "X")
                    playerTurn = "O";
                else
                    playerTurn = "X";
            }
            else{
                System.out.println(playerTurn + " wins!");
                gameOver = true;
            }
        }
    }
}
