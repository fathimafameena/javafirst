package onlineTutorial;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//continue will skip the code after it and goes to the next iteration.
		//break will get out of the loop
		for(int i=1;i<=10;i++)
		{
			
			if(i==7) {
				
				continue;
			}
			if(i>8) {
				
				break;
			}
			System.out.println("the value of i is"+i);
		}

	}

}
