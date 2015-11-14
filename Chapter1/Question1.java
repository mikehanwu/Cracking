package ctci;


//Implement an algorithm to determine if a string has all unique characters.
//What if you can not use additional data structures?
public class Question1 {


	public static void main(String[] args){
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "a";
		String s5 = "aaa";
		String s6 = "aaabbb";
		String s7 = "asdfasdf";
		String s8 = "asdfghjkl";

		pt(unique(s1));
		pt(unique(s2));
		pt(unique(s3));
		pt(unique(s4));
		pt(unique(s5));
		pt(unique(s6));
		pt(unique(s7));
		pt(unique(s8));	
	}

	public static boolean unique(String str){
		if(str==null){
			return false;
		}
		else if(str.length()<=1){
			return true;
		}
		else{
			boolean[] bools = new boolean[128];
			for(int i = 0; i<str.length(); i++){
				if(bools[str.charAt(i)]==false)
					bools[str.charAt(i)]=true;
				else
					return false;
			}
			return true;
		}
	}

	private static void pt(Object obj){
		System.out.println(obj);
	}
}
