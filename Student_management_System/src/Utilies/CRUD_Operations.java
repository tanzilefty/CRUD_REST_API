package Utilies;
import Student_Data.Student_Basic_Details;


import java.util.ArrayList;

import static Student_Data.Student_Basic_Details.Roll_Number;

public class CRUD_Operations {

    //create | post

    public  static void Create(Student_Basic_Details form,ArrayList<Student_Basic_Details> Database){
         for (Student_Basic_Details student : Database){
                if (Roll_Number == Roll_Number ){
                    System.out.println("Roll already exists");
                    return;
                }

         }
         Database.add(form);
         System.out.println("Successfully Added");
    }
    // read|Search
    public  static  void  filterbyRoll(int Roll_Number,ArrayList<Student_Basic_Details> Database)
    {
        for (Student_Basic_Details form : Database ) {
            if (Student_Basic_Details.Roll_Number == Roll_Number) {
                System.out.println("Student Information:");
                System.out.println("Name              : " + form.Name);
                System.out.println("Roll Number           : " + Student_Basic_Details.Roll_Number);
                System.out.println("Registration_number             : " + form.Registration_number);
                System.out.println("Department      : " + form.Department);
                System.out.println("Shift      : " + form.Shift);
                System.out.println("Group      : " + form.Group);
                System.out.println("Session      : " + form.Session);
                System.out.println("Admission Year  : " + form.Admission_Year);
                System.out.println("Contact: " + form.setContact());
                System.out.println("Address         : " + form.setAddress());
                return;

            }
        }
        System.out.println("Student Information Not Found in Database");
        }

        //Delete | remove
        public  static  void Delete ( int Roll_Number, ArrayList<Student_Basic_Details> Database) {
            int item_index = 0;
            for (Student_Basic_Details form : Database) {


            if ( Student_Basic_Details.Roll_Number == Roll_Number){

                Database.remove(item_index);
            }
                item_index++;
            }
                System.out.println("Roll not Found in Database");

    }
    // Update | change
    public static void update(Student_Basic_Details Form, ArrayList<Student_Basic_Details> Database)
    {

        int updat_index = 0;
        for (Student_Basic_Details form : Database) {


            if (Student_Basic_Details.Roll_Number == Form.Roll_Number){

                Database.remove(updat_index);
                Database.add(form);
                return;
            }
            updat_index++;
        }
        System.out.println("Roll not Found in Database");


    }

        }



