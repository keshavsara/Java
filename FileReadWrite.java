import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    public static void writeToFile(String fileName) {
        FileWriter fileWriter = null;
        Scanner scanner = null;
        try {
            fileWriter = new FileWriter(fileName);  
            scanner = new Scanner(System.in);
            System.out.println("Enter data to write to the file:");
            String data = scanner.nextLine();

            fileWriter.write(data);  
            System.out.println("Data written to the file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            
            try {
                if (fileWriter != null) {
                    fileWriter.close(); 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (scanner != null) {
                scanner.close();  
            }
        }
    }
    public static void readFromFile(String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName); 
            bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("File content:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); 
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        } finally {
            
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();  
                }
                if (fileReader != null) {
                    fileReader.close();  
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();

        writeToFile(fileName); 
        readFromFile(fileName);  

        scanner.close(); 
    }
}
