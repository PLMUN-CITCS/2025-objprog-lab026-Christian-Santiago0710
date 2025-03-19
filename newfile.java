public class StudentInfo {
    public static void main(String[] args) {
        String[][] students = {
                {"101", "Alice", "3.8"},
                {"102", "Bob", "3.5"},
                {"103", "Charlie", "3.9"}
        };

        for (String[] student : students) {
            System.out.println("Student ID: " + student[0] + ", Name: " + student[1] + ", GPA: " + student[2]);
        }
    }
}
