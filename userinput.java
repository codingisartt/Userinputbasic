import java.util.Scanner; //ctrl +shift + o 

public class userinput {
	public static void main(String[] args) {
		String username= "codingisartt";
		String password= "8822687";
		//Strings cannot be compared with the == operator. They are datatype.
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter your username:  ");
		String user_name= scan.nextLine();
		
		System.out.println("Enter your password:  ");
		String user_password = scan.nextLine();
		
		if (!(username.equals(user_name)) && !(password.equals(user_password))) {
			System.out.println("Username and password are incorrect");
		}
		else  if ((username.equals(user_name)) && !(password.equals(user_password))) {
			System.out.println("Password is incorrect");
		}
		else  if (!(username.equals(user_name)) && (password.equals(user_password))) {
			System.out.println("Username is incorrect");
		}
		else {
			System.out.println("Login is succesful...");
		}
	}

}
