/*
* Return the max value of the array
*/
public int maxValue(int[] Var1)
{
		Arrays.sort(Var1);
		return Var1[Var1.length - 1];
}

/*
* Return the min value of the array
*/
public int minValue(int[] Var1)
{
		Arrays.sort(Var1);
		return Var1[0];
}

/*
* Return the sum of all values in the array
*/
public int sum(int[] Var1)
{
		int var2=0;
		for(int value:Var1){
		var2=var2+value;
		}

		return var2;
}

/*
* Return the multiply of all values in the array
*/
public int mul(int[] Var1)
{
		int var2=1;
	for(int value:Var1){
		var2=var2*value;
		}

		return var2;
}

/*
* Return the array as list
*/
public List toList(int[] Var1)
{
	return Arrays.asList(Var1);
}

/*
* Return the number of elements in the array
*/
public int length(int[] Var1)
{
	return Array.getLength(Var1);
}

/*
* Returns the value of the indexed component in the specified array object as boolean
*/
public boolean getAsBoolean(int[] Var1, int Var2)
{
	return Array.getBoolean(Var1,Var2);
}

/*
* Returns the value of the indexed component in the specified array object
*/
public Object get(Object Var1, int Var2)
{
	return Array.get(Var1,Var2);
}

/*
* Check if both arrays are equals
*/
public boolean equals(int[] Var1, int[] Var2)
{
	return Var1.equals(Var2);
}

/*
* Check if three arrays are equals
*/
public boolean equals(int[] Var1, int[] Var2, int[] Var3)
{
	return Var1.equals(Var2)&&Var1.equals(Var3);
}

/*
* Search specific value in the array with Binary Search algorithm
*/
public int binarySearch(int[] Var1, int[] Var2)
{
	return Arrays.binarySearch(Var1,Var2);
}

/*
* Return array sorted asc
*/
public int[] sort(int[] Var1)
{
	return Arrays.sort(Var1);
}

/*
* Return array sorted desc
*/
public int[] sortReverse(int[] Var1)
{
	return     Arrays.sort(Var1, Collections.reverseOrder());
}

