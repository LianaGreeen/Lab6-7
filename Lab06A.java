import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Lab06A {
    public static void main(final String[] args) {
        String string = readFile();
        char[] chars = string.toCharArray();
        int k = 0;
        int lenght = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]))
                k = k + 1;
            else {
                if(k != 0 && k > lenght) {
                    lenght = k;
                    k = 0;
                }
            }
        }
        writeFile(lenght);
        System.out.println(string);
        System.out.println( "Количество: " + lenght);
    }

    public static String readFile() {
        String string = "чмок";
        try {
            File file = new File("C:\\Users\\Лариса\\Desktop\\БГУ\\МИиИ\\IdeaProjects\\Labs\\text\\SetA.txt");
            Scanner read = new Scanner(file);
            if(read.hasNextLine())
                string = read.nextLine();
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        return string;
    }

    public static void writeFile(int lenght){
        try(FileWriter writer = new FileWriter("C:\\Users\\Лариса\\Desktop\\БГУ\\МИиИ\\IdeaProjects\\Labs\\text\\SetB.txt", false))
        {
            String text = "Количество: ";
            writer.write(text + lenght);
            writer.flush();
        }
        catch(IOException ex){ System.out.println(ex.getMessage()); }
    }
}

