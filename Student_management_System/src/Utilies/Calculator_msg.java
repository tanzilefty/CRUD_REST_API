package Utilies;

public class Calculator_msg extends Hiding_extra_msgs {
    @Override
    public void welcome_msg(){
        System.out.println("Welcome to calculator program");

    }

    @Override
    public void exit_msg(){
        System.out.println("Exiting Calculator Program");
    }

    @Override
    public void  service_info(){

        System.out.println( " \nCalculator Operations:\n" +
                "1 ** Addition **\n"+
                "2 ** Subtraction's ** \n"+
                "3 ** Multiplication **\n "+
                "4 **  Division ** \n"+
                "0 ** EXIT Calculator\n");

    }

}
