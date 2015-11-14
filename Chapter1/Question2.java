package ctci;

//Write a code to reverse a Java-Style String

public class Question2 {
	

	public static void main(String[] args){	
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "a";
		String s5 = "aaa";
		String s6 = "aaabbb";
		String s7 = "asdfasdf";
		String s8 = "asdfghjkl";
		
		pt(reverse(s1));
		pt(reverse(s2));
		pt(reverse(s3));
		pt(reverse(s4));
		pt(reverse(s5));
		pt(reverse(s6));	
		pt(reverse(s7));	
		pt(reverse(s8));	
	}
	
	public static String reverse(String str){
		if(str==null){
			return null;
		}
		else if (str==""){
			return "";
		}
		else{
			char[] reverse = new char[str.length()];
			for(int i = 0, j = str.length()-1; i<str.length(); i++, j--){
				reverse[i] = str.charAt(j);
			}
			return new String(reverse);
		}
	}
	
	private static void pt(Object obj){
		System.out.println(obj);
	}
}

