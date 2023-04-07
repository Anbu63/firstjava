package stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SINCE STRING IS IMMUTABLE IT WONT MODIFY THE VALUE OF S //
		
//String s="hello";
//s.concat("java");
//System.out.println(s);
		
// SO WE USE STRING BUFFER WHICH IS MUTABLE//
		
StringBuffer sb=new StringBuffer("This is string buffer");
System.out.println(sb);
sb.append(" in java");
System.out.println(sb);
	}

}
