package samplejava;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,12,65,15};
		int maxno=a[0];
		for(int i=0;i<a.length;i++) {
			if(maxno<a[i]) {
				maxno=a[i];
			}
				
		}
		System.out.println(maxno);
}
}
	