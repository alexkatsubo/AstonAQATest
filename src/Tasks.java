public class Tasks {
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printStringSomeTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void printPosOrNeg(int num) {
        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNeg(int num) {
        return num < 0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void multiplyBy6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}