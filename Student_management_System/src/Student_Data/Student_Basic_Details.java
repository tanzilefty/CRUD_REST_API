package Student_Data;

public class Student_Basic_Details {


    public String Name;
    public static int Roll_Number;
    public int Registration_number;
    public String Department;
    public String Shift;
    public String Group;
    public String Session;
    public String Admission_Year;
    private String Contact;
    private String Address;



        //constructor
    public  Student_Basic_Details(
            String Name,
            int Roll_Number,
            int Registration_number,
            String Department,
            String Shift,
            String Group,
            String Session,
            String Admission_Year,
            String Contact,
            String Address

    ){


        this.Name=Name;
        this.Roll_Number=Roll_Number;
        this.Registration_number=Registration_number;
        this.Department= Department;
        this.Shift=Shift;
        this.Group=Group;
        this.Session=Session;
        this.Admission_Year=Admission_Year;
        this.Contact= setContact();
        this.Address= setAddress();

    }

    public String setAddress() {
        if (String.valueOf(Address).length()==20){
            return Address;
    }

return  this.Address=Address;
}


    public String setContact() {
        if (String.valueOf(Contact).length() == 6) {
            return Contact;
        } else {
            return "Invalid Contact";
        }


        }


    }





    

