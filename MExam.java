import java.util.Scanner;

public class MExam{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = in.nextInt();
        in.close();

        for(int a=1;a<=x+1;a++){
            for(int b=1;b<=x+3;b++){
                if((b<=a && a<=x) || (a>x && b<=x/2+4)){        //limit rows
                    for(int c=1;c<x*2;c++){
                        if(c==x                                 //center line

                        || (a<=x                                //triangles

                        && (c==x+b-1                            //right diagonal
                        || c==x-b+1                             //left diagonal
                        || (b==a && (c<=x+b-1 && c>=x-b+1))     //bottom line
                        || (a%2==0 && (c<=x+b-1 && c>=x))       //even fill
                        || (a%2==1 && (c>=x-b+1 && c<=x))))     //odd fill
                        
                        || (a>x                                 //stand loop

                        && b>x/2+1)                             //base
                        ){
                            System.out.print("o ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}