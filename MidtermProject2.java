import java.util.Scanner;

public class MidtermProject2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x = in.nextInt();

        for(int a=1;a<=x;a++){
            for(int c=1;c<=x;c++){
                if (c<x || a==x){
                    for(int b=1;b<=x;b++){
                        for(int d=1;d<=x;d++){
                            if(d<x || b==x){
                                if(a%2==b%2 || c==1 || d==1 || c==x || d==x){
                                    System.out.print("* ");
                                }else{
                                    System.out.print("  ");
                                }
                            }
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}