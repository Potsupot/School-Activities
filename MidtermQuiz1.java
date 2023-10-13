import java.util.Scanner;

public class MidtermQuiz1{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int gridSize;

        System.out.println("Enter a number:");
        gridSize = in.nextInt();
        in.close();

        for(int row=1;row<=gridSize;row++){
            for(int column=1;column<=gridSize;column++){
                if(row==1 || row==gridSize || column==1 || column==gridSize ||      //border
                    (row==gridSize/2+1 /*&& gridSize%2==1*/) ||                     //horizontal split
                    (column==gridSize/2+1 /*&& gridSize%2==1*/) ||                  //vertical split
                    (row>=column && row<=gridSize/2 && column<=gridSize/2) ||       //upper left
                    (row<=column && row>gridSize/2 && column>gridSize/2) ||         //lower right
                    (row>gridSize-column && row>gridSize/2 && column<=gridSize/2) ||//lower left
                    (row<=gridSize-column+1 && row<=gridSize/2 && column>gridSize/2)//upper right
                ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}