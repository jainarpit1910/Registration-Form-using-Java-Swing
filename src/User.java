 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class User {
    private String fname;
    private String lname;
    private String dob;
    private String en;
    private String address;
    private String uname;
    private String pass;
    
    
    
    public User(String FName,String Lname,String DOB, String EN, String Address, String Uname,String Pass )
    {
        
        this.fname = FName;
        this.lname = Lname;
        this.dob = DOB;
        this.en = EN ;
        this.address = Address;
        this.uname = Uname;
        this.pass = Pass;
        
    }
    
   
    public String getFName()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
    public String getDOB()
    {
        return dob;
    }
    public String getEN()
    {
        return en;
    }
    public String getAddress()
    {
        return address;
    }
    public String getUname()
    {
        return uname;
    }
    public String getPass()
    {
        return pass;
    }
            
}
