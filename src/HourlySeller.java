public class HourlySeller extends Seller {
    private  final double HourlySalary=5.00;
    private int Hours;

    public HourlySeller(String name, String lastname, int personalId, String responsibility, String nationalId,
                        String password, String username, String employmentType,
                        String fathersname, String education, double basesalary) {
        super(name, lastname, personalId, responsibility, nationalId, password, username, employmentType,
                fathersname, education, basesalary);
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public int getHours() {
        return Hours;
    }

    @Override
    public double getSalary() {
        return super.getSalary() +HourlySalary*Hours;
    }
}
