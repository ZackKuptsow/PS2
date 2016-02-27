package base;

public class MyInteger {

		
	private static int iValue;
		
	public MyInteger(int value){
		iValue = value;
	}
		
	public int getValue(){
		return iValue;
	}
	
	//Determines if iValue is even
	public static boolean isEven(){
		return (iValue % 2 == 0) ? true : false;
	}
	
	//Determines if iValue is odd
	public static boolean isOdd(){
		return (iValue % 2 == 1) ? true : false;
	}
	
	//Determines if iValue is prime
	public static boolean isPrime(){
		int temp = 0;
		for(temp = 2; temp <= iValue / 2; temp++){
			if(iValue % temp != 0)
				return true;
		}
		return false;
	}
	
	//Determines if integer is even
	public static boolean isEven(int iValue){
		return (iValue % 2 == 0) ? true : false;
	}
	
	//Determines if integer is odd
	public static boolean isOdd(int iValue){
		return (iValue % 2 == 1) ? true : false;
	}
	
	//Determines if integer is prime
	public static boolean isPrime(int iValue){
		if(iValue == 2){
			return true;
		}
		int temp = 0;
		for(temp = 2; temp <= iValue / 2; temp++){
			if(iValue % temp != 0)
				return true;	
		}
		return false;
	}
	
	//Determines if MyInteger value is even
	public static boolean isEven(MyInteger integer){
		return MyInteger.isEven(integer.getValue());
	}
	
	//Determines if MyInteger value is odd
	public static boolean isOdd(MyInteger integer){
		return MyInteger.isOdd(integer.getValue());
	}
	
	//Determines if MyInteger value is prime
	public static boolean isPrime(MyInteger integer){
		return MyInteger.isPrime(integer.getValue());
	}
	
	//Determines if integer is equal to another iValue
	public static boolean isEqual(int newValue){
		return iValue == newValue;
	}
	
	//Determines if MyInteger value is equal to another iValue
	public static boolean isEqual(MyInteger integer){
		return MyInteger.isEqual(integer.getValue());
	}

}


