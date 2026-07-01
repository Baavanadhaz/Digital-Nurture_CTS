public class EmployeeManagement {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add Employee
    public static void addEmployee(Employee emp) {

        if (count < employees.length) {

            employees[count] = emp;
            count++;

            System.out.println("Employee Added Successfully.");

        } else {

            System.out.println("Employee Array is Full.");

        }
    }

    // Search Employee
    public static Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                return employees[i];
            }

        }

        return null;
    }

    // Traverse Employees
    public static void traverseEmployees() {

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < count; i++) {

            System.out.println(employees[i]);

        }
    }

    // Delete Employee
    public static void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {

                    employees[j] = employees[j + 1];

                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully.");
                return;
            }

        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Alice", "Manager", 75000));
        addEmployee(new Employee(102, "Bob", "Developer", 60000));
        addEmployee(new Employee(103, "Charlie", "Tester", 50000));
        addEmployee(new Employee(104, "David", "HR", 55000));

        traverseEmployees();

        System.out.println("\nSearching Employee 103");

        Employee emp = searchEmployee(103);

        if (emp != null)
            System.out.println(emp);
        else
            System.out.println("Employee Not Found.");

        System.out.println();

        deleteEmployee(102);

        traverseEmployees();
    }
}