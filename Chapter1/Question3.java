package ctci;

/*
 * Design an algorithm and write code to remove the duplicate characters in a string 
 * without using any additional buffer 
 * NOTE: One or two additional variables are fine An extra copy of the array is not.
 * 
 * FOLLOW UP
 * Write the test cases for this method
 */

public class Question3 {
	

	public static void main(String[] args){	
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "a";
		String s5 = "aaa";
		String s6 = "aaabbb";
		String s7 = "asdfasdf";
		String s8 = "asdfghjkl";
		
		assert removeDups(s1) ==null;
		assert removeDups(s2) == "";
		assert (removeDups(s3)) == " "; 
		assert (removeDups(s4)) == "a";
		assert (removeDups(s5)) == "a";
		assert (removeDups(s6)) == "ab";	
		assert (removeDups(s7)) == "asdf";	
		assert (removeDups(s8)) == "asdfghjkl";	
		pt("Passed!");
	}
	
	public static String removeDups(String str){
		if(str==null){
			return null;
		}
		else if (str.length()<=1){
			return str;
		}
		else{
			//i keeps track of which elements we've looked at already
			//index keeps track of up to which index are not dups
			//j keeps track of which non-dup elements we've looked at
			int index = 0;
			char[] chars = str.toCharArray();
			for(int i = 0; i<chars.length; i++){
				boolean foundDup = false;
				for(int j = 0; j<index; j++){
					 if(chars[i]==chars[j]){
						 foundDup=true;
						 break;
					 }
				}
				if(!foundDup){
					//Write to the front, where we are guaranteed not to have dups
					chars[index] = chars[i];
					index++;
				}
			}
			return new String(chars).substring(0, index);
		}
	}
	
	private static void pt(Object obj){
		System.out.println(obj);
	}
}

