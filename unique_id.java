import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
public class unique_id {
 
  public static void main(String[] args)
    {
       int i=1;
       String ans;
       do
       {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter username");
        

        String str = myObj.nextLine(); 
        int hash_code = str.hashCode();

        System.out.println("The unique for " + str +
            " is " + hash_code);
        
        System.out.println("date and time of request");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now)); 

       System.out.println("do you want to enter more usernames y/n");
       ans=myObj.nextLine();

       System.out.println(" ");
       }while(ans.equals("yes"));
    }
}