/*
* Calculate the minimum value from 2 values
*/
public int minimumOfTwo(int Var1, int Var2)
{
		if(Var1>Var2){
		return Var2;
		}else{return Var1;}
}

/*
* Calculate the minimum value from 3 values
*/
public int minimumOfThree(int Var1, int Var2, int Var3)
{
	return minimumOfTwo(Var1,minimumOfTwo(Var2,Var3));
}

/*
* Calculate the maximum value from 2 values
*/
public int maximumOfTwo(int Var1, int Var2)
{
		if(Var1<Var2){
		return Var2;
		}else{return Var1;}
}

/*
* Calculate the maximum value from 3 values
*/
public int maximumOfThree(int Var1, int Var2, int Var3)
{
		return maximumOfTwo(Var1,maximumOfTwo(Var2,Var3));

}

/*
* Calculate the maximum value from an array values
*/
public int maximumOfArray(int[] Var1)
{
		int maxValue = Var1[0];
		for(int i=1;i < Var1.length;i++){
		maxValue=maximumOfTwo(maxValue,Var1[i]);
		}
		return maxValue;
		}

/*
* Calculate the minimum value from an array values
*/
public int minimumOfArray(int[] Var1)
{
		int minValue = Var1[0];
		for(int i=1;i < Var1.length;i++){
			minValue=minimumOfTwo(minValue,Var1[i]);
		}
		return minValue;
		}
}

/*
* sum of 2 numbers
*/
public int sumOfTwo(int Var1, int Var2)
{
	return Var1+Var2;
}

/*
* sum of 3 numbers
*/
public int sumOfThree(int Var1, int Var2, int Var3)
{
	return sumOfTwo(Var1,sumOfTwo(Var2,Var3));
}

/*
* sum of Array
*/
public int sumOfArray(int[] Var1)
{
		int sum=0;
		for(int i=1;i < Var1.length;i++){
			sum=sumOfTwo(sum,Var1[i]);
		}
		return sum;
}

/*
* Subtraction of two numbers
*/
public int sub(int Var1, int Var2)
{
	return Var1-Var2;
}

/*
* Multiply of 2 numbers
*/
public int mul(int Var1, int Var2)
{
	return Var1*Var2;
}

/*
* Multiply of 3 numbers
*/
public int mul(int Var1, int Var2, int Var3)
{
	return mul(Var1,mul(Var2,Var3))
}

/*
* Multiply of array values
*/
public int mul(int[] Var1)
{
		int var2=Var1[0]
		int var3=1;
		for(int i=1;i < Var1.length;i++){
		var3=mul(var2,Var1[i]);
		}
	return var3
}

/*
* The method returns the value of the first argument raised to the power of the second argument
*/
public int pow(int Var1, int Var2)
{
		int var3=Var1;
		for(int i=0;i < Var2;i++){
		  var3=mul(var3,Var1);
		}
	return var3;
}

/*
* Returns the absolute value of a double value
*/
public double abs(double Var1)
{
		if(Var1 < 0){
		return neg(Var1);
		}else{
		return Var1;
		}
}

/*
* Returns the absolute value of a float value
*/
public float abs(float Var1)
{
		if(Var1 < 0){
		return neg(Var1);
		}else{
		return Var1;
		}
}

/*
* Returns the absolute value of a int value
*/
public int abs(int Var1)
{
		if(Var1 < 0){
		return neg(Var1);
		}else{
		return Var1;
		}
}

/*
* Returns the absolute value of a long value
*/
public long abs(long Var1)
{
		if(Var1 < 0){
		return neg(Var1);
		}else{
		return Var1;
		}
}

/*
* Return the division of first argument in the second one
*/
public double divide(int Var1, int Var2)
{
	return Var1 / Var2;
}

/*
* This method returns the positive square root
*/
public double sqrt(double Var1)
{
	return Math.sqrt(Var1);
}

/*
* The remainder in a division
*/
public double mod(double Var1, double Var2)
{
	return Var1%Var2;
}

/*
* Check if the number is even
*/
public int isEven(int Var1)
{
	return (Var1 % 2 == 0);
}

/*
* Check if the number is odd
*/
public int isOdd(int Var1)
{
	return !isEven(Var1);
}

/**
 * Check if the first number divide with the second without reminder
 */
public boolean isDivide(int Var1,int Var2){
		return Var1%Var2==0
}

/*
* Check if the number is prime number
*/
public boolean isPrime(int Var1)
{
		for(int i=2;i<n;i++) {
		if(isDivide(n,i))
		return false;
		}
		return true;
}

/*
* compare between 2 int numbers
*/
public int Comperator(int Var1, int Var2)
{
		if(Var1>Var2){
		return 1;
		}else if(Var1==Var2){
		return 0;
		}else{return -1;}
}

/*
* compare between 2 float numbers
*/
public float Comperator(float Var1, float Var2)
{
		if(Var1>Var2){
		return 1;
		}else if(Var1==Var2){
		return 0;
		}else{return -1;}
}

/*
* compare between 2 double numbers
*/
public double Comperator(double Var1, double Var2)
{
		if(Var1>Var2){
		return 1;
		}else if(Var1==Var2){
		return 0;
		}else{return -1;}
}

/*
* Returns the closest int to the argument
*/
public int round(float Var1)
{
		return Math.round(Var1);
}

/*
* Returns the closest long to the argument with ties rounding to positive infinity
*/
public long round(double Var1)
{
	return Math.round(Var1);
}

/*
* Returns the closest long to the argument with down rounding to positive infinity
*/
public long floor(double Var1)
{
	return Math.floor(Var1);
}

/*
* Returns the closest long to the argument with down rounding to positive infinity
*/
public long roundDown(double Var1)
{
	return floor(Var1);
}

/*
* Returns the closest long to the argument with up rounding to positive infinity
*/
public long roundUp(double Var1)
{
	return floor(Var1+1);
}

/*
* Return the negative value of the parameter
*/
public int neg(int Var1)
{
	if(Var1>0){
		return -Var1;
		}else{
		return Var1;
		}
}

/*
* Returns a double value with a positive sign greater than or equal to 0 and less than 1
*/
public double random()
{
	return Math.random();
}

/*
* check if the two int value equals
*/
public boolean equals(int Var1, int Var2)
{
	return Var1==Var2;
}

/*
* check if the two float value equals
*/
public boolean equals(float Var1, float Var2)
{
		return Var1==Var2;
}

/*
* check if the three float value equals
*/
public boolean equals(float Var1, float Var2, float Var3)
{
		return equals(Var1,Var2)&&equals(Var2,Var3));
}

/*
* check if the three int value equals
*/
public boolean equals(int Var1, int Var2, int Var3)
{
		return equals(Var1,Var2)&&equals(Var2,Var3));
}

/*
* The method is used to get a String object representing the value of the Number Object
*/
public String toString(int Var1)
{
	return String.valueOf(Var1);
}

