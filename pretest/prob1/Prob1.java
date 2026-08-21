package prob1;

public class Prob1 {

	public static void main(String[] args) {
		
		int arr1 [] = {4,7,2,9,1};
		
		int length = arr1.length;
		int prevNUM = 0;
		
		
		for (int i = 0; i < length; i++) {
			
			int newNUM = arr1[i]-prevNUM;
			
			prevNUM = arr1[i];
			
			System.out.println(newNUM);
			
			
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
