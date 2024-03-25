package zadanie_2;

public class DevelopingCountry extends Country { //развивающаяся страна
    private double growthRate;//темп роста населения

    public DevelopingCountry(String name, int population, double growthRate) {
        super(name, population);
        this.growthRate = growthRate;
    }

    public double getGrowthRate() {

        return growthRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("growth rate"+this.growthRate);
    }
}
