public class Classroom {
    private String className;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getId() + " has been enrolled in " + this.className);
    }

    public void scheduleAssignment(Assignment assignment) {
        assignments.add(assignment);
        System.out.println("Assignment for " + this.className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, Assignment assignment) {
        System.out.println("Assignment submitted by Student " + studentId + " in " + this.className);
    }
    
    // Additional methods like listStudents, removeStudent, etc.
}
