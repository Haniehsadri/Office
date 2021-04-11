import java.util.ArrayList;
import java.util.Scanner;


public class Office {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static ArrayList<Seller> sellers = new ArrayList<>();


    public static void main(String[] args) {

    }

    // this function is for ordinary staffs not for manager
    public static void Signin() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your username:");
        String username = input.next();
        System.out.println("please enter your password :");
        String password = input.next();
        int currentemployee = findcurrentemployee(employees, username, password);
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
                        System.out.println("enter yor username:");
                        String newusername = input.next();
                        employees.get(currentemployee).setUsername(newusername);
                        break;

                    case 2:
                        employees.get(currentemployee).Changepassword();
                        break;

                    case 3:
                        System.out.println("enter yor name:");
                        String newname = input.next();
                        employees.get(currentemployee).setName(newname);

                    case 4:
                        System.out.println("enter yor family:");
                        String newfamily = input.next();
                        employees.get(currentemployee).setName(newfamily);

                    case 5:
                        System.out.println("enter yor nationalid:");
                        String newnationalid = input.next();
                        employees.get(currentemployee).setName(newnationalid);


                }


            }
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
                System.out.println("enter usernam");
                String username = input.next();
                System.out.println("enter education: ");
                String education = input.next();
                System.out.println("enter fathersname: ");
                String fathersname = input.next();

                System.out.println("please enter emoloyment type: 1- commisionseller  2- hourlyseller  3-");
                int employmenttype = input.nextInt();
                if (employmenttype == 1) {
                    String employmenttypee = "commisionseller";

                    System.out.println("enter basesalary :");
                    double basesalary = input.nextDouble();
                    CommisionSeller commisionSeller = new CommisionSeller(name, lastname, personalid
                            , nationalid, password, username, education, fathersname, employmenttypee, basesalary);
                    employees.add(commisionSeller);
                    sellers.add(commisionSeller);

                }


            }
        }
    }

    public static int findcurrentemployee(ArrayList<Employee> employees, String username, String password) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUsername().equals(username) && employees.get(i).getPassword().equals(password)) {
                return i;
            }
            System.out.println("username or password is not correct ");
        }
        return -1;
    }


}
