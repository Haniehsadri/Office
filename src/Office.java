import java.util.ArrayList;
import java.util.Scanner;

public class Office {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) {

    }

    public void Signin() {
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
                        System.out.println("enter yor name");
                        String newusername = input.next();
                        employees.get(currentemployee).setUsername(newusername);
                        break;
                    case 2:
                        

                }

            }
        }

    }

    public int findcurrentemployee(ArrayList<Employee> employees, String username, String password) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUsername().equals(username) && employees.get(i).getPassword().equals(password)) {
                return i;
            }
            System.out.println("username or password is not correct ");
        }
        return -1;
    }


}
