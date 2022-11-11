public class Methods {
    public static int calculateSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;

    }
    public static Employee employeeMinSalary(Employee[] employees) {
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new IllegalArgumentException("Данные первого сотрудника должны быть заполнены");
        }
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float averageSalary(Employee[] employees) {

        return calculateSalary(employees) / employees.length;
    }
    public static void printEmploees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }
    public static Employee employeeMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new IllegalArgumentException("Данные первого сотрудника должны быть заполнены");
        }
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}