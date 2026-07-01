public class TaskManagement {

    static Task head = null;

    // Add Task
    public static void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public static void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {

                System.out.println("Task Found:");
                System.out.println(temp);
                return;

            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Traverse Tasks
    public static void traverseTasks() {

        Task temp = head;

        System.out.println("\nTask List:");

        while (temp != null) {

            System.out.println(temp);
            temp = temp.next;

        }
    }

    // Delete Task
    public static void deleteTask(int id) {

        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;

        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {

            System.out.println("Task Not Found.");

        } else {

            temp.next = temp.next.next;
            System.out.println("Task Deleted Successfully.");

        }
    }

    public static void main(String[] args) {

        addTask(101, "Design Homepage", "Pending");
        addTask(102, "Develop Login", "In Progress");
        addTask(103, "Database Setup", "Completed");
        addTask(104, "Testing", "Pending");

        traverseTasks();

        System.out.println();

        searchTask(103);

        System.out.println();

        deleteTask(102);

        traverseTasks();
    }
}