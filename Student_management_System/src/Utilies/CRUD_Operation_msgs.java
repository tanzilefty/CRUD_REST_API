package Utilies;

public class CRUD_Operation_msgs extends Hiding_extra_msgs {

    //welcome message
    @Override
    public void welcome_msg(){
        System.out.println("\n Welcome To our information management system ! ! !");
    }


    //Exit msg
    @Override
    public void exit_msg()
    {
        System.out.println("Exiting CRUD system");

    }

    //CRUD_Operations
    public void  service_info()
    {

        System.out.println(
              " \nCRUD Services :\n" +
                      "1 ** New student Informatiom **\n"+
                      "2 ** Check previous Information's ** \n"+
                      "3 ** Update Student Information **\n "+
                      "4 ** Delete Student Detail ** \n"+
                      "0 ** EXIT CRUD Programe\n"

        );
    }
}
