import java.util.Scanner;

public class ScannerExample1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your marks");

        int marks = a.nextInt();

        if (marks >= 35 && marks < 50) {
            System.out.println("pass");

        }
        else if (marks >= 50 && marks < 60) {
            System.out.println("first class");
        }
        else if (marks >= 70 && marks < 100) {
            System.out.println("distinction");
        }
        else {
            System.out.println("fail");
        }




    }

}
