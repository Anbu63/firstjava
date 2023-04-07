package methodoverriding;

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Login sbi=new Login();
sbi.loginForm();
	}

}
class Login(){
	void loginForm() {
		System.out.println("name");
		System.out.println("password");
		System.out.println("submit");
	}
}
class NewLogin extends Login() {
	void loginForm() {
		System.out.println("name");
		System.out.println("password");
		System.out.println("mobile num");
		System.out.println("submit");
		
	}
}