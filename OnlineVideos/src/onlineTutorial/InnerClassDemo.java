package onlineTutorial;



public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj1=new Outer();
		obj1.a=5;
		obj1.name="fameena";
		
		
		Outer.Inner obj2=obj1.new Inner();
		
		obj2.show();
	}

}
class Outer{
	
	

	int a;
	String name;
	
	
	class Inner{
		
		
		public void show() {
			
			
			System.out.println("display" +a+name);
		}
	}
	
	
}
