package zadanie_2;

public class DevelopedCountry extends Country { //развитая страна
    private double gdp;//ввп

    public DevelopedCountry(String name, int population, double gdp) {
        super(name, population);
        this.gdp = gdp;
    }

    public double getGdp() {

        return gdp;
    }
}
