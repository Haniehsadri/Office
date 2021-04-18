import java.util.ArrayList;

public class Store {
    public static ArrayList<Instrument> store=new ArrayList<>();


    public static void addinstrument(Instrument instrument){
        for(int i=0;i<store.size();i++){
            if (store.get(i).getName().equals(instrument.getName())){
                store.get(i).setNumberOfInstrument(store.get(i).getNumberOfInstrument()+1);
                return;
            }
        }
        store.add(instrument);
    }

    public static void report (){
        for (int i=0;i<store.size();i++){
            System.out.printf("nameof instrument : %s%n price of instrument: %2f %n numberofinstrument :%d",
                    store.get(i).getName(),store.get(i).getPrice(),store.get(i).getNumberOfInstrument());
        }

    }
}
