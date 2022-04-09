import java.util.ArrayList;
import java.util.Scanner;
import Calculator_Operations.Addition_subtraction_Code;
import Calculator_Operations.Multiplication_Division_code;
import Student_Data.Student_Basic_Details;
import Utilies.Hiding_extra_msgs;
import Utilies.Calculator_msg;
import Utilies.CRUD_Operation_msgs;
import Utilies.CRUD_Operations;
import Utilies.Student_Basic_Details_Form;


public class Service_handler {

    // Main Function
    public static void main( String [] args){
        ArrayList<Student_Basic_Details> Database =new ArrayList<>();
        int option;
        int operation;

    Hiding_extra_msgs A;
    A = new CRUD_Operation_msgs();

    Hiding_extra_msgs B;
    B = new Calculator_msg();


    while (true){
        System.out.println("\nWelcome to our Student Information Management System Service ! ! ! \n");
        System.out.println("** 1. Student Information Services");
        System.out.println("** 2. Calculator Program");
        System.out.println("** 0. Exit this Program");

        Scanner entry= new Scanner(System.in);
        System.out.print(" Enter option :  ");
        option = entry.nextInt();

        if ( option ==0 )
        break;

        // student information
        if (option == 1){
            A.welcome_msg();
            while (true)
            {
                A.service_info();
                System.out.print("Enter option :  ");
                operation = entry.nextInt();
                if (operation == 0)
                    break;

                        //CRUD SERVICE
                switch (operation) {
                    case 1:     //New entry
                    {
                        Student_Basic_Details std = Student_Basic_Details_Form.Form_Data();
                        CRUD_Operations.Create(std, Database);
                        break;
                    }
                    case 2:    //search
                    {
                        System.out.print("Search Roll number :");
                        int search_roll = entry.nextInt();
                        CRUD_Operations.filterbyRoll(search_roll, Database);
                        break;

                    }
                    case 3:         // Update
                    {
                        System.out.println("Update Through Roll Number :  ");
                        Student_Basic_Details update_std = Student_Basic_Details_Form.Form_Data();
                        CRUD_Operations.update(update_std, Database);
                        break;
                    }
                    case 4:         // delete
                    {
                        System.out.println("Delete Student Detail :");
                        int Roll = entry.nextInt();
                        CRUD_Operations.Delete(Roll,Database);
                        break;

                    }
                    default:
                        System.out.println("Invalid Entry!!!");

                }

            }
            A.exit_msg();
        }


        else if ( option == 2)
        {
            B.welcome_msg();
            while (true) {

                double number_1, number_2;
                long a, b;
                B.service_info();
                System.out.println("Enter Operation : ");
                operation = entry.nextInt();

                if (operation == 0)
                    break;
                // CALCULATOR

                switch (operation) {
                    case 1: {
                        // addition
                        System.out.print("Enter your first number : ");
                        number_1 = entry.nextDouble();
                        System.out.print("Enter your Second number :");
                        number_2 = entry.nextDouble();
                        Addition_subtraction_Code.add(number_1, number_2);
                        break;
                    }
                    case 2:
                        //subtraction
                    {
                        System.out.println("Enter your first number : ");
                        number_1 = entry.nextDouble();

                        System.out.println("Enter your Second number : ");
                        number_2 = entry.nextDouble();
                        Addition_subtraction_Code.sub(number_1, number_2);
                        break;

                    }
                    case 3: {
                        // multiplication
                        System.out.print("Enter your first number : ");
                        number_1 = entry.nextDouble();
                        System.out.print("Enter your Second number : ");
                        number_2 = entry.nextDouble();
                        Multiplication_Division_code.multi(number_1, number_2);
                        break;
                    }

                    case 4: {
                        //Division

                        System.out.print("Enter your first number : ");
                        number_1 = entry.nextDouble();
                        System.out.print("Enter your first number : ");
                        number_2 = entry.nextDouble();
                        Multiplication_Division_code.div(number_1, number_2);
                        break;

                    }
                    default:
                        System.out.println("invalid request ");

                }
            }
B.exit_msg();


            }
        else {
            System.out.println("invalid request");

        }



    }












    }

}
