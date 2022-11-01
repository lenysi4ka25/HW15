import java.util.stream.IntStream;

public class Employee {

    public String fullName;
    public int employeeSalary;
    public int department;
    public static int count;
    public int id;

        public Employee(String fullName, int employeeSalary, int department) {
        this.fullName = fullName;
        this.employeeSalary = employeeSalary;
        this.department = department;
        this.id = count++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getDepartment() {
        return department;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return  "ФИО: " + fullName +
                ", зарплата: " + employeeSalary +
                ", отдел: " + department +
                ", id: " + id;
    }

//    public String toString1() {
//        return "ФИО: " + fullName + ".";
//    }
}