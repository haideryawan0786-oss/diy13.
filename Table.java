import java.util.Scanner;
public class Table {
    public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
        double n;
        System.err.println("Enter Any Number");  
        n=s.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.err.println(n+"*"+i+"="+n*i);
        }

    }
}
