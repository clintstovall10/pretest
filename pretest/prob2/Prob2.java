package prob2;

public class Prob2 {

	public static void main(String[] args) {
		String string1 = "Steam engine in heavy rain";
		
	
		
		int counter = countVowelSequences(string1);
		System.out.println(counter);
		
	
	}

	public static int countVowelSequences (String str) {
		int count = 0;
		int index;
		char ch, nextch;
		
		for (index = 0; index<str.length()-1; index++) {
			ch =str.charAt(index);
			nextch = str.charAt(index+1);
			if (isVowel(ch) && isVowel (nextch)) {
				count++;
			}
			System.out.printf("[%2d]: %c - %c\n", index, ch, nextch);
			
		}
		
		return count;
		
	}
	
	public static boolean isVowel (char ch) {
		boolean boo = true;
		
		if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
				ch == 'I' || ch == 'O' || ch == 'U')){
			
			boo = false;
		}
		
		return boo;
		
	}
	
}
