package ctci;

/*
 * Write a method to replace all spaces in a string with ‘%20’
 */

public class Question5 {
	

	public static void main(String[] args){	
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "a";
		String s5 = "a a";
		String s6 = "a  a";
		String s7 = "a  a   ";
		String s8 = " a  ";
		String s9 = "  ";
		String s10 ="vcxzrewqfdsa";
		
		pt (replaceSpace(s1));  //null
		pt (replaceSpace(s2));  //
		pt (replaceSpace(s3));  //%20
		pt (replaceSpace(s4));  //a
		pt (replaceSpace(s5));  //a%20a
		pt (replaceSpace(s6)); 	//a%20%20a
		pt (replaceSpace(s7)); 	//a%20%20a%20%20%20
		pt (replaceSpace(s8)); 	//%20a%20%20
		pt (replaceSpace(s9)); 	//%20%20
		pt (replaceSpace(s10)); //vcxzrewqfdsa

	}
	
	public static String replaceSpace(String str){
		if(str==null){
			return null;
		}
		
		if (str.length()==0){
			return str;
		}
		else{
			int numOfSpaces = 0;
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i)==' ')
					numOfSpaces++;
			}
			char[] chars = new char[str.length()+numOfSpaces*2];
			int charsIndex=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==' '){
					chars[charsIndex++]='%';
					chars[charsIndex++]='2';
					chars[charsIndex++]='0';
				}else{
					chars[charsIndex++]=str.charAt(i);
				}
			}
			return new String(chars);
		}
	}
	
	private static void pt(Object obj){
		System.out.println(obj);
	}
}

