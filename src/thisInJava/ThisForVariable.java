package thisInJava;

public class ThisForVariable {

	int a;
	int b;
	
	void setData(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisForVariable t=new ThisForVariable();
		t.setData(10, 20);
		System.out.println("value= "+t.a+" value1= "+t.b);
	}

}
