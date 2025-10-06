import java.util.Scanner;
public class sumavg {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int start,end,count;
        double sum=0,avg;
        System.out.println("Enter Starting Number");
        start=s.nextInt();
        System.out.println("Enter Ending Number");
        end=s.nextInt();
       count=(end-start)+1;
        System.err.println("You Entered"+" "+count+" "+"numbers");
        for (int i = start; i <= end; i++) {
            sum=sum+i;
            
        }
        avg=sum/count;
        System.err.println("Sum of Numbers:"+" " +sum);
        System.err.println("Average of Numbers:"+" "+avg);

    }
}
