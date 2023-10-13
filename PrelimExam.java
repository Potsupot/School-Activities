import java.util.Scanner;

public class PrelimExam{
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    String n1, n2, n3;
    double g, p, m, f, s;
    
    //Name
    System.out.println("First Name:");
    n1 = in.nextLine();
    
    System.out.println("Middle Initial:");
    n2 = in.nextLine();
    
    System.out.println("Last Name:");
    n3 = in.nextLine();
    
    //Prelim
    System.out.println("----------PRELIM----------\n"
            + "Attendance Grade:");
    g=in.nextDouble();
    
    if(g>=60 && g<=100){
        p=g*0.05;
        System.out.println("Class Participation Grade:");
        g=in.nextDouble();
        
        if(g>=60 && g<=100){
            p+=g*0.15;
            System.out.println("Quiz Grade:");
            g=in.nextDouble();
            
            if(g>=60 && g<=100){
                p+=g*0.3;
                System.out.println("Exam Grade:");
                g=in.nextDouble();
                
                if(g>=60 && g<=100){
                    p+=g*0.5;
     
    //Midterm
    System.out.println("----------MIDTERM----------\n"
            + "Attendance Grade:");
    g=in.nextDouble();
    
    if(g>=60 && g<=100){
        m=g*0.05;
        System.out.println("Class Participation Grade:");
        g=in.nextDouble();
        
        if(g>=60 && g<=100){
            m+=g*0.15;
            System.out.println("Quiz Grade:");
            g=in.nextDouble();
            
            if(g>=60 && g<=100){
                m+=g*0.3;
                System.out.println("Exam Grade:");
                g=in.nextDouble();
                
                if(g>=60 && g<=100){
                    m+=g*0.5;
                    
    //Final
    System.out.println("----------FINAL----------\n"
            + "Attendance Grade:");
    g=in.nextDouble();
    
    if(g>=60 && g<=100){
        f=g*0.05;
        System.out.println("Class Participation Grade:");
        g=in.nextDouble();
        
        if(g>=60 && g<=100){
            f+=g*0.15;
            System.out.println("Quiz Grade:");
            g=in.nextDouble();
            
            if(g>=60 && g<=100){
                f+=g*0.3;
                System.out.println("Exam Grade:");
                g=in.nextDouble();
                
                if(g>=60 && g<=100){
                    f+=g*0.5;
                    s=((p*.25)+(m*.25)+(f*.5));
                    
    //Summary
    System.out.print("----------------------SUMMARY----------------------\n"
            + "Name: " + n1 + " " + n2 + ". " + n3 + "\n"
            + "Prelim Grade: " + p + "\n"
            + "Midterm Grade: " + m + "\n"
            + "Final Grade: " + f + "\n"
            + "Semester Grade: " + s + " ");
            
    if(s>=95 && s<=100){
        System.out.println("(A)");
    }else if(s>=90 && s<95){
        System.out.println("(B)");
    }else if(s>=85 && s<90){
        System.out.println("(C)");
    }else if(s>=80 && s<85){
        System.out.println("(D)");
    }else if(s>=75 && s<80){
        System.out.println("(E)");
    }else if(s>=60 && s<75){
        System.out.println("(F)");
    }
    
    System.out.print("Remarks: ");
    
    if(s>=75){
        System.out.println("PASSED");
    }else{
        System.out.println("FAILED");
    }
    
    System.out.println("-------------------------------");
    
                }else{
                    System.out.println("INVALID INPUT");
                }
            }else{
                System.out.println("INVALID INPUT");
            }
        }else{
            System.out.println("INVALID INPUT");
        }
    }else{
        System.out.println("INVALID INPUT");
    }
                }else{
                    System.out.println("INVALID INPUT");
                }
            }else{
                System.out.println("INVALID INPUT");
            }
        }else{
            System.out.println("INVALID INPUT");
        }
    }else{
        System.out.println("INVALID INPUT");
    }
                }else{
                    System.out.println("INVALID INPUT");
                }
            }else{
                System.out.println("INVALID INPUT");
            }
        }else{
            System.out.println("INVALID INPUT");
        }
    }else{
        System.out.println("INVALID INPUT");
    }
    }
}