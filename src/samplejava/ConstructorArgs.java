package samplejava;

public class ConstructorArgs {
	ConstructorArgs(int a){
		System.out.println("a= "+a);
		System.out.println("This is 1 arg constructor with int");
	}
	ConstructorArgs(int a,int b){
		System.out.println("a= "+a+" b= "+b);
		System.out.println("This is 2 arg constructor with int");
	}
	ConstructorArgs(float a){
	    System.out.println("a= "+a);
		System.out.println("this is 1 arg constructor with float");
	}
	ConstructorArgs(int a,float b,int c){
		System.out.println("a= "+a+" b= "+b+" c= "+c);
		System.out.println("this s 3 arg constructor");
	}
	ConstructorArgs(short a){
		System.out.println("a="+a);
		System.out.println("this s 1 arg constructor with short");
	}
	ConstructorArgs(String a){
		System.out.println("a="+a);
		System.out.println("This is 1 arg constructor with string");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorArgs a=new ConstructorArgs(10);
		ConstructorArgs a1=new ConstructorArgs(10,20);
		ConstructorArgs a2=new ConstructorArgs(20.30f);
		ConstructorArgs a3=new ConstructorArgs(01,30.58f,100);
		ConstructorArgs a4=new ConstructorArgs((short)10);
		ConstructorArgs a5=new ConstructorArgs("HELLO");
	}

}
