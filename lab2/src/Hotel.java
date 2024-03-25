public class Hotel {
    private String name;
    private String adress;
    private double rate;
    private int telephone;

    public Hotel(String name, String adress, double rate, int telephone){
        this.name=name;
        this.adress=adress;
        this.rate=rate;
        this.telephone=telephone;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

}
