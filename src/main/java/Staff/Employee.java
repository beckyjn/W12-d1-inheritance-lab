package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        double raise = salary * Math.abs(increment);
        salary += raise;
    }

    public double payBonus() {
        return salary * 0.01;
    }

    public void setName(String name) {
        if (validateNameInput(name)) {
            this.name = name;
        }
    }
    private boolean validateNameInput(String nameInput){
        return !(nameInput == null || nameInput.length() ==  0);
    }
}
