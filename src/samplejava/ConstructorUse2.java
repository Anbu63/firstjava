package samplejava;

//assigning local variable to instance variable without method
public class ConstructorUse2 {
	int rollnumber;
	String name;
	
	ConstructorUse2(int roll,String nam){
		rollnumber=roll;
		name=nam;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorUse2 obj=new ConstructorUse2(100,"Anbu");
		ConstructorUse2 obj1=new ConstructorUse2(101,"Asha");
		System.out.println("NAME= "+obj.name+" ROLLNUMBER= "+obj.rollnumber);
		System.out.println("NAME= "+obj1.name+" ROLLNUMBER= "+obj1.rollnumber);
	}

}
