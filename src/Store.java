import java.util.ArrayList;

public class Store {
    private String name;
    private double price;
    private static int numberOfInstrument;
    public static ArrayList<Store> store=new ArrayList<>();
    public Store(String name,double price) {
        this.name=name;
        this.price=price;
        numberOfInstrument=1;
      addinstrument();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        price = price;
    }
    public void setNumberOfInstrument(int numberOfInstrument){
        this.numberOfInstrument=numberOfInstrument;
    }
    public int getNumberOfInstrument(){
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

    private void addinstrument(){// chon dar khod object hastim az this estefade mikonim va dg lazem ni esm begirim
        for(int i=0;i<store.size();i++){
            if (store.get(i).getName().equals(this.getName())){
                store.get(i).numberOfInstrument++;
                return;
            }
        }
        store.add(this);
    }
}
