import java.util.ArrayList;

public class Instrument {
    private String name;
    private double price;
    private static int numberOfInstrument;
    public static ArrayList<Store> store = new ArrayList<>();

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
        numberOfInstrument = 1;
        Store.addinstrument(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        price = price;
    }

    public void setNumberOfInstrument(int numberOfInstrument) {
        this.numberOfInstrument = numberOfInstrument;
    }

    public int getNumberOfInstrument() {
        return numberOfInstrument;
    }

    //  public ArrayList<Store> getstore(){
    // return store;
    // }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
