import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Employee {
    private String name;
    private String lastname;
    private int personalId;

    private String nationalId;
    private String password;
    private String username;
    private String employmentType;
    private int vacation = 0;
    private double salary;
    Scanner input = new Scanner(System.in);

    public Employee(String name, String lastname, int personalId,
                    String nationalId, String password, String username, String employmentType, String fathersname, String education) {
        this.name = name;
        this.lastname = lastname;
        this.personalId = personalId;

        setNationalId(nationalId);
        this.password = password;
        this.username = username;
        this.employmentType = employmentType;
        this.fathersname = fathersname;
        this.education = education;
    }

    private String fathersname;
    private String education;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPersonalId() {
        return personalId;
    }



    public String getNationalId() {
        return nationalId;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getVacation() {
        return vacation;
    }

    public String getFathersname() {
        return fathersname;
    }

    public String getEducation() {
        return education;
    }


    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }



    public void setNationalId(String nationalId) {
        if (IsNationalIdValid(nationalId)) {
            this.nationalId = nationalId;
        } else {
            System.out.println("nationalid should be 10 characers");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public boolean IsNationalIdValid(String nationalid) {
        if (nationalid.length() == 10) {
            return true;
        }
        return false;

    }

    public  void Changepassword() {
        while (true) {
            System.out.println("please enter your current password ");
            String currentpassword = input.next();
            if (currentpassword.equals(getPassword())) {
                System.out.println("please enter your new password :");  //new password should not be same to the currentpassword.
                String newpassword = input.next();
                System.out.println("confirm your new password:");
                String newpasswordconfirmation = input.next();
                if (newpassword.equals(newpasswordconfirmation) && !newpassword.equals(currentpassword)) {
                    setPassword(newpassword);
                    break;
                }

                System.out.println("your new password is repeated or it is not match with password confirmation !!");

            } else {
                System.out.println("the currentpassword is incorrect");
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", personalId=" + personalId +

                ", nationalId='" + nationalId + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", vacation=" + vacation +

                ", fathersname='" + fathersname + '\'' +
                ", education='" + education + '\'' +
                ", salary =" + getSalary();
    }
}
