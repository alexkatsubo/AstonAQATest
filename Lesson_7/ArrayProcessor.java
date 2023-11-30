package Lesson_7;

public class ArrayProcessor {


    public int processArray(ArrayData arrayData) throws Exception {
        String[][] array = arrayData.getArray();
        if (array.length != 4) {
            throw new Exception("Array size is not 4x4");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new Exception("Array size is not 4x4");
            }
        }

        int sum = 0;
        for (String[] row : array) {
            for (String cell : row) {
                try {
                    sum += Integer.parseInt(cell);
                } catch (NumberFormatException e) {
                    throw new Exception("Invalid data: " + cell);
                }
            }
        }
        return sum;
    }
}
