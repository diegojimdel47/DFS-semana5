package actividad4;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}

    class Subject {

        private String subjectName;
        private String subjectID;
        private int creditsNumber;
        private int weeklyHours;
    }

    class Teacher {

        private String teacherName;
        private String payrollNumber;
        private int wagePerHour;
        private string assignedSubject;
    }

    class Course {

        private String courseName;
        private Subject s1, s2, s3;
        private int totalCredits;
    }

    class Student {
        
        private String studentID;
        private String studentName;
        private int age;
        private String enrolledSubject;
    }
