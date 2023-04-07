package inheritance2;

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
obj.printData();
obj.showData();
obj.displayData();
System.out.println("A="+obj.a+" B="+obj.b+" C="+obj.c);
	}

}
class A{
	int a=10;
	void printData() {
		System.out.println("A="+a);
	}
}

class B extends A{
	int b=20;
	void showData() {
		System.out.println("B="+b);
	}
}

class C extends B{
	int c=30;
	void displayData() {
		System.out.println("C="+c);
	}
}