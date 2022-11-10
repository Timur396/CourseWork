public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Гогохия Тимур", 1, 52957);
        employees[1] = new Employee("Картешева Анастасия", 2, 69831);
        employees[2] = new Employee("Гареев Артур", 3, 37891);
        employees[3] = new Employee("Софин Максим", 4, 94356);
        employees[4] = new Employee("Ищенко Максим", 5, 76890);

        Methods.printEmploees(employees);

        System.out.println("Сумма всех зарплат " + Methods.calculateSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой " + Methods.employeeMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой " + Methods.employeeMaxSalary(employees));
        System.out.println("Средняя зарплата: " + Methods.averageSalary(employees));

        Methods.printFullName(employees);

    }









}


            
    
