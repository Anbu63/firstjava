package samplejava;

public class MethodArgExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodArgExample m=new MethodArgExample();
		int result=m.sum(30,40)+100;
		System.out.println("Result="+result);
	}
	int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	}


