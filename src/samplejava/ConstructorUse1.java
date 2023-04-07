package samplejava;

public class ConstructorUse1 {
int rollnumber;
String name;


ConstructorUse1 (int roll,String nam){
	rollnumber=roll;
	name=nam;
}

void printdata() {
	System.out.println("NAME = "+name+" ROLLNUMBER= "+rollnumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorUse1 anb=new ConstructorUse1 (100,"Anbu");
				anb.printdata();
		ConstructorUse1 ash=new ConstructorUse1 (101,"Asha");
		ash.printdata();
	}

}
