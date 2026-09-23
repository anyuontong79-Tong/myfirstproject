public class Course {

    String courseName;
    int students;
    int passedStudents;

    static int totalStudents = 0;

    Course(String courseName, int students, int passedStudents) {
        this.courseName = courseName;
        this.students = students;
        this.passedStudents = passedStudents;

        totalStudents += students;
    }

    double calculatePassPercentage() {
        double passPercentage;
        passPercentage = (passedStudents * 100.0) / students;
        return passPercentage;
    }

    void displayCourseInformation() {
        System.out.println("Course: " + courseName);
        System.out.println("Number of Students: " + students);
        System.out.println("Passed Students: " + passedStudents);
        System.out.println("Pass Percentage: " + calculatePassPercentage() + "%");
        System.out.println();
    }

    public static void main(String[] args) {

        Course course1 = new Course("Computer Networks", 40, 32);
        Course course2 = new Course("Java Programming", 35, 28);
        Course course3 = new Course("Database Systems", 45, 36);

        course1.displayCourseInformation();
        course2.displayCourseInformation();
        course3.displayCourseInformation();

        System.out.println("Total Students: " + totalStudents);
    }
}