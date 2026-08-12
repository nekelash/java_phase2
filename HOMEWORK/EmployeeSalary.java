class Employee {
    int id;
    String name;
    double basicSalary;
    double hra;
    double da;
    double bonus;
    double tax;
    double grossSalary;
    double netSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateHRA() {
        hra = basicSalary * 0.20;
    }

    void calculateDA() {
        da = basicSalary * 0.10;
    }

    void calculateBonus() {
        bonus = basicSalary * 0.05;
    }

    void calculateGrossSalary() {
        grossSalary = basicSalary + hra + da + bonus;
    }

    void calculateTax() {
        tax = grossSalary * 0.08;
    }

    void calculateNetSalary() {
        netSalary = grossSalary - tax;
    }

    void calculateSalary() {
        calculateHRA();
        calculateDA();
        calculateBonus();
        calculateGrossSalary();
        calculateTax();
        calculateNetSalary();
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
        System.out.println();
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Nekelash", 30000);
        Employee e2 = new Employee(102, "Arun", 40000);
        Employee e3 = new Employee(103, "Kavin", 35000);
        Employee e4 = new Employee(104, "Vijay", 50000);
        Employee e5 = new Employee(105, "Ravi", 45000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
        e4.calculateSalary();
        e5.calculateSalary();

        System.out.println("EMPLOYEE SALARY DETAILS\n");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();

        Employee highest = e1;

        if (e2.netSalary > highest.netSalary)
            highest = e2;

        if (e3.netSalary > highest.netSalary)
            highest = e3;

        if (e4.netSalary > highest.netSalary)
            highest = e4;

        if (e5.netSalary > highest.netSalary)
            highest = e5;

        Employee lowest = e1;

        if (e2.netSalary < lowest.netSalary)
            lowest = e2;

        if (e3.netSalary < lowest.netSalary)
            lowest = e3;

        if (e4.netSalary < lowest.netSalary)
            lowest = e4;

        if (e5.netSalary < lowest.netSalary)
            lowest = e5;

        double averageSalary =
                (e1.netSalary + e2.netSalary + e3.netSalary
                + e4.netSalary + e5.netSalary) / 5;

        System.out.println("HIGHEST SALARY");
        System.out.println("Name: " + highest.name);
        System.out.println("Net Salary: ₹" + highest.netSalary);

        System.out.println("\nLOWEST SALARY");
        System.out.println("Name: " + lowest.name);
        System.out.println("Net Salary: ₹" + lowest.netSalary);

        System.out.println("\nAVERAGE SALARY");
        System.out.println("₹" + averageSalary);
    }
}