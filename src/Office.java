import java.util.ArrayList;
import java.util.Scanner;


public class Office {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static ArrayList<Seller> sellers = new ArrayList<>();


    public static void main(String[] args) {
        addmanager();
        Scanner input=new Scanner(System.in);
        while (true){

        System.out.println("welcome to office ,choose the given options :1-Manager  2-Employee");
        int option=input.nextInt();
        if(option==1){
            signup();
        }
       if (option==2) {
           Signin();
       }

         //    System.out.println("do you want to exit the Office ? 1-yes 2-N0");
       int yesorno=input.nextInt();
       if(yesorno==1){
           break;
       }

    }
    }

    // this function is for ordinary staffs not for manager
    public static void Signin() {
        int currentemployee;
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.println("please enter your username:");
        String username = input.next();
        System.out.println("please enter your password :");
        String password = input.next();
         currentemployee = findcurrentemployee(employees, username, password);
        if (currentemployee!=-1){

            break;
        }

        }
        if (employees.get(currentemployee) instanceof CommisionSeller){
            System.out.println("do you want to sell instrument? 1 -yes  2-no ");
            int yesorno=input.nextInt();
            if (yesorno==1){
            System.out.println("the availability  of instruments are given in the next line: ");
            Store.report();
            System.out.println("which instument do you want to sell please enter the number of instrument");
            int numberOfInstrument=input.nextInt();
            ((CommisionSeller) employees.get(currentemployee)).Sell(Store.store.get(numberOfInstrument));
                ((CommisionSeller) employees.get(currentemployee)).setSalary(employees.get(currentemployee).getSalary()+
                         ( (CommisionSeller)employees.get(currentemployee)).CommisionRate*Store.store.get(numberOfInstrument).getPrice());




            }

        }
        System.out.println(employees.get(currentemployee));

        while (true) {
            System.out.println(" Do you want to change your information?: 1- Yes  2- No thanks ");
            int yesorno = input.nextInt();
            if (yesorno == 2) {
                break;
            }
            if (yesorno == 1) {

                System.out.println("which one do you want to change? 1-username  2-password  3-name 4-family  5- national id ");
                int changeinformation = input.nextInt();
                switch (changeinformation) {
                    case 1:
                        System.out.println("enter your username:");
                        String newusername = input.next();
                        employees.get(currentemployee).setUsername(newusername);
                        break;

                    case 2:
                        employees.get(currentemployee).Changepassword();
                        break;

                    case 3:
                        System.out.println("enter your name:");
                        String newname = input.next();
                        employees.get(currentemployee).setName(newname);

                    case 4:
                        System.out.println("enter your family:");
                        String newfamily = input.next();
                        employees.get(currentemployee).setName(newfamily);

                    case 5:
                        System.out.println("enter your nationalid:");
                        String newnationalid = input.next();
                        employees.get(currentemployee).setName(newnationalid);


                }


            }
            System.out.println(employees.get(currentemployee));
        }

    }

    // this function is for manager;
    public static void signup() {
        Scanner input = new Scanner(System.in);
        Office.Signin();
        while (true) {
            System.out.println("Do you want to add employee?1- Yes  2- No ");
            int yesorno = input.nextInt();
            if (yesorno == 2) {
                break;
            }
            if (yesorno == 1) {

                System.out.println("enter name:");
                String name = input.next();
                System.out.println("enter lastname :");
                String lastname = input.next();
                System.out.println("enter personalid :");
                int personalid = input.nextInt();
                System.out.println("enter nationalid:");
                String nationalid = input.next();
                System.out.println("enter password:");
                String password = input.next();
                System.out.println("enter username");
                String username = input.next();
                System.out.println("enter education: ");
                String education = input.next();
                System.out.println("enter fathersname: ");
                String fathersname = input.next();

                System.out.println("please enter emoloyment type: 1- commisionseller  2- hourlyseller  ");
                int employmenttype1 = input.nextInt();
                if (employmenttype1 == 1) {
                    String employmenttype = "commisionseller";
                    System.out.println("enter basesalary :");
                    double basesalary = input.nextDouble();
                    CommisionSeller commisionSeller = new CommisionSeller(name, lastname, personalid
                            , nationalid, password, username, education, fathersname, employmenttype, basesalary);
                    employees.add(commisionSeller);
                    sellers.add(commisionSeller);

                }
                if (employmenttype1 == 2) {

                    String employmenttype = "hourlyseller";
                    System.out.println("enter basesalary :");
                    double basesalary = input.nextDouble();
                  //  System.out.println("enter hours:");
                 //   int hours = input.nextInt();
                    HourlySeller hourlySeller = new HourlySeller(name, lastname, personalid, nationalid, password, username, education
                            , fathersname, employmenttype, basesalary);
                    employees.add(hourlySeller);
                    sellers.add(hourlySeller);


                }



            }
        }
        while (true){
        System.out.println("do you want to add instrument? 1- yes  2 no ");
         int yesorno=input.nextInt();
        if(yesorno==1){
            System.out.println("please enter the name of instrument :");
            String nameOfInstrument=input.next();
            System.out.println("please enter the price of instrument:");
            double price=input.nextDouble();
            Instrument instrument=new Instrument(nameOfInstrument,price);
            if (yesorno==2){
                break;
            }
        }


            Store.report();
        }

    }

    public static int findcurrentemployee(ArrayList<Employee> employees, String username, String password) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getUsername().equals(username) && employees.get(i).getPassword().equals(password)) {
                return i;
            }

        }
        System.out.println("username or password is not correct ");
        return -1;
    }

public static void addmanager (){
        Manager manager =new Manager("Hanieh","Sadri",12345,"4710668000",
                "hhhh","haniehsadri","manager","yousef","bachelore");
        employees.add(manager);

    }
}
