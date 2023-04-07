package samplejava;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int option=6;
int a=10;
int b=20;
switch(option){
case 1:
	System.out.println("Add "+(a+b));
	break;
case 2:
	System.out.println("Sub "+(b-a));
	break;
case 3:
	System.out.println("Mult "+(a*b));
	break;
case 4:
	System.out.println("Div "+(b/a));
	break;
default:System.out.println("enter available options");
}
	
}
	}


