// Q5- Create class Employee with constructors, setters, and toString

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.designation = "Not Assigned";
    }

    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public Employee(Employee other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.designation = other.designation;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + designation;
    }
}
