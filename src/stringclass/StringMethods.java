package stringclass;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I /love /java /and /selenium";

String s1="I love java and Selenium";

String s2="";

//System.out.println(s.charAt(7));

//System.out.println(s.length());

//System.out.println(s.substring(2));

//System.out.println(s.substring(7, 24));

//System.out.println(s.contains("java"));

//System.out.println(s.equals(s1));

//System.out.println(s2.isEmpty());

//System.out.println(s.concat(s1));

//System.out.println(s.replace("java", "html"));

//System.out.println(s.equalsIgnoreCase(s1));

//String arr[]=s.split("/");
//for(int i=0;i<arr.length;i++) {
//System.out.println(arr[1]);
//}

String arr[]=s.split("/",4);
System.out.println(arr[2]);





	}

}
