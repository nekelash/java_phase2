//Inheritence
class person {
    String name = "Nikil";
    String work = "human";
    String activity = "living";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Work: " + work);
        System.out.println("Activity: " + activity);
    }
}

class student extends person {
    String name = "Nekelash";
    String work = "student";
    String activity = "studying";
    String course = "ECE";

    void display_student() {
        System.out.println("Name: " + name);
        System.out.println("Work: " + work);
        System.out.println("Activity: " + activity);
        System.out.println("Course: " + course);
    }
}

class child extends student {
    String name = "Guptha";
    String work = "children";
    String activity = "No work";
    String parent = "Venkatesh";

    void display_child() {
        System.out.println("Name: " + name);
        System.out.println("Work: " + work);
        System.out.println("Activity: " + activity);
        System.out.println("Parent: " + parent);
    }
}

class customer extends child {
    String name = "Nekelash Guptha";
    String work = "customer";
    String activity = "buying";
    String product = "Mobile";

    void display_customer() {
        System.out.println("Name: " + super.name);
        System.out.println("Work: " + work);
        System.out.println("Activity: " + activity);
        System.out.println("Product: " + product);
    }
}

class visitor extends customer {
   
    String name = "Nekelash Guptha";
    String work = "visitor";
    String activity = "visiting";
    String place = "Hyderabad";

    void display_visitor() {
        System.out.println("Name: " + name);
        System.out.println("Work: " + work);
        System.out.println("Activity: " + activity);
        System.out.println("Place: " + place);
    }
}

public class Task3 {
    public static void main(String[] args) {

        visitor v = new visitor();

        v.display_visitor();
        v.display_customer();
        v.display_child();
        v.display_student();
        v.display();
    }
}