import java.util.regex.*;

public class EmailValidationUC1 {

  public static boolean isvalid(String emailId) {

      String pattern="^[A-Z a-z 0-9]{3,}$";

  	Pattern P=Pattern.compile(pattern);
  	 if(emailId == null) {
   	  return false;
         }

 	Matcher m = P.matcher(emailId);
  	 return m.matches();
  }

  public static void main(String[] args) {

     String emailId=args [0];
	System.out.println(emailId+":"+ isvalid(emailId));
  }
}
