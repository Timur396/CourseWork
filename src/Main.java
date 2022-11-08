public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Гогохия Тимур", 1, 52957);
        employees[1] = new Employee("Картешева Анастасия", 2, 69831);
        employees[2] = new Employee("Гареев Артур", 3, 37891);
        employees[3] = new Employee("Софин Максим", 4, 94356);
        employees[4] = new Employee("Ищенко Максим", 5, 76890);
    printEmploees();

        System.out.println("Сумма всех зарплат " + calculateSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + employeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + employeeMaxSalary());
        System.out.println("Средняя зарплата: " + averageSalary());

        printFullName();

    }

    public static void printEmploees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }

    }

    public static int calculateSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee employeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee employeeMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float averageSalary() {
        return calculateSalary() / Employee.counter;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}


            
    
