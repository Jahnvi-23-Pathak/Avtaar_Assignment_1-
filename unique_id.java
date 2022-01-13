import java.util.*;
public class abc {
 
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

        System.out.println("The hash for " + str +
            " is " + hash_code);

       System.out.println("do you want to enter more usernames y/n");
       ans=myObj.nextLine();
       }while(ans.equals("yes"));
    }
}