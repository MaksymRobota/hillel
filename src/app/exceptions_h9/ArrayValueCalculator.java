package app.exceptions_h9;

public class ArrayValueCalculator {

    public static class ArraySizeException extends RuntimeException {
        public ArraySizeException(String message) {
            super(message);
        }
    }

    public static class ArrayDataException extends RuntimeException {
        public ArrayDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public int doCalc(String[][] array) {
        if (array.length != 4 || !allRowsHaveFourColumns(array)) {
            throw new ArraySizeException("The array must be 4x4 in size");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(
                            "Error in array data at position [" + i + "][" + j + "]: " + array[i][j], e
                    );
                }
            }
        }
        return sum;
    }

    private boolean allRowsHaveFourColumns(String[][] array) {
        for (String[] row : array) {
            if (row.length != 4) {
                return false;
            }
        }
        return true;
    }
}
