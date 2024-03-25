package zadanie_2;

public class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void getPopulation(int population){
        this.population=population;
    }
    public int getPopulation() {
        return population;
    }

    public void display()
    {
        System.out.println("name: "+this.name);
        System.out.println("population: "+this.population);
    }
}

