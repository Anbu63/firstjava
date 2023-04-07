package methodoverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj=new OverloadingDemo ();
		System.out.println(obj.add(10, 25));
	}


int add(int a,int b) {
	return a*b;
	}

int add(int a,int b,int c) {
	return a+b+c;
}

int add (int a,int b,int c,int d) {
	return a+b+c+d;
}

float add(int a,float b) {
return a+b;
}
}