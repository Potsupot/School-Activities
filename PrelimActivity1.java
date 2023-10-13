import java.util.Scanner;

public class PrelimActivity1{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String name;
        double prelimGrade, midtermGrade, finalGrade, semesterGrade;

        //name
        System.out.println("First Name:");
        name = in.nextLine() + " ";
        System.out.println("Middle Initial:");
        name += in.nextLine() + ". ";
        System.out.println("Last Name:");
        name += in.nextLine();
        
        //grade
        System.out.println("Prelim Grade:");
        prelimGrade = in.nextDouble();

        if(prelimGrade>=65 && prelimGrade<=100){
            System.out.println("Midterm Grade:");
            midtermGrade = in.nextDouble();

            if(midtermGrade>=65 && midtermGrade<=100){
                System.out.println("Final Grade:");
                finalGrade = in.nextDouble();
                if(finalGrade>=65 && finalGrade<=100){
                    semesterGrade = (prelimGrade+midtermGrade+finalGrade)/3;
                    System.out.println("Name: " + name + 
                                        "\nSemester Grade: " + semesterGrade);
                    if(semesterGrade>=75 && semesterGrade<=100){
                        System.out.println("You Passed!");
                    }else{
                        System.out.println("You Failed!");
                    }
                }else{
                    System.out.println("Invalid input!");
                }
            }else{
                System.out.println("Invalid input!");
            }
        }else{
            System.out.println("Invalid input!");
        }

        in.close();
    }
}