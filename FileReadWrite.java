import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    
    // Method to write data to a file
    public static void writeToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data to write to the file:");
            String data = scanner.nextLine();

            fileWriter.write(data);
            fileWriter.close();
            System.out.println("Data written to the file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static void readFromFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("File content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();

        writeToFile(fileName);
        readFromFile(fileName);
    }
}
