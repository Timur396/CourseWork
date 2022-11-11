
import java.util.Objects;

public class Employee {
    public final int id;
    private final String fullName;
    private int departament;
    public int salary;
    public static int counter = 1;

    public Employee(String fullName, int departament, int salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return ("ФИО сотрудника:" + fullName + "; Отдел:" + departament + "; Заралата сотрудника: " + salary + "; id сотрудника:" + id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName, departament, salary, counter);
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (this == null || this.getClass() != other.getClass())
            return false;
        Employee employee = (Employee) other;
        return fullName.equals(fullName) && departament == employee.departament && salary == employee.salary;
    }
}

