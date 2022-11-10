public class Employee {
    public final int id;
    private final String fullName;
    private int departament;
    public int salary;
  public static int counter=1;

    public Employee(String fullName, int departament, int salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        id = counter++;

    }
    public String toString() {
        return ("ФИО сотрудника:" + fullName + "; Отдел:" + departament + "; Заралата сотрудника: " + salary + "; id сотрудника:" + id);
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
}
