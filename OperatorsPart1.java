public class OperatorsPart1{
	public static void main(String[] args){
		//assignment operators
		int num = 50;
		System.out.printf("The value of num is %d%n" ,num);
		
		
		//Arithmetic operators(+,-,*,/,%)
		int num1 = 100;
		int num2 = 500;
		int addition = num1 + num2;
		System.out.printf("The sum of %d and %d is %d%n",num1,num2,addition);
		
		
		int subtraction = num1 - num2;
		System.out.printf("The diffrence between  %d and %d is %d%n",num1,num2,subtraction);
		
		
		int mutiplication = num1 * num2;
		System.out.printf("The product of %d and %d is %d%n",num1,num2,mutiplication);
		
		
		double quotient = (double)num1/num2;
		System.out.printf("The quotient of %d / %d is %f%n",num1,num2,quotient);
		
		
		int remainder = num1%num2;
		System.out.printf("The remainder between %d and %d is %d%n",num1,num2,remainder);
		
		
		//compound assignment operators
		num1 += num2;
		System.out.printf("The vale of num1 is now %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The vale of num1 is now %d%n",num1);
		
		
		num1 -= num2;
		System.out.printf("The vale of num1 is now %d%n",num1);
		
		
		num1 /= num2;
		System.out.printf("The vale of num1 is now %d%n",num1);
		
		
		num1 %= num2;
		System.out.printf("The vale of num1 is now %d%n",num1);
		
		
		
		//Relational operators(>,<,>=,<=,!=,==)
		int number1 = 20, number2 = 50;
		
		boolean isGreater = number1 > number2;
		System.out.printf("Is %d > %d? %b%n",number1,number2,isGreater);
		
		
		boolean isLessThan = number1 < number2;
		System.out.printf("Is %d < %d? %b%n",number1,number2,isLessThan);
		
		boolean isGreaterThanOrEqualTo = number1 >= number2;
		System.out.printf("Is %d >= %d? %b%n",number1,number2,isGreaterThanOrEqualTo);
		
		
		boolean isLessThanOrEqualTo = number1 <= number2;
		System.out.printf("Is %d <= %d? %b%n",number1,number2,isLessThanOrEqualTo);
		
		
		boolean isNotEqualTo = number1 != number2;
		System.out.printf("Is %d != %d? %b%n",number1,number2,isNotEqualTo);
		
		boolean isEqualTo = number1 == number2;
		System.out.printf("Is %d == %d? %b%n",number1,number2,isEqualTo);
		
		
		
		
		
	}
}