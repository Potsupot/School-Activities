import java.util.Scanner;

public class PrelimQuiz1{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String name;
        double prelimGrade, tentativeMidtermGrade, tentativeFinalGrade;
        
        //name
        System.out.println("Enter first name:");
        name = in.nextLine();
        System.out.println("Enter middle initial:");
        name += " " + in.nextLine();
        System.out.println("Enter first name:");
        name += ". " + in.nextLine();

        //prelim
        System.out.println("---PRELIM---\n Attendance:");
        prelimGrade = in.nextDouble() * .05;
        System.out.println("Quiz:");
        prelimGrade += in.nextDouble() * .4;
        System.out.println("Project:");
        prelimGrade += in.nextDouble() * .25;
        System.out.println("Exam:");
        prelimGrade += in.nextDouble() * .3;

        //midterm
        System.out.println("---MIDTERM---\n Attendance:");
        tentativeMidtermGrade = in.nextDouble() * .05;
        System.out.println("Quiz:");
        tentativeMidtermGrade += in.nextDouble() * .4;
        System.out.println("Project:");
        tentativeMidtermGrade += in.nextDouble() * .25;
        System.out.println("Exam:");
        tentativeMidtermGrade += in.nextDouble() * .3;

        //prelim
        System.out.println("---FINAL---\n Attendance:");
        tentativeFinalGrade = in.nextDouble() * .05;
        System.out.println("Quiz:");
        tentativeFinalGrade += in.nextDouble() * .4;
        System.out.println("Project:");
        tentativeFinalGrade += in.nextDouble() * .25;
        System.out.println("Exam:");
        tentativeFinalGrade += in.nextDouble() * .3;

        in.close();

        //summary
        System.out.println("---SUMMARY---" +
                            "\nName: " + name +
                            "\nPrelim Grade: " + prelimGrade +
                            "\nTentative Midterm Grade: " + tentativeMidtermGrade +
                            "\nMidterm Grade: " + (prelimGrade+tentativeMidtermGrade)/2 +
                            "\nTentative Final Grade: " + tentativeFinalGrade +
                            "\nFinal Grade: " + (((prelimGrade+tentativeMidtermGrade)/2)+tentativeFinalGrade)/2
                            );

    }
}