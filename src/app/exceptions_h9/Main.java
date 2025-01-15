package app.exceptions_h9;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "wrong", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = calculator.doCalc(validArray);
            System.out.println("Result: " + result);
        } catch (ArrayValueCalculator.ArraySizeException | ArrayValueCalculator.ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            calculator.doCalc(invalidSizeArray);
        } catch (ArrayValueCalculator.ArraySizeException | ArrayValueCalculator.ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            calculator.doCalc(invalidDataArray);
        } catch (ArrayValueCalculator.ArraySizeException | ArrayValueCalculator.ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}