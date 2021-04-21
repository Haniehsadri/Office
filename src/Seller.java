public class Seller extends Employee {

    private static double basesalary;
    public final double vacationdeduction=0.03;

    public Seller(String name, String lastname, int personalId, String nationalId,
                  String password, String username, String employmentType, String fathersname, String education, double basesalary) {
        super(name, lastname, personalId, nationalId
                , password, username, employmentType, fathersname, education);
        this.basesalary = basesalary;
    }

    public static void setBasesalary(double basesalary) {
        Seller.basesalary = basesalary;
    }

    public double getBasesalary() {
        return basesalary;
    }

    @Override
    public double getSalary() {
        return getBasesalary();
    }

    public double salarywithvacation (){
        if (getVacation()<3){
            return  getSalary();
    }
         else
             {return( getSalary() -vacationdeduction *getVacation());}

    }

    public  void Sell(Instrument instrument) {
        for (int i = 0; i < Store.store.size(); i++) {
            if (Store.store.get(i).getName().equals(instrument.getName())) {
                Store.store.get(i).setNumberOfInstrument(Store.store.get(i).getNumberOfInstrument()-1);
                setBasesalary(getSalary()+10);

                System.out.printf("you sold %s %n your salary increased to : %.2f ",instrument.getName(),getSalary());
            }
           else{ System.out.println("the instrument is not availavle in store ");}
            }

        }
    }
