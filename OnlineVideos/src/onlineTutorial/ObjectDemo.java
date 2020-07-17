package onlineTutorial;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc obj=new Calc();//ref for the calc class
		obj.num1=3;
		obj.num2=4;
		int output=obj.add();
		
		System.out.println("the output of add is"+output);
		

	}

}
  class Calc{
	int num1;
	int num2;
	int result;
	
	public int add() {
		
		result=num1+num2;
		return result;
	}
	
	
}