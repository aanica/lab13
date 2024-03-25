package zadanie2;

public class FixedWageWorker extends Salary{
    private double MonthSalary;
    public FixedWageWorker(double MonthSalary){
        this.MonthSalary=MonthSalary;
    }
    @Override
    public double salary() {
        return MonthSalary;
    }
}
