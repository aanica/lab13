package zadanie2;

public class Main {
    public static void main(String[] args) {
        FixedWageWorker w1=new FixedWageWorker(550.4);
        HourlyWorker w2=new HourlyWorker(4.5);
        System.out.println("Зарплата работника с фиксированной оплатой: "+w1.salary());
        System.out.println("Зарплата работника с почасовой оплатой: "+w2.salary());

    }
}
