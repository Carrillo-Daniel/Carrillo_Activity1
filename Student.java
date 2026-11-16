public class Student {
    // PRIVATE ATTRIBUTES
    private String name;
    private String studentId;
    private double grade;

    // CONSTRUCTOR
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // SETTER FOR GRADE ONLY
    public void setGrade(double newGrade) {
        grade = newGrade;
    }

    // METHOD TO DISPLAY INFORMATION
    public void displayInfo() {
        System.out.printf("Name: %s | ID: %s | Grade: %.1f%n", name, studentId, grade);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        // CREATE TWO OBJECTS
        Student student1 = new Student("Daniel Jakob J. Carrillo", "251-001", 90.0);
        Student student2 = new Student("Cheska J. Carrillo      ", "251-002", 88.0);

        // CHANGE ONE STUDENT'S GRADE USING THE SETTER
        student2.setGrade(91.5);

        // DISPLAY 
        student1.displayInfo();
        student2.displayInfo();
    }
}