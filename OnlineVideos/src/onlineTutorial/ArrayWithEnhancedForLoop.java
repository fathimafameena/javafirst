package onlineTutorial;

public class ArrayWithEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]= {
				    {1,2,3,4},
				{5,6,7,8},
				{3,0},
				{8,9,7}
				};
		
		
		for(int k[]:a) {
			
			for(int l:k) {
				
				System.out.println("the value of l"+l);
			}
		}
		
		}

	}


