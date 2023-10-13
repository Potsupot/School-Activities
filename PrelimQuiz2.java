import java.util.Scanner;

public class PrelimQuiz2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double distance;

        //kilometer
        System.out.println("Distance in km:");
        distance = in.nextDouble();
        System.out.println(distance + "km = " + distance*1000 + "m\n" +
                            distance + "km = " + distance*1000*100/2.54/12 + "ft\n" +
                            distance + "km = " + distance*1000*100/2.54 + " inches\n" +
                            distance + "km = " + distance*1000*100 + "cm\n" +
                            distance + "km = " + distance*1000*100*10 + "mm\n");
        
        //meter
        System.out.println("Distance in m:");
        distance = in.nextDouble();
        System.out.println(distance + "m = " + distance/1000 + "km\n" +
                            distance + "m = " + distance*100/2.54/12 + "ft\n" +
                            distance + "m = " + distance*100/2.54 + " inches\n" +
                            distance + "m = " + distance*100 + "cm\n" +
                            distance + "m = " + distance*100*10 + "mm\n");

        //feet
        System.out.println("Distance in ft:");
        distance = in.nextDouble();
        System.out.println(distance + "ft = " + distance*12*2.54/100/1000 + "km\n" +
                            distance + "ft = " + distance*12*2.54/100 + "m\n" +
                            distance + "ft = " + distance*12 + " inches\n" +
                            distance + "ft = " + distance*12*2.54 + "cm\n" +
                            distance + "ft = " + distance*12*2.54*10 + "mm\n");
        
        //inches
        System.out.println("Distance in inches:");
        distance = in.nextDouble();
        System.out.println(distance + " inches = " + distance*2.54/100/1000 + "km\n" +
                            distance + " inches = " + distance*2.54/100 + "m\n" +
                            distance + " inches = " + distance/12 + "ft\n" +
                            distance + " inches = " + distance*2.54 + "cm\n" +
                            distance + " inches = " + distance*2.54*10 + "mm\n");

        //centimeter
        System.out.println("Distance in cm:");
        distance = in.nextDouble();
        System.out.println(distance + "cm = " + distance/1000/100 + "km\n" +
                            distance + "cm = " + distance/100 + "m\n" +
                            distance + "cm = " + distance/2.54/12 + "ft\n" +
                            distance + "cm = " + distance/2.54 + " inches\n" +
                            distance + "cm = " + distance*10 + "mm\n");
        
        //millimeter
        System.out.println("Distance in mm:");
        distance = in.nextDouble();
        System.out.println(distance + "mm = " + distance/10/100/1000 + "km\n" +
                            distance + "mm = " + distance/10/100 + "m\n" +
                            distance + "mm = " + distance/10/2.54/12 + "ft\n" +
                            distance + "mm = " + distance/10/2.54 + " inches\n" +
                            distance + "mm = " + distance/10 + "cm\n");

        in.close();
    }
}