public class Employee {
 
    private String id;
    private String name;
    private String designation;
    private double salary;
 
    public Employee(String id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
 
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }
 
    // Turns the object into the one-line, comma-separated format used in employees.txt
    public String toFileLine() {
        return id + "," + name + "," + designation + "," + salary;
    }
 
    // Rebuilds an Employee object from a line read out of employees.txt
    public static Employee fromFileLine(String line) {
        String[] parts = line.split(",");
        return new Employee(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]));
    }
}
