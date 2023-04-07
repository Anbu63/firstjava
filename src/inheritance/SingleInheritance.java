package inheritance;

public class SingleInheritance {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.printMsg();
obj.printData();
obj.showData();
System.out.println("a= "+obj.a+" b="+obj.b);

 
	}

}
class A{
	int a=20;
	void printMsg() {
		System.out.println("PARENT CLASS");
	}
	void printData() {
		System.out.println("a= "+a);
	}
}
class B extends A{
	int b=40;
	void showData() {
		System.out.println("b= "+b);
	}
}