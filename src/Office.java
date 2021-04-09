import java.util.ArrayList;
import java.util.Scanner;

public class Office {
    public static ArrayList<Employee> employees=new ArrayList<Employee>();

    public static void main(String[] args) {

    }

    public  void Signin(){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your username:");
        String username=input.next();
        System.out.println("please enter your password :");
        String password=input.next();
       int currentemployee= findcurrentemployee(employees,username,password);
        System.out.println(employees.get(currentemployee));

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
