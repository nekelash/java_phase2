import java.util.Scanner;

class Student {
    int id;
    String name;
    int mark1, mark2, mark3, mark4, mark5;
    int total;
    double average;
    char grade;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter 5 marks: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        mark4 = sc.nextInt();
        mark5 = sc.nextInt();
    }

    void calculate() {
        total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + " " + mark2 + " " + mark3 + " " + mark4 + " " + mark5);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        System.out.println("Student 1");
        s1.acceptDetails(sc);
        s1.calculate();

        System.out.println("\nStudent 2");
        s2.acceptDetails(sc);
        s2.calculate();

        System.out.println("\nStudent 3");
        s3.acceptDetails(sc);
        s3.calculate();

        System.out.println("\nStudent 4");
        s4.acceptDetails(sc);
        s4.calculate();

        System.out.println("\nStudent 5");
        s5.acceptDetails(sc);
        s5.calculate();

        System.out.println("\nSTUDENT RESULTS");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

        Student highest = s1;

        if (s2.total > highest.total)
            highest = s2;

        if (s3.total > highest.total)
            highest = s3;

        if (s4.total > highest.total)
            highest = s4;

        if (s5.total > highest.total)
            highest = s5;

        Student lowest = s1;

        if (s2.total < lowest.total)
            lowest = s2;

        if (s3.total < lowest.total)
            lowest = s3;

        if (s4.total < lowest.total)
            lowest = s4;

        if (s5.total < lowest.total)
            lowest = s5;

        double classAverage =
                (s1.average + s2.average + s3.average + s4.average + s5.average) / 5;

        System.out.println("HIGHEST TOTAL");
        System.out.println("Name: " + highest.name);
        System.out.println("Total: " + highest.total);

        System.out.println("\nLOWEST TOTAL");
        System.out.println("Name: " + lowest.name);
        System.out.println("Total: " + lowest.total);

        System.out.println("\nCLASS AVERAGE");
        System.out.println(classAverage);

        sc.close();
    }
}