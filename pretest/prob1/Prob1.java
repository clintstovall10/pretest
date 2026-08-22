package prob1;

public class Prob1 {

	public static void main(String[] args) {
		
		//During programming 1 last semester we did not cover methods a
		//whole let and kind of rushed through them. I remember them slightly,
		//just can't remember the syntax without looking it up of course.
		
		
		//Also it took me a while to do this, but overall pretty satisfied. Whenever,
		//I first read the problem, I really thought "there is no way Im getting this"
		//But after some trial on error, I managed to pull it off.
		
		int arr1 [] = {4,7,2,9,1};
		
		int length = arr1.length;
		int prevNUM = arr1[0];
		int maxNUM = arr1[0];
		
		for (int i = 1; i < length; i++) {
			
			int newNUM = arr1[i]-prevNUM;
			
			if (newNUM < 0) {
				
				newNUM = newNUM * -1;
				
				if (newNUM > maxNUM) {
					
					maxNUM = newNUM;
				}
				
			}else {
				if (newNUM > maxNUM) {
					
					maxNUM = newNUM;
				}
			}
			
			prevNUM = arr1[i];
			
		}
		
		System.out.println(maxNUM);
		
		
		
		
		
		
		
		
		

	}

}
