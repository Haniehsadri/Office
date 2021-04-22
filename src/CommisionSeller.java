public class CommisionSeller extends Seller {
    private int NumberOfsoldInstruments = 0;
    private final double CommisionRate = .025;

    public CommisionSeller(String name, String lastname, int personalId,
                           String nationalId, String password, String username, String employmentType,
                           String fathersname, String education, double basesalary) {

        super(name, lastname, personalId, nationalId, password,
                username, employmentType, fathersname, education, basesalary);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    public void Sell(Instrument instrument) {
        for (int i = 0; i < Store.store.size(); i++) {
            if (Store.store.get(i).getName().equals(instrument.getName())) {
                Store.store.get(i).setNumberOfInstrument(Store.store.get(i).getNumberOfInstrument() - 1);
                setSalary(getSalary() + instrument.getPrice() * CommisionRate);

                System.out.printf("you sold %s %n your salary increased to : %.2f ", instrument.getName(), getSalary());
                return;
            }


        }
        System.out.println("the instrument is not availavle in store ");

    }

}
