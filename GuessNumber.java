import java.util.Scanner;
public class GuessNumber{
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int a=64,b;
        System.out.println("guess Number");
        System.err.println("Hint :"+"Number is between 1 & 100 and Number is even ");
        System.err.println("Enter Number");
        b=s.nextInt();
        while (b<64) { 
            System.err.println("Number Entered is  Low ");
            System.err.println("again Enter");
            System.err.println("Hint :"+"Number  also contains its square root of even number ");
            b=s.nextInt();

        }
        while (b>64){
            System.err.println("Number Entered is  high ");
            System.err.println("again Enter");
            System.err.println("Hint :"+"Number  also contains its square root of even number ");

            b=s.nextInt();
             }
   
        if (b==a) {
            System.err.println("You Entered Correct NUmber");
            
        }
            
        
            }
}
