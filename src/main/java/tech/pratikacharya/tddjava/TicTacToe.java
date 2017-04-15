package tech.pratikacharya.tddjava;

/**
 * Created by Pratik Acharya on 4/15/2017.
 */
public class TicTacToe {

    private char[][] board = new char[][]{
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'}
    };
    private char lastPlayer = '\0';

    public void play(int x, int y) {
        checkAxis(x, "X is outside board");
        checkAxis(y, "Y is outside board");
        setBox(x, y);
        lastPlayer = nextPlayer();
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }

    private void checkAxis(int axis, String message) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException(message);
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'X')
            return 'O';
        return 'X';
    }


}
