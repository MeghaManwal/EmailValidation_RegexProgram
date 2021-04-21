import java.util.regex.*;

public class EmailValidation {

  public static boolean isvalid(String emailId) {

      String pattern="^[A-Z a-z 0-9]+@[0-9 a-z A-Z]+$";

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
