package ctci;

/*
 * Write a method to decide if two strings are anagrams or not
 */

public class Question4 {
	

	public static void main(String[] args){	
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "a";
		String s5 = "aaa";
		String s6 = "aaabbb";
		String s7 = "bbbaaa";
		String s8 = "bababa";
		String s9 = "asdfqwerzxcv";
		String s10 ="vcxzrewqfdsa";
		
		pt (anagrams(s1,s1));  //false
		pt (anagrams(s2,s1));  //false
		pt (anagrams(s2, s2)); //true 
		pt (anagrams(s2, s3)); //false
		pt (anagrams(s3, s1)); //false
		pt (anagrams(s3, s3)); //true	
		pt (anagrams(s4, s4)); //true	
		pt (anagrams(s5, s5)); //true	
		pt (anagrams(s4, s5)); //false	
		pt (anagrams(s6, s7)); //true
		pt (anagrams(s6, s8)); //false
		pt (anagrams(s9, s10));//true
	}
	
	public static boolean anagrams(String str1, String str2){
		if(str1==null || str2==null){
			return false;
		}
		if (str1.length()!=str2.length()){
			return false;
		}
		if (str1==str2){
			return true;
		}
		else{
			for(int i=0, j=str1.length()-1;i<str1.length()/2;i++,j--){
				if(str1.charAt(i)!=str2.charAt(j)){
					return false;
				}
			}
			return true;
		}
	}
	
	private static void pt(Object obj){
		System.out.println(obj);
	}
}

