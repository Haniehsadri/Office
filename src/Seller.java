public class Seller extends Employee {


    public final double vacationdeduction=0.03;

    public Seller(String name, String lastname, int personalId, String nationalId,
                  String password, String username, String employmentType, String fathersname, String education,double salary) {
        super(name, lastname, personalId, nationalId
                , password, username, employmentType, fathersname, education,salary);

    }

    //public static void setBasesalary(double basesalary) {
       // Seller.basesalary = basesalary;
 //   }

    //public double getBasesalary() {
       // return basesalary;
   // }


    public double salarywithvacation (){
        if (getVacation()<3){
            return  getSalary();
    }
         else
             {return( getSalary() -vacationdeduction *getVacation());}

    }

    }
