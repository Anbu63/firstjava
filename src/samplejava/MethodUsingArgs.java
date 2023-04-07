package samplejava;

public class MethodUsingArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodUsingArgs m = new MethodUsingArgs();
m.sum(30,40);
m.sum(100,200);
m.sum(500,200);
	}
	void sum(int a,int b) {
	int c=a+b;
	System.out.println(c);
	}
	}


