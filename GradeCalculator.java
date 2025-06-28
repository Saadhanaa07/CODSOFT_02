import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎓 Welcome to the Student Grade Calculator!");

        System.out.print("📚 Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("✏️ Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = totalMarks / (double) numberOfSubjects;
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n📊 --------- Results ---------");
        System.out.println("📋 Total Marks      : " + totalMarks);
        System.out.println("📈 Average Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("🏅 Grade            : " + grade);
        System.out.println("------------------------------");

        scanner.close();
        System.out.println("✅ Thank you for using the Grade Calculator!");
    }
}
