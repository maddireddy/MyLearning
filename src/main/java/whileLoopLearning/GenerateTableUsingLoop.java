package whileLoopLearning;

public class GenerateTableUsingLoop {
    public static void main(String[] args) {
        int row = 1, column = 1, x;
        do {
            x = 4;
            do {
                System.out.print("");
                x--;
            } while (x >= row);
            column = 1;
            do {
                System.out.print(column + " ");
                column++;
            } while (column <= 5);
            System.out.println(" ");
            row++;
        } while (row <= 5);
    }
}
