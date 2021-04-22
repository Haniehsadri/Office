public class HourlySeller extends Seller {
    private  final double HourlySalary=5.00;
    private double Hours;

    public HourlySeller(String name, String lastname, int personalId,  String nationalId,
                        String password, String username, String employmentType,
                        String fathersname, String education, double basesalary) {
        super(name, lastname, personalId,  nationalId, password, username, employmentType,
                fathersname, education, basesalary);

    }

    public void setHours(double hours) {
        Hours = hours;
    }

    public double getHours() {
        return Hours;
    }

    @Override
    public double getSalary() {
        return super.getSalary() +HourlySalary*Hours;
    }
}
