package zadanie2;

public class HourlyWorker extends Salary{
    private double HourSalary;
    public HourlyWorker(double HourSalary){
        this.HourSalary=HourSalary;
    }
    @Override
    public double salary() {
        return 20.8*8* this.HourSalary;
    }
}
