public class HourlySeller extends Seller {
    private  final double HourlySalary=5.00;
    private int Hours;

    public HourlySeller(String name, String lastname, int personalId,  String nationalId,
                        String password, String username, String employmentType,
                        String fathersname, String education, double basesalary,int Hours ) {
        super(name, lastname, personalId,  nationalId, password, username, employmentType,
                fathersname, education, basesalary);
        this.Hours=Hours;
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
