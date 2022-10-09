//THIS PROGRAM PREPARED BY Jay Thanki 21CE143
package PracticalAssignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class P7 {
    File readInFile = new File("text.txt");

    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "File Handling in Java using " +
                " FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter writeInFile = new FileWriter("text.txt");
        // readFileme(str,file="text.txt");
        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));

        System.out.println("Writing successful");
        // close the file
        writeInFile.close();

        // reader
        int ch;
        // check if File exists or not
        FileReader readInFile = new FileReader("text.txt");
        System.out.println("File created SucessFully");
        // FileReader readInFileReader = null;
        // readInFil = new FileReader("text.txt");
        System.out.println("File is found");
        // read from FileReader till the end of file
        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);

        // close the file
        readInFile.close();
    }
}
