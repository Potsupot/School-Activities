public class LecMidtermQuiz2{
    public static void main(String[] args) {
        
        int x = 9;

        /*for(int a=1;a<=x;a++){        
            for(int b=1;b<=a;b++){
                if(a==x || b==1 || a==b){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
        
        for(int a=1;a<=x;a++){
            for(int b=1;b<=a;b++){
                if(a%2==1){
                    for(int c=1;c<=b;c++){
                        if(c==1 || b==c || b==a){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                }else{
                    for(int d=1;d<=b;d++){
                        if(d<=b){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }  
                }
                System.out.println();
            }
        }
    }
}