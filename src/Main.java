import java.util.Arrays;

public class Main {

    public static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {


        employee[0] = new Employee("Миронова Татьяна Тимофеевна", 107000, 1);
        employee[1] = new Employee("Янченко Николай Константинович", 95500, 1);
        employee[2] = new Employee("Николаева Галина Константиновна", 86425, 2);
        employee[3] = new Employee("Борисенкова Эльза Яковлевна", 55555, 2);
        employee[4] = new Employee("Сальников Александр Иванович", 95500, 3);
        employee[5] = new Employee("Наранов Сергей Сергеевич", 95950, 3);
        employee[6] = new Employee("Чаткин Александр Евгеньвевич", 45623, 4);
        employee[7] = new Employee("Соколов Артур Сергеевич", 56852, 4);
        employee[8] = new Employee("Найченко Вера Александровна", 78952, 5);
        employee[9] = new Employee("Миронова Наталья Петровна", 69854, 5);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        System.out.println("курсовая");
        System.out.println("Сумма трат за месяц составила: " + sumSalary() + " рублей");
        System.out.println("Сотрудник с максимальной з/п: " + maxSalary());
        System.out.println("Сотрудник с минимальной з/п: " + minSalary());
        System.out.println("Средняя зарплата: " + averageSalary() + " рублей");
        System.out.println();
        fullName1();
    }

    public static int sumSalary() {
        int sum = 0;

        for (Employee employee1 : employee) {
            if (employee1 != null) {
                sum += employee1.getEmployeeSalary();
            }

        }
        return sum;
    }

    public static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getEmployeeSalary() > max) {
                max = employee1.getEmployeeSalary();
                targetEmployee = employee1;
            }

        }
        return targetEmployee;
    }
    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getEmployeeSalary() < min) {
                min = employee1.getEmployeeSalary();
                targetEmployee = employee1;
            }

        }
        return targetEmployee;
    }
    public static int averageSalary() {
        int sumAverage = 0;
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                sumAverage += employee1.getEmployeeSalary();
            }
        }
        return sumAverage/10;
    }

    public static void fullName1() {
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                System.out.println(employee1.fullName);
            }

        }

    }
}