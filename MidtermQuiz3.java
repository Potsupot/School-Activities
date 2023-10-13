import java.util.Scanner;

public class MidtermQuiz3{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x;

        System.out.println("Enter a number:");
        x = in.nextInt();
        
        for(int a=1;a<x*2;a++){
            for(int b=1;b<x*2;b++){
                if(a==1 || b==1 ||                          //upper border
                    a==x || b==x ||                         //inner divider
                    a==x*2-1 || b==x*2-1 ||                 //outer border
                    (a==b && (a<=x/2 || a>=x+x/2)) ||       //backward diagonal
                    (b==x*2-a && (b<=x/2 || b>=x+x/2)) ||   //forward diagonal
                    (b==x-a+1) ||                           //upper left diamond                    
                    (b==x*3-a-1) ||                         //lower right diamond
                    (a==b+x-1) ||                           //lower left diamond
                    (b==a+x-1)                              //upper right diamond
                    ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}