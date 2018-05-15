import java.util.List;

public class CombineActions{
	/*
    * Enter sum of two numbers to the list
    */
	public boolean sumAddToList(int Var1, int Var2, List Var3) {
		return Var3.add(Var1+Var2);
	}

	/*
    * Remove the sum of two numbers from the list
    */
	public void sumRemoveFromList(int Var1, int Var2, List Var3) {
		Var3.remove(Var1+Var2);
	}

	/*
    * Concat the sum result to the third argument string
    */
	public String SumConcat(int Var1, int Var2, String Var3) {
		return Var3.concat(String.valueOf(Var1+Var2));
	}

	/*
    * check if sum result equal to the given string
    */
	public boolean SumEqual(int Var1, int Var2, String Var3) {
		return Var3.equals(String.valueOf(Var1+Var2));
	}

	/*
    * Enter multiply of two numbers to the list
    */
	public boolean mulAddToList(int Var1, int Var2, List Var3) {
		return Var3.add(Var1*Var2);
	}

	/*
    * Remove the multiply of two numbers from the list
    */
	public void mulRemoveFromList(int Var1, int Var2, List Var3) {
		 Var3.remove(Var1*Var2);
	}

	/*
    * Concat the multiply result to the third argument string
    */
	public String mulConcat(int Var1, int Var2, String Var3) {
		return Var3.concat(String.valueOf(Var2*Var1));
	}

	/*
    * check if multiply result equal to the given string
    */
	public boolean mulEqual(int Var1, int Var2, String Var3) {
		return Var3.equals(String.valueOf(Var1*Var2));
	}

	/*
    * Enter absolute value to the list
    */
	public boolean absAddToList(int Var1, List Var2) {
		if(Var1>0){
			return Var2.add(Var1);
		}else{
			return Var2.add(-Var1);
		}
	}

	/*
    * Remove the absolute value from the list
    */
	public void absRemoveFromList(int Var1, List Var2) {
		if(Var1>0){
			 Var2.remove(Var1);
		}else{
			 Var2.remove(-Var1);
		}
	}

	/*
    * Concat the absolute value to string
    */
	public String absConcat(int Var1, String Var2) {
		if(Var1>0){return Var2.concat(String.valueOf(Var1));}else{return Var2.concat(String.valueOf(-Var1));}
	}

	/*
    * check if absolute value equal to the given string
    */
	public boolean absEqual(int Var1, String Var2) {
		if(Var1>0){return Var2.equals(String.valueOf(Var1));}else{return Var2.equals(String.valueOf(-Var1));}

	}

	/*
    * Enter max value of two numbers to the list
    */
	public boolean maxAddToList(int Var1, int Var2, List Var3) {
		if(Var1>=Var2){return Var3.add(Var1);}else{return Var3.add(Var2);}
	}

	/*
    * Remove the max value of two numbers from the list
    */
	public void maxRemoveFromList(int Var1, int Var2, List Var3) {
		if(Var1>=Var2){Var3.remove(Var1);}else{Var3.remove(Var2);}
	}

	/*
    * Concat the max value of two numbers to string
    */
	public String maxConcat(int Var1, int Var2, String Var3) {
		if(Var1>=Var2){return Var3.concat(String.valueOf(Var1));}else{return Var3.concat(String.valueOf(Var2));}

	}

	/*
    * check if max value of two numbers equal to the given string
    */
	public boolean maxEqual(int Var1, int Var2, String Var3) {
		return String.valueOf(Math.max(Var1,Var2)).equals(Var3);
	}

	/*
    * check if sum of string and number is even
    */
	public boolean sumIsEven(int Var1, String Var2) {
		return (Integer.parseInt(Var2)+Var1)%2==0;
	}

	/*
    * check if sum of string and number is positive
    */
	public boolean sumIsPositive(int Var1, String Var2) {
		return Integer.parseInt(Var2)+Var1>0;
	}

	/*
    * get the opposite value of sum
    */
	public int sumNeg(int Var1, String Var2) {
		return Math.negateExact(Integer.parseInt(Var2)+Var1);
	}

	/*
    * check if multiply of string and number is even
    */
	public boolean mulIsEven(int Var1, String Var2) {
		return Math.multiplyExact(Integer.parseInt(Var2),Var1)%2==0;

	}

	/*
    * check if multiply of string and number is positive
    */
	public boolean mulIsPositive(int Var1, String Var2) {
		if(Math.abs(Math.multiplyExact(Var1,Integer.parseInt(Var2)))==Math.multiplyExact(Var1,Integer.parseInt(Var2))){
			return true;
		}
		return false;
	}

	/*
    * get the opposite value of multiplication
    */
	public int mulNeg(int Var1, String Var2) {
		return Math.negateExact(Math.addExact(Var1,Integer.parseInt(Var2)));
	}

	/*
    * is minimum value of array is even
    */
	public boolean minIsEven(int[] Var1) {
		int min=Var1[0];
		for(int i:Var1){
			min=Math.min(min,i);
		}
		return min%2==0;
	}

	/*
    * is minimum value of array negative
    */
	public boolean minIsNegative(int[] Var1) {
		int min=Var1[0];
		for(int i:Var1){
			min=Math.min(min,i);
		}
		return min<0;
	}

	/*
    * add minimum value of the array to second argument list
    */
	public boolean minAddToList(int[] Var1, List Var2) {
		int min=Var1[0];
		for(int i:Var1){
			min=Math.min(min,i);
		}
		return Var2.add(min);
	}

	/*
    * is sum of array is even
    */
	public boolean sumIsEven(int[] Var1) {
		int sum=0;
		for(int i:Var1){
			sum+=i;
		}
		return sum%2==0;
	}

	/*
    * is sum value of array negative
    */
	public boolean sumIsNegative(int[] Var1) {
		int sum=0;
		for(int i:Var1){
			sum+=i;
		}
		return sum<0;
	}

	/*
    * add sum value of the array to second argument list
    */
	public boolean sumAddToList(int[] Var1, List Var2) {
		int sum=0;
		for(int i:Var1){
			sum+=i;
		}
		return Var2.add(sum);
	}

	/*
    * is length of array is even
    */
	public boolean lengthIsEven(int[] Var1) {
		return Var1.length % 2==0;
	}

	/*
    * enter the length of array to the second argument list
    */
	public boolean lengthAddToList(int[] Var1, List Var2) {
		return Var2.add(Var1.length);
	}

	/*
    * check if sum of list values is even
    */
	public boolean sumListIsEven(List Var1) {
		int sum=0;
		for(Object i:Var1){
			sum+=Integer.parseInt(i.toString());
		}
		return sum % 2 == 0;
	}

	/*
    * check if specific value of list is even
    */
	public boolean getListIsEven(List Var1, int Var2) {
		return Integer.parseInt(Var1.get(Var2).toString()) % 2==0;
	}

	/*
    * concat the string with the number
    */
	public String concatNumber(String Var1, int Var2) {
		return Var1.concat(String.valueOf(Var2));
	}

	/*
    * concat string and number length
    */
	public int concatNumberLength(String Var1, int Var2) {
		return Var1.concat(String.valueOf(Var2)).length();
	}

	/**
	 * concat the string with max length two the third string
	 */
	public String concatMaxLengthString(String Var1, String Var2, String Var3){
		if(Var1.length()>=Var2.length()){
			return Var3.concat(Var1);
		}else{return Var3.concat(Var2);}
	}
}

