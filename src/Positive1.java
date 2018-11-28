//import java.util.Scanner;
//// HOMEWORK 8
//public class Positive1 {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("add number");
//        int number = obj.nextInt();
//        if (number > 0) {
//            System.out.println("number is positive");
//        } else if (number < 0) {
//            System.out.println("number is negative");
//        } else {
//            System.out.println("number is zero ");
//        }
//
//    }}
////       HOMEWORK 10
//    class City {
//        public static void main(String[] args) {
//
//            Scanner obj = new Scanner(System.in);
//            System.out.println("add alphabet ");
//            String a = obj.next() ;
//
//          //  b = " Bombay " ;
//
//
//            if (a.equalsIgnoreCase("a")) {
//                System.out.println("City name Ahmedabad");
//            }
//            else if (a.equalsIgnoreCase("b")) {
//                System.out.println("City name Bombay");
//            }
//            else if (a.equalsIgnoreCase("c")){
//                System.out.println("city name Chennai");
//            }
//            else if (a.equalsIgnoreCase("d")){
//                System.out.println("city name is Delhi");
//            }
//            else if (a.equalsIgnoreCase("e")) {
//                System.out.println("city name is east ham");
//            }
//            else if (a.equalsIgnoreCase("f")){
//                System.out.println("city name is fenny");
//            }
//
//
//                else {
//                    System.out.println( "invalid entry");
//            }
//
//
//
//    }}
//
//
//
////      HOMEWORK 15
//    class  Weekdays {
//        public static void main(String[] args) {
//            Scanner obj = new Scanner(System.in);
//            System.out.println("print any number");
//            int number = obj.nextInt();
//            switch (number)
//            {
//                case 1:
//                    System.out.println("monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3 :
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                    default:
//                        System.out.println("invalid entry");
//            }
//        }
//
//             }
//
//
//
//    //    HOMEWORK 19
//    class bonus {
//        public static void main(String[] args) {
//            Scanner obj = new Scanner(System.in);
//            System.out.println("print name");
//            String a = obj.next();
//            System.out.println("enter salary");
//            double p= obj.nextInt();
//            System.out.println("Enter your of Service");
//            int c = obj.nextInt();
//            if (c > 5 ) {
//                System.out.println("Bonus is " +  p*5/100 );
//
//            }
//            else {
//                System.out.println("not eligible for bonus");
//
//            }
//
//        }}
//
//
//        //   HOMEWORK 5
//        class Interchange5 {
//            public static void main(String[] args) {
//                Scanner obj = new Scanner(System.in);
//                System.out.println("enter two  value" );
//                int a= obj.nextInt();
//                int b = obj.nextInt();
//                int c;
//
//
//                c=a;
//                a=b;
//                b=c;
//                System.out.println("Inter change value ");
//                System.out.println(a);
//                System.out.println( c);
//
//
//            }
//          }
//
//
//
//// homework 11
// class AgeExample {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("enter age");
//        int age = obj.nextInt();
//        if (age >= 18) {
//            System.out.println("eligible for voting");
//        }
//        else {
//            System.out.println("not eligible for voting");
//        }
//    }}
//
//
//
//// homework  2
//     class LeapYear {
//        public static void main(String[] args) {
//            Scanner obj = new Scanner(System.in);
//            System.out.println("enter year");
//            int year = obj.nextInt();
//            if ( year % 400== 0 || year % 4==0 && (year %100 != 0)    ){
//                System.out.println( " is a leap year");
//
//            }else System.out.println    ( " is not leap year");
//
//        }
//
//
//       }
//
//
////    homework 3
//      class Student{
//         public static void main(String[] args) {
//               Scanner obj= new Scanner(System.in);
//               System.out.println(" student name");
//               String name = obj.next();
//             System.out.println("enter roll number");
//             int rollnumber = obj.nextInt();
//             System.out.println("enter first subject mark1");
//             int mark1 = obj.nextInt();
//             System.out.println("enter second subject mark 2");
//             int mark2 = obj.nextInt();
//             System.out.println("enter third subject mark 3");
//             int mark3 = obj.nextInt();
//             int precentage = ((mark1 + mark2+ mark3)%300) * 100;
//                     if ( precentage>=80){
//                 System.out.println("student pass with grade A+");
//             }  else if (precentage>=60 ){
//                     System.out.println("student pass with grade A");
//
//                 }else if (precentage>= 50 ){
//
//                         System.out.println("student pass with grade B");
//             }else if( precentage >=35 ){
//              System.out.println( "student pass with grade c");
//
//         } else {
//              System.out.println("student is fail");
//          }
//       }  }
//
//
//
//
//
//
////      HOMWQRK  4
//         class PassFail{
//             public static void main(String[] args) {
//                 Scanner obj = new Scanner(System.in);
//                 System.out.println(" student name");
//                 String name = obj.next();
//                 System.out.println("enter roll number");
//                 int rollnumber = obj.nextInt();
//                 System.out.println("enter first subject mark1");
//                 int mark1 = obj.nextInt();
//                 System.out.println("enter second subject mark 2");
//                 int mark2 = obj.nextInt();
//                 System.out.println("enter third subject mark 3");
//                 int mark3 = obj.nextInt();
//                 if (mark1  >= 35) {
//                     System.out.println("student pass");
//                 }else {
//                     System.out.println("fail");
//
//                 }
//             }
//         }
//
//
//
  // HOMEWORK 1
// class   Oddeven {
//    public static void main(String[] args){
//
//        Scanner p = new Scanner(System.in);
//        System.out.println("Add number ");
//        int number = p.nextInt();
//
//
//        System.out.println(number % 2 == 0 ? "This number even" : "This number odd");
//
//    }
//
//}

//// HOMEWORK 7
//public class AverageValue {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner (System.in);
//        System.out.println("input first number");
//        int number1 = obj.nextInt();
//        System.out.println("input second number");
//        int number2 = obj.nextInt();
//        System.out.println("input third number");
//      //  int number3 = obj.nextInt();
//    //    System.out.println("input forth number");
//       // int number4 = obj.nextInt();
//     //   System.out.println("input fifth number");
//   //     int number5 = obj.nextInt();
// //       int average = ((number1+ number2 +number3 + number4 + number5) /5 );
// //       System.out.println("average value   is " +
//                "\n "  +  average)///          //
