import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualClassroomManager manager = VirtualClassroomManager.getInstance();
        
        while (true) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "add_classroom":
                    manager.addClassroom(tokens[1]);
                    break;
                case "add_student":
                    manager.addStudent(tokens[2], tokens[1]);
                    break;
                case "schedule_assignment":
                    manager.scheduleAssignment(tokens[1], tokens[2]);
                    break;
                case "submit_assignment":
                    manager.submitAssignment(tokens[2], tokens[1], tokens[3]);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
