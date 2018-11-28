import java.util.Scanner;

class AverageSumHomework7
{

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter five number");
        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            int a = obj.nextInt();
            sum = sum + a;

        }

        System.out.println(sum);
        int avearge = (sum / 5);
        System.out.println(avearge);


    }
}


class Multipilacation6 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter an interger");
        int n=obj.nextInt();

        for(int i=1;i<=10;i++) {
            System.out.println(n + "*" + i +"=" + n*i);
        }

    }
}


class Righthand9 {
    public static void main(String[] args) {
        int n =0;
        for (int i=1;i<=5;i++)
        {    for (int j=1;j<=i;j++)
        {
            n=n + 1;
            System.out.print (n + "  ");
        }
            System.out.println();

        }
    }
}

class LeftsidedTriangle{
    public static void main(String[] args) {


        for(int i=1;i<=6;i++)

        {  for(int c =6;c>=i;c--){
            System.out.print("  ");


        }
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print(j  + "  ");

            }
        }
            System.out.println("");
    }
}

class RighthandPiramidx{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");


                }
            System.out.println();
        }
        }}


    class PrimeNumber {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the value");
            int myNumber = obj.nextInt();
            boolean prime = true;


            for (int i = 2; i <= myNumber; i++) {

                if (myNumber % i == 0) {
                    System.out.println("its  not prime number");

                    prime = false;
                    break;
                }

            }}}


            class ConcatenateString {
                public static void main(String[] args) {
                    Scanner obj = new Scanner(System.in);
                    System.out.println("enter first name");
                    String p = obj.next();
                    System.out.println("enter last name");
                    String q = obj.next();
                    System.out.println(p + " " + q);


                }
            }

            class Homework12 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter any numbers");
                    int n = sc.nextInt();
                    System.out.println("number divisible by 3: ");
                    for (int i = 1; i <= n; i++) {
                        if (i % 3 == 0)
                            System.out.println(i);
                    }
                    System.out.println("number divisible by 5");
                    for (int i = 1; i <= n; i++) {
                        if (i % 5 == 0) {
                            System.out.println(i);
                        }

                    }
                }
            }

            class NaturalNumber {
                public static void main(String[] args) {

                    int sum = 0;
                    for (int i = 1; i <= 10; i++) {
                        // System.out.println(i);

                        sum = sum + i;


                    }
                    System.out.println(sum);
                }
            }


            class CubeofTheNumber {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int i, number;
                    System.out.println("input number");
                    number = sc.nextInt();

                    for (i = 0; i <= number; i++) {
                        System.out.println("Given number is " + i + "\tCube of\t" + i + "\tis:\t" + (i * i * i));

                    }
                }
            }

            class FibonacciSeries {


                public static void main(String[] args) {
                    int a = 0, b = 1, c;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter any numbers");
                    int n = sc.nextInt();
                    for (int i = 0; i <= n; i++) {
                        c = a + b;
                        System.out.println(c);
                        a = b;
                        b = c;
                    }
                }
            }







