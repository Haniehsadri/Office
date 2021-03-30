public class Seller extends Employee {

    private static double basesalary;

    public Seller(String name, String lastname, int personalId, String responsibility, String nationalItetd,
                  String password, String username, String employmentType, String fathersname, String education, double basesalary) {
        super(name, lastname, personalId, responsibility, nationalId, password, username, employmentType, fathersname, education);
        this.basesalary = basesalary;
    }

    public static void setBasesalary(double basesalary) {
        Seller.basesalary = basesalary;
    }

    public double getBasesalary() {
        return basesalary;
    }

}
