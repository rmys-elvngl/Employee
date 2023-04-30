package main;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
    
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    
    public void raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\nSalary: " + salary + "\nWork Hours: " + workHours + "\nHire Year: " + hireYear;
    }

	public static void main(String[] args) {
	Employee employee1 = new Employee("Ali Yılmaz", 1200, 45, 2015);
	System.out.println("Tax: " + employee1.tax());
	System.out.println("Bonus: " + employee1.bonus());
	employee1.raiseSalary();
	System.out.println(employee1.toString());
	}
}