
package assignment2_2;

public class Assignment2_2 {

  
    public static void main(String[] args)
    {
       Subject s1=new Subject("CS242", "OOP",3);
       address add1= new address(23, "minia", "Egypt");
       Student St1 =new Student("Taha Saleh Mohamed", 8003424, 3.4, s1,add1 );
       St1.display();
    }
    
}
