package p.labs;

import java.io.File;
import java.util.Scanner;

public class Park {
    int k = 9;
    public Information[] information = new Information[9];

    public Park(){
        for(int i = 0; i < k; i ++)
            this.information[i] = new Information();
    }

    public class Information{
        String timeWork;
        String price;
        String name;

        public Information() {};

        public String getTimeWork() {
            return timeWork;
        }

        public void setTimeWork(String timeWork) {
            this.timeWork = timeWork;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Название: " + name + '\t' +
                    "Время работы: " + timeWork + '\t' + "Цена: " + price;
        }
    }

    public Information[] readInformation() throws Exception{
        File file = new File("C:\\Users\\Лариса\\Desktop\\БГУ\\МИиИ\\IdeaProjects\\Labs\\text\\AmusementRides.txt");
        Scanner read = new Scanner(file);
        for(int i = 0; i < k && read.hasNextLine(); i++){
            information[i].setName(read.nextLine());
            information[i].setTimeWork(read.nextLine());
            information[i].setPrice(read.nextLine());
        }
        return information;
    }

    @Override
    public String toString() {
        for(int i = 0; i < k; i++){
            System.out.println(information[i]);
        }
        return "Welcome!";
    }
}
