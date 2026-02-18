public class PrimitiveDataType{
	public static void main(String[] args){
		byte age = 30;
		System.out.printf("I am %d Years Old%n",age);
		
		short quantityOfBags = 30000;
		System.out.printf("The quantity of bags ordered is %d%n",quantityOfBags);
		
		int nigeriaPopulation = 2000000000;
		System.out.printf("The population of Nigeria is %d%n",nigeriaPopulation);
		
		long worldPopulation = 9999999999999L;
		System.out.printf("The world population is %d%n",worldPopulation);
		
		
	// float-point primitive datatype
	    float myBalance = 9999.999990F;
		System.out.printf("my Account balance is %.2f%n",myBalance);
		
		
		double cBNBalance = 9999999999.904;
		System.out.printf("CBN Account balance is %f%n",cBNBalance);
		
		
	// single character primitive datatype
		char symbol = '$';
		System.out.printf("my Account balance is %c%.2f%n",symbol,myBalance);
		
		//boolean primitive datatype
		boolean isJavaFun = true;
		System.out.printf("Do you love learning Java? %b%n" ,isJavaFun);
	}
	
	
}