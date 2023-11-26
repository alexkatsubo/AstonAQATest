import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AppData {

    private final String[] header;
    private final int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public static AppData load(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String[] header = reader.readLine().split(";");
            int[][] data = reader.lines()
                    .map(line -> Arrays.stream(line.split(";"))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toArray(int[][]::new);
            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String[] header = {"Length", "Width", "Height"};
        int[][] data = {{10 , 20, 30}, {5, 30, 50}, {7, 21, 49}};

        AppData appData = new AppData(header, data);
        appData.save("data.csv");

        AppData loadedData = AppData.load("data.csv");
        if (loadedData != null) {
            for (String column : loadedData.header) {
                System.out.print(column + "\t");
            }
            System.out.println();
            for (int[] row : loadedData.data) {
                for (int value : row) {
                    System.out.print(value + "\t\t");
                }
                System.out.println();
            }
        }
    }

    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(String.join(";", header));
            for (int[] row : data) {
                writer.println(Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(";")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}