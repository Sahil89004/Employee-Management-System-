import java.util.Scanner;
import java.util.List;
 
public class EmployeeManagementSystem {
 
    private static final EmployeeService employeeService = new EmployeeService();
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine().trim());
 
            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2 or 3.");
            }
        } while (choice != 3);
 
        sc.close();
    }
 
    // Gathers input, builds a Model object, hands it to the Service
    static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine().trim();
 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine().trim();
 
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine().trim();
 
        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(sc.nextLine().trim());
 
        Employee employee = new Employee(id, name, designation, salary);
        employeeService.addEmployee(employee);
        System.out.println("Employee added successfully!");
    }
 
    // Asks t1he Service for all records, then formats them for the console
    static void displayAll() {
        List<Employee> employees = employeeService.getAllEmployees();
 
        System.out.println("\n----Report-----");
        if (employees.isEmpty()) {
            System.out.println("No employee records found yet.");
            return;
        }
 
        for (Employee e : employees) {
            System.out.printf("%-6s %-15s %-15s %s%n",
                    e.getId(), e.getName(), e.getDesignation(), e.getSalary());
        }
    }
}
