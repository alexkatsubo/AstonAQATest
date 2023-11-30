package Lesson_7;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] invalidArray1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15"}
        };
        String[][] invalidArray2 = {
                {"1", "2", "3", "4"},
                {"five", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        ArrayData data1 = new ArrayData(validArray);
        ArrayData data2 = new ArrayData(invalidArray1);
        ArrayData data3 = new ArrayData(invalidArray2);

        ArrayProcessor processor = new ArrayProcessor();
        ArrayResult result = new ArrayResult();

        try {
            int sum1 = processor.processArray(data1);
            result.displayResult(sum1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int sum2 = processor.processArray(data2);
            result.displayResult(sum2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int sum3 = processor.processArray(data3);
            result.displayResult(sum3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
