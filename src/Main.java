import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Tasks.checkSum(5, 6)); // должно вывести true
        Tasks.printStringSomeTimes("Animal", 2); // должно вывести "Animal" два раза
        Tasks.printPosOrNeg(7); // должно вывести "Positive"
        System.out.println(Tasks.isNeg(-5)); // должно вывести true
        System.out.println(Tasks.isLeapYear(2020)); // должно вывести true
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Tasks.invertArray(arr1); // должно заменить 0 на 1 и 1 на 0
        System.out.println(Arrays.toString(arr1)); // {0, 0, 1, 1, ...}
        int[] arr2 = new int[100];
        Tasks.fillArray(arr2); // должно заполнить массив значениями от 1 до 100
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Tasks.multiplyBy6(arr3); // каждое число меньше 6 должно быть умножено на 2
        System.out.println(Arrays.toString(arr3));
        int n = 5; // размер массива
        int[][] array = Tasks.fillDiagonal(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int len = 3;
        int initialValue = 6;

        int[] result = Tasks.createArray(len, initialValue);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
