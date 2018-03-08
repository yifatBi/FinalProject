/*
* Returns the char value at the specified index
*/
public char charAt(String Var1, int Var2)
{
	return Var1.charAt(Var2);
}


/*
* Tests if this string ends with the specified suffix
*/
public boolean endsWith(String Var1, String Var2)
{
		int Var3=Var1.length()-Var2.length()-1;
		for(int i=0;i<Var2.length();i++){
			if(Var2[i]!=Var1[Var3+i]){
			return false;
			}
		}
	return true;
}

/*
* Concatenates the second string argument to the end of the first string argument
*/
public string concat(string Var1, string Var2)
{
	return Var1.concat(Var2);
}

/*
* Returns true if and only if this string contains the specified sequence of char values
*/
public boolean contains(String Var1,String Var2)
{
	return Var1.contains(Var2);
}

/*
* check if those 2 strings are equals
*/
public boolean equals(String Var1, String Var2)
{
	return Var1.equals(Var2)
}

/*
* check if those 3 strings are equals
*/
public boolean equals(String Var1, String Var2, String Var3)
		{
		return Var1.equals(Var2)&&Var1.equals(Var3)
		}
/*
* Compares between two Strings ignoring case considerations
*/
public boolean equalsIgnoreCase(String Var1, String Var2)
{
	return Var1.equalsIgnoreCase(Var2);
}

/*
* Compares between three strings ignoring case considerations
*/
public boolean equalsIgnoreCase(String Var1, String Var2)
		{
		return Var1.equalsIgnoreCase(Var2);
		}

/*
* Returns the index within this string of the first occurrence of the specified character
*/
public int indexOf(String Var1,char Var2)
{
	return Var1.indexOf(Var2);
}

/*
* Returns the index within this string of the first occurrence of the specified substring
*/
public int indexOf(string Var1,String Var2)
{
		return Var1.indexOf(Var2);
}

/*
* check if the string empty
*/
public boolean isEmpty(string Var1)
{
	return Var1.isEmpty();
}

/*
* Returns the index within this string of the last occurrence of the specified character
*/
public int lastIndexOf(String Var1,char Var2)
{
	return Var1.lastIndexOf(Var2);
}

/*
* Returns the index within this string of the last occurrence of the specified substring
*/
public int lastIndexOf(string Var1,String Var2)
{
		return Var1.lastIndexOf(Var2);
}

/*
* Returns the length of this string
*/
public int length(String Var1)
{
	return Var1.length();
}

/*
* Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar
*/
public String replace(String Var1, String Var2)
{
	return Var1.replace(Var2);
}

/*
* Tests if this string starts with the specified prefix
*/
public boolean startWith(String Var1, String Var2)
{
	return Var1.startWith(Var2);
}

/*
* Returns a new string that is a substring of this string
*/
public String substring(String Var1,int Var2)
{
	return Var1.substring(Var2);
}

/*
* Returns a new string that is a substring of this string
*/
public String substring(String Var1,int Var2, int Var3)
{
	return Var1.substring(Var2,Var3);
}

/*
* Converts this string to a new character array
*/
public char[] toCharArray(String Var1)
{
	return Var1.toCharArray();
}

/*
* Converts all of the characters in this String to lower case
*/
public String toLowerCase(String Var1)
{
	return Var1.toLowerCase()
}

/*
* Converts all of the characters in this String to upper case
*/
public String toUpperCase(String Var1)
{
	return Var1.toUpperCase();
}

/*
* Returns a copy of the string with leading and trailing whitespace omitted
*/
public String trim(String Var1)
{
	return Var1.replace(" ","")
}

/*
* Returns the char value at the specified index
*/
public char charAt(String Var1, int Var2)
{
	return Var1.charAt(Var2);
}

