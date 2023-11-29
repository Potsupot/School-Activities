import java.util.Scanner;

import javax.xml.transform.Source;

public class FinalExam{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x = in.nextInt();

        int myArray[][] = new int[x][x], check[][] = new int[3][x];

        for(int a=0;a<x;a++){
            for(int b=0;b<x;b++){
                System.out.println("myArray[" + a + "][" + b + "]:");
                myArray[a][b] = in.nextInt();
            }
        }

        System.out.println("-----ELEMENTS OF myArray-----");
        for(int a=0;a<x;a++){
            for(int b=0;b<x;b++){
                System.out.print(myArray[a][b] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----SUM OF ELEMENTS PER ROW-----");
        for(int a=0;a<x;a++){
            System.out.print("ROW " + a + ": ");
            for(int b=0;b<x;b++){
                System.out.print(myArray[a][b]);
                check[0][a]+=myArray[a][b];
                if(b!=x-1){
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + check[0][a]);
        }

        System.out.println("-----SUM OF ELEMENTS PER COLUMN-----");
        for(int a=0;a<x;a++){
            System.out.print("COLUMN " + a + ": ");
            for(int b=0;b<x;b++){
                System.out.print(myArray[b][a]);
                check[1][a]+=myArray[b][a];
                if(b!=x-1){
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + check[1][a]);
        }

        System.out.println("-----SUM OF ELEMENTS PER DIAGONAL-----");
        System.out.print("DIAGONAL 1: ");
        for(int a=0;a<x;a++){
            System.out.print(myArray[a][a]);
            check[2][0]+=myArray[a][a];
            if(a!=x-1){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + check[2][0]);

        System.out.print("DIAGONAL 2: ");
        for(int a=0;a<x;a++){
            System.out.print(myArray[a][x-a-1]);
            check[2][1]+=myArray[a][x-a-1];
            if(a!=x-1){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + check[2][1]);

        boolean magic = true;

        for(int a=0;a<2;a++){
            for(int b=0;b<x-1;b++){
                if(magic==true){
                    magic = check[a][b]==check[a][b+1];
                }
            }
        }

        if(magic==true){
            magic = (check[0][0] == check[2][0]) && (check[0][0] == check[2][1]);
        }

        System.out.print("\nMagic Square: ");
        if(magic){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}