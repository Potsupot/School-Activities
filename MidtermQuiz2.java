import java.util.Scanner;

public class MidtermQuiz2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Size of each array:");
        int x = in.nextInt();
        double[] a = new double[x], b = new double[x], c = new double[x], sum = {0,0};

        System.out.println("--------Array A--------");
        for(int i=0;i<x;i++){
            System.out.println("A[" + i + "]:");
            a[i] = in.nextDouble();
        }

        System.out.println("--------Array B--------");
        for(int i=0;i<x;i++){
            System.out.println("B[" + i + "]:");
            b[i] = in.nextDouble();
        }
        
        System.out.print("--------Summary--------" +
                            "\nElements of Array A:" +
                            "\n\t");
        for(int i=0;i<x;i++){
            System.out.print(a[i]);
            if(i!=x-1){
                System.out.print(", ");
            }
        }

        System.out.print("\nElements of Array B:" +
                            "\n\t");
        for(int i=0;i<x;i++){
            System.out.print(b[i]);
            if(i!=x-1){
                System.out.print(", ");
            }
        }

        System.out.print("\nSum of Elements of Array A:" +
                            "\n\t");
        for(int i=0;i<x;i++){
            System.out.print(a[i]);
            if(i!=x-1){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
            sum[0]+=a[i];
        }
        System.out.println(sum[0]);

        System.out.print("\nSum of Elements of Array B:" +
                            "\n\t");
        for(int i=0;i<x;i++){
            System.out.print(b[i]);
            if(i!=x-1){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
            sum[1]+=b[i];
        }
        System.out.println(sum[1]);

        System.out.println("Array A + Array B:");
        for(int i=0;i<x;i++){
            c[i] = a[i] + b[i];
            System.out.println("\tA[" + i + "]" + " + " + "B[" + i + "] = " +
                                a[i] + " + " + b[i] + " = " + c[i]);
        }
    }
}