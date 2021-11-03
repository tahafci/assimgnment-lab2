package assignement_2;
public class Person 
{
    public String name;
    public String address;
    public int phonenumber;
    public String emailaddress;

    public Person(String name, String address, int phonenumber, String emailaddress) 
    {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
    
     public String toString(String name)
      {
        return " Person :"+this.name; 
      }
}
