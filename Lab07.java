import p.labs.Park;

//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
//об аттракционах, времени их работы и стоимости.

public class Lab07 {
    public static void main(String[] args) throws Exception{
        Park park = new Park();
        park.readInformation();
        System.out.println(park);
    }
}