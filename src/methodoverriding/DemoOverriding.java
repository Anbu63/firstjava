package methodoverriding;

public class DemoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		//a.add(10, 20);
		
	B b=new B();
	b.add(30, 5);
	}
}
class A{
	void add(int a,int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	void add(int a,int b) {
		System.out.println(a-b);
	}
}


