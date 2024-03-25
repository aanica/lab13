import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("введите номер задания:");
        int n= in.nextInt();
        switch (n){
            case 1:
                int[] val = {1, 2, 3};
                int[] w = {1, 2, 10};
                ValuesAndWeight p = new ValuesAndWeight(val, w);
                int randEl = ValuesAndWeight.getRandomElement();
                System.out.println(randEl);
                break;
            case 2:
                System.out.println("введите название отеля");
                String name=in.next();
                System.out.println("введите адрес отеля");
                String adress=in.next();
                System.out.println("введите рейтинг отеля");
                double rate=in.nextDouble();
                System.out.println("введите контактный номер телефона отеля");
                int telephone=in.nextInt();
                Hotel h=new Hotel(name,adress,rate,telephone);
                System.out.println("новый отель успешно создан!");
                break;
            default:
                System.out.println("такого задания нет");
        }
    }
}