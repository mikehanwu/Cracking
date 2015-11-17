package ctci;

/*
 * Assume you have a method isSubstring which checks if one word is a substring of another
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 
 * using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
 */

public class Question8 {
	

	public static void main(String[] args){	
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "abcd";
		String s5 = "bcda";
		String s6 = "dcba";
		
		pt(isRotate(s1, s4)); //false
		pt(isRotate(s2, s2)); //true
		pt(isRotate(s2, s4)); //false
		pt(isRotate(s3, s4)); //false
		pt(isRotate(s4, s4)); //true
		pt(isRotate(s5, s4)); //true
		pt(isRotate(s6, s4)); //false
		
		pt(isRotate(s4, s1)); //false
		pt(isRotate(s4, s2)); //false
	}
	
	//Checks if str1 is str2 rotated
	public static boolean isRotate(String str1, String str2){
		if(str1==null || str2==null){
			return false;
		}
		if(str1.length()!=str2.length()){
			return false;
		}else{
			return (str2+str2).contains(str1); //contains is the same is isSubstring
		}
	}
		
	private static void pt(Object obj){
		System.out.println(obj);
	}
}
