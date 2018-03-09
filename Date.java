/*
* Test if first date is after the second
*/
public boolean after(Date Var1, Date Var2)
{
	return Var1.compareTo(Var2)==1;
}

/*
* Test if first date is before the second
*/
public boolean before(Date Var1, Date Var2)
{
	return Var1.compareTo(Var2)==-1;
}

/*
* Test which one of the dates is before
*/
public int compareTo(Date Var1, Date Var2)
{
	return Var1.compareTo(Var2);
}

/*
* Check if the dates are equals
*/
public boolean equals(Date Var1, Date Var2)
{
	return Var1.equals(Var2);
}

/*
* Check if the 3 dates are equals
*/
public boolean equals(Date Var1, Date Var2, Date Var3)
{
	return Var1.equals(Var2)&&Var1.equals(Var3);
}

/*
* Converts this Date object to a String
*/
public String toString(Date Var1)
{
	return Var1.toString();
}

