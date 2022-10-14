import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public int counter;

    public MyPlayer() {
        columns = new int[10];
    }

    //add your code to return the row and the column of the chip you want to take.
    //you'll be returning a data type called Point which consists of two integers.
    public Point move(Chip[][] pBoard) {


        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        Point myMove = new Point(row, column);
        listBoards();
        return myMove;

    }

    public void listBoards() {
        for (int r = 1; r < 4; r++) {
            for (int c = 0; c <= r; c++) {
                for (int b = 0; b <= c; b++) {
                    System.out.println("For board: ");
                    System.out.println(r + "-" + c + "-" + b);
                    System.out.println("The number of possible boards are: ");
                    reducer(r, c, b);

                    counter++;
                }
            }
        }
        System.out.println("Number of Boards: " + counter);
    }

    public void reducer(int x, int y, int z) {

        for (int c = z; c > -1; c = c - 1) {
            System.out.println(x + "-" + y + "-" + c);
        }
        for (int b = y-1; b > -1; b = b - 1) {
            int e = z;
            if (z > b) {
                e = b;
            }
            System.out.println(x + "-" + b + "-" + e);
        }
        for (int a = x-1; a > 0; a = a-1) {
            int d = y;
            if (y > a) {
                d = a;
            }
            System.out.println(a + "-" + d + "-" + d);
        }
    }
}


