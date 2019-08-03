package basicInterviewQuestions;

public class Reverse {

	public static void main(String[] args) {
		
		String str = "richard";
		char chars[] = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--)
			System.out.println(chars[i]);
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();
		System.out.println(str2);
		
		
			
		

	}

}
