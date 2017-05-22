package gametetris;

/**
 * Java. Classic Game Tetris
 *
 * @version 0.3.7 dated May 22, 2017
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;

class GameTetris extends JFrame {

    final String TITLE_OF_PROGRAM = "Tetris";
    final int BLOCK_SIZE = 25; // size of one block
    final int ARC_RADIUS = 6;
    final int FIELD_WIDTH = 10; // size game field in block
    final int FIELD_HEIGHT = 18;
    final int START_LOCATION = 180;
    final int FIELD_DX = 7; // determined experimentally
    final int FIELD_DY = 26;
    int gameScore = 0;
    int[][] mine = new int[FIELD_HEIGHT + 1][FIELD_WIDTH]; // mine/glass
    JFrame frame;
    boolean gameOver = false;
    public static void main(String[] args) {
        new GameTetris();
    }

    GameTetris() {
        setTitle(TITLE_OF_PROGRAM);
        setBounds(START_LOCATION, START_LOCATION, FIELD_WIDTH * BLOCK_SIZE + FIELD_DX, FIELD_HEIGHT * BLOCK_SIZE + FIELD_DY);
        setResizable(false);

        setVisible(true);
        Arrays.fill(mine[FIELD_HEIGHT], 1); // create a ground for mines
    }


    class Canvas extends JPanel { // my canvas for painting
        @Override
        public void paint(Graphics g) {
            super.paint(g);
        }
    }
}
