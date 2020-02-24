
public class TicTacToe {
    private String line1;
    private String line2;
    private String line3;

    /**
     * Constructs a TicTacToe object and initializes line1, line2, and
     * line3 to their appropriate values to represent a TicTacToe board.
     */
    public TicTacToe() {
        line1 = "123";
        line2 = "456";
        line3 = "789";

    }

    /**
     * Makes a move for the game by updating the board with
     * the player move.
     */
    public void move(String spot, String player) {
        line1 = line1.replace(spot, player);
        line2 = line2.replace(spot, player);
        line3 = line3.replace(spot, player);
    }

    /**
     * Returns the game board in a String format
     */
    public String getBoard() {
        String board = "";

        board = board + line1; //add line1
        board = board + "\n";  //add new line
        board = board + line2; //add line2
        board = board + "\n";  //add new line
        board = board + line3; //add line3

        return board;
    }

    public char getWinner() {
        String catsGame = "C";
        String notDone = "N";

        if(line1.charAt(0) == line1.charAt(1) && line1.charAt(1) == line1.charAt(2)) {
            return line1.charAt(0);
        }
        else if (line2.charAt(0) == line2.charAt(1) && line2.charAt(1) == line2.charAt(2)){
            return line2.charAt(0);
        }
        else if (line3.charAt(0) == line3.charAt(1) && line3.charAt(1) == line3.charAt(2)){
            return line3.charAt(0);
        }
        else if (line1.charAt(0) == line2.charAt(0) && line2.charAt(0) == line3.charAt(0)){
            return line1.charAt(0);
        }
        else if (line1.charAt(1) == line2.charAt(1) && line2.charAt(1) == line3.charAt(1)){
            return line1.charAt(1);
        }
        else if (line1.charAt(2) == line2.charAt(2) && line2.charAt(2) == line3.charAt(2)){
            return line1.charAt(1);
        }
        else if (line1.charAt(0) == line2.charAt(1) && line2.charAt(1) == line3.charAt(2)){
            return line1.charAt(0);
        }
        else if (line1.charAt(2) == line2.charAt(1) && line2.charAt(1) == line3.charAt(0)){
            return line1.charAt(2);
        }
        else if(line1.substring(0,1).equals("1") || line1.substring(1,2).equals("2") || line1.substring(2,3).equals("3") || line2.substring(0,1).equals("4") || line2.substring(1,2).equals("5") || line2.substring(2,3).equals("6") || line3.substring(0,1).equals("7") || line3.substring(1,2).equals("8") || line3.substring(2,3).equals("9")) {
            return notDone.charAt(0);
        }
        return catsGame.charAt(0);
    }
}
