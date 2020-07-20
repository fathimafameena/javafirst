package onlineTutorial;

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//there are two scopes in java
		//they are object or instance variable and local variable or method variable
		//if both the variable name is same to know which is object or instance variable we use this keyword.
		//since there will be more objects  in a class ,this will mention the current object.
		
		AnotherThis obj=new AnotherThis();
		obj.num1=3;
		obj.num2=5;
		System.out.println(obj.num1);
		AnotherThis obj1=new AnotherThis(11,12);
		
		System.out.println(obj1.num1);
		AnotherThis obj3=new AnotherThis(3.8,7.6);
		
		System.out.println(obj3.num1);
	}

}

 class AnotherThis{
	
	int num1;
	int num2;
	
	AnotherThis(){
		
	}
	
	AnotherThis(int num1,int num2){
		
		this.num1=num1;
		this.num2=num2;
	}
	
	AnotherThis(double num1,double num2){
		
		this.num1=(int)num1;
		this.num2=(int)num2;
	}
	
}
