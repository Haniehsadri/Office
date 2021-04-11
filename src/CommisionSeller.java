public class CommisionSeller extends Seller {
private int NumberOfsoldInstruments=0;
private final double CommisionRate=.025;

    public CommisionSeller(String name, String lastname, int personalId, 
                           String nationalId, String password, String username, String employmentType,
                           String fathersname, String education, double basesalary) {

        super(name, lastname, personalId, nationalId, password,
                username, employmentType, fathersname, education, basesalary);
    }

    @Override
    public double getSalary() {
        return super.getSalary()+CommisionRate*NumberOfsoldInstruments;
    }

}
