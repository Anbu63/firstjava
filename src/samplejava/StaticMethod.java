package samplejava;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticMethod.show();
StaticMethod m=new StaticMethod();
m.display();
	}
void display() {
	System.out.println("this is display method");
}
static void show() {
	System.out.println("this is show method");
}
}
