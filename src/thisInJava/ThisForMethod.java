package thisInJava;

public class ThisForMethod {

	int a;
	int b;
	
	void setData(int a,int b) {
		this.a=a;
		this.b=b;
		this.getData();
	}
	
	void getData() { 
		
		System.out.println("a= "+a+" b= "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisForMethod t1=new ThisForMethod();
		t1.setData(10, 30);
	
	}

}
