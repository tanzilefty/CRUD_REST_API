package Utilies;
import Student_Data.Student_Basic_Details;
import java.util.Scanner;

public class Student_Basic_Details_Form {
    public static  Student_Basic_Details Form_Data(){

        System.out.println("Fill up the form Data");
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your Name  :");
        String Name= scan.next();

        System.out.print("Enter your  Roll number  :");
        int Roll_Number= scan.nextInt();


        System.out.print("Enter your Registration number  ");
        int Registration_number= scan.nextInt();


        System.out.print("Enter your Department : ");
        String Department= scan.next();

        System.out.print("Enter your Shift  :");
        String Shift= scan.next();


        System.out.print("Enter your  Group :");
        String Group= scan.next();

        System.out.print("Enter your  Session  :");
        String Session= scan.next();

        System.out.print("Enter your  Admission_Year :");
        String Admission_Year= scan.next();

        System.out.print("Enter your  Contact :");
        String Contact= scan.next();

        System.out.print("Enter your  Address  :");
        String Address= scan.next();

        Student_Basic_Details std = new Student_Basic_Details( Name,Roll_Number,Registration_number,Department,  Shift,  Group,  Session,  Admission_Year,  Contact,  Address

        );
        return std;










    }


}
