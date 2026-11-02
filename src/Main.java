import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[row][column] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Матриця 4x4:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.printf("%4d", matrix[row][column]);
            }
            System.out.println();
        }

        int evenRowsSum = 0;
        int oddRowsSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (row % 2 == 0) {
                    evenRowsSum += matrix[row][column];
                } else {
                    oddRowsSum += matrix[row][column];
                }
            }
        }

        long evenColumnsProduct = 1;
        long oddColumnsProduct = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (column % 2 == 0) {
                    evenColumnsProduct *= matrix[row][column];
                } else {
                    oddColumnsProduct *= matrix[row][column];
                }
            }
        }

        System.out.println();
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + evenRowsSum);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + oddRowsSum);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + evenColumnsProduct);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + oddColumnsProduct);

        int targetSum = 0;
        for (int column = 0; column < matrix.length; column++) {
            targetSum += matrix[0][column];
        }

        boolean isMagicSquare = true;

        for (int row = 0; row < matrix.length; row++) {
            int currentRowSum = 0;
            for (int column = 0; column < matrix.length; column++) {
                currentRowSum += matrix[row][column];
            }
            if (currentRowSum != targetSum) {
                isMagicSquare = false;
            }
        }

        for (int column = 0; column < matrix.length; column++) {
            int currentColumnSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                currentColumnSum += matrix[row][column];
            }
            if (currentColumnSum != targetSum) {
                isMagicSquare = false;
            }
        }

        int mainDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
            secondDiagonalSum += matrix[i][matrix.length - 1 - i];
        }
        if (mainDiagonalSum != targetSum || secondDiagonalSum != targetSum) {
            isMagicSquare = false;
        }

        System.out.println();
        if (isMagicSquare) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}