public class VirtualClassroomManager {
    private static VirtualClassroomManager instance;
    private Map<String, Classroom> classrooms;

    private VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    public static VirtualClassroomManager getInstance() {
        if (instance == null) {
            instance = new VirtualClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String className) {
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom " + className + " has been created.");
    }

    public void addStudent(String className, String studentId) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(new Student(studentId));
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.scheduleAssignment(new Assignment(assignmentDetails));
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    public void submitAssignment(String className, String studentId, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.submitAssignment(studentId, new Assignment(assignmentDetails));
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    // Add methods to list classrooms, remove classrooms, etc.
}
