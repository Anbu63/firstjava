package inheritance;

public class HierarchialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
F obj=new F();
obj.printData();
obj.showData();

G obj1=new G();
obj1.printData();
obj1.displayData();

	}

}
class E{
	int a=10;
	void printData() {
		System.out.println("A="+a);
	}
}

class F extends E{
	int b=20;
	void showData() {
		System.out.println("B="+b);
	}
}

class G extends E{
	int c=30;
	void displayData() {
		System.out.println("C="+c);
	}
}