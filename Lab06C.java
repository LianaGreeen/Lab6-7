import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

//В файле содержится совокупность строк. Найти номера строк, совпадающих с заданной строкой.
//Имя файла и строка для поиска — аргументы командной строки.
//Вывести строки файла и номера строк, совпадающих с заданной.

public class Lab06C {
    public static void main(final String[] args){
        Scanner in = new Scanner(System.in);
        String[] text = readFile();
        String stroka = "";
        System.out.println("Введите строку для поиска: ");
        stroka = in.nextLine();
        int[] number = ComparisonStrok(text, stroka);
        System.out.println("Номера строк");
        System.out.println(Arrays.toString(number));
        writeFile(number);
    }

    public static int[] ComparisonStrok(String[] text, String stroka){
        int l = text.length;
        int[] number = new int[l];
        int n = 0;
        for(int i = 0; i < l; i++){
            if(text[i].equals(stroka)){ number[n] = i; n = n + 1; }
        }
        number = Arrays.copyOf(number,n);
        return number;
    }

    public static String[] readFile() {
        String[] text = new String[256];
        int i = 0;
        try {
            File file = new File("C:\\Users\\Лариса\\Desktop\\БГУ\\МИиИ\\IdeaProjects\\Labs\\text\\Strings.txt");
            Scanner read = new Scanner(file);
            for(i = 0; read.hasNextLine(); i++)
                text[i] = read.nextLine();
            text = Arrays.copyOf(text,i);
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        return text;
    }

    public static void writeFile(int[] number){
        try(FileWriter writer = new FileWriter("C:\\Users\\Лариса\\Desktop\\БГУ\\МИиИ\\IdeaProjects\\Labs\\text\\SetB.txt", false))
        {
            writer.write("Номера строк " + Arrays.toString(number));
            writer.flush();
        }
        catch(IOException ex){ System.out.println(ex.getMessage()); }
    }
}
