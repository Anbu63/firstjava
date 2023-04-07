package samplejava;

public class StaticMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticMethodEx s=new StaticMethodEx();
s.m1();
System.out.println("this is main method");
	}
void m() {
	System.out.println("this is m method");
}
void m1() {
	m();
	System.out.println("this is m1 method");
}
}
