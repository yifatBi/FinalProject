/*
* Inserts the specified element at the specified position in this list
*/
public void add(List Var1, int Var2, Object Var3)
{
	return Var1.add(Var2,Var3);
}

/*
* Returns true if this list contains the specified element
*/
public boolean contains(List Var1, List Var2)
{
	return Var1.contains(Var2);
}

/*
* Returns if the first list contains all elements of the second argument.
*/
public boolean containsAll(List Var1, List Var2)
{
	return Var1.containsAll(Var2);
}

/*
* Compares two list for equality.
*/
public boolean equals(List Var1, List Var2)
{
	return Var1.equals(Var2);
}

/*
* Compares three list for equality.
*/
public boolean equals(List Var1, List Var2, List Var3)
{
		return Var1.equals(Var2)&&Var1.equals(Var3);
}

/*
* Returns the element at the specified position in this list
*/
public int get(List Var1, int Var2)
{
	return Var1.get(Var2);
}

/*
* Returns the index of the first occurrence of the specified element in this list
*/
public int indexOf(List Var1, Object Var2)
{
	return Var1.indexOf(Var2);
}

/*
* Returns the index of the last occurrence of the specified element in this list
*/
public int lastIndexOf(List Var1, Object Var2)
{
	return Var1.lastIndexOf(Var2);
}

/*
* Returns if this list contains no elements.
*/
public boolean isEmpty(List Var1)
{
	return Var1.isEmpty();
}

/*
* Returns if this list contains elements.
*/
public boolean has(List Var1)
{
	return !Var1.isEmpty();
}

/*
* Returns the number of elements in this list
*/
public int size(List Var1)
{
	return Var1.size();
}

/*
* Returns an array containing all of the elements in this list in proper sequence
*/
public Object[] toArray(List Var1)
{
	return Var1.toArray();
}

/*
* Returns the list between to arguments index
*/
public List sublist(List Var1, int Var2, int Var3)
{
	return Var1.sublist(Var2,Var3);
}

/*
* Returns the list from the given index
*/
public List sublist(List Var1, int Var2)
{
		return Var1.sublist(Var2,Var1.size()-1);
}

/*
* Return the smallest value in the list
*/
public int minValue(List Var1)
{
	int var2=Var1.get(0);
	for(int var3=1;var3<Var1.size();var3++){
		var2=Math.min(var2,Var1.get(var3));
		}
		return var2;
}

/*
* Return the biggest value in the list
*/
public int maxValue(List Var1)
{
		int var2=Var1.get(0);
		for(int var3=1;var3<Var1.size();var3++){
		var2=Math.max(var2,Var1.get(var3));
		}
		return var2;
}

/*
* Return the sum of list values
*/
public int sum(List Var1)
{
		int var2=Var1.get(0);
		for(int var3=1;var3<Var1.size();var3++){
			var2+=Var1.get(var3);
		}
		return var2;
}

/*
* Return the multiply of all list values
*/
public int mul(List Var1)
{
		int var2=Var1.get(0);
		for(int var3=1;var3<Var1.size();var3++){
		var2=var2 * (Var1.get(var3));
		}
		return var2;
}

/*
* Removes all of the elements from this list
*/
public void clear(List Var1)
{
	return Var1.clear();
}


/*
* Appends the specified element to the end of this list
*/
public boolean add(List Var1, Object Var2)
{
	return Var1.add(Var2);
}

/*
* Add all value of second list to the first one
*/
public boolean addAll(List Var1, List Var2)
{
	return Var1.addAll(Var2);
}

/*
* Inserts all of the elements of second arguments into the first list at the specified position
*/
public boolean addAll(List Var1, List Var2, int Var3)
{
	return Var1.addAll(Var3,Var2);
}

/*
* Removes the element at the specified position in this list
*/
public boolean remove(List Var1, int Var2)
{
	return Var1.remove(Var2);
}

/*
* Removes the first occurrence of the specified element of the list
*/
public boolean remove(List Var1, Object Var2)
{
		return Var1.remove(Var2);
}

/*
* Removes from first list all of its elements that are contained in the second list
*/
public boolean removeAll(List Var1, List Var2)
{
	return Var1.removeAll(Var2);
}

/*
* Replaces the element at the specified position in this list with the specified element 
*/
public Object set(List Var1,int Var2,Object Var3)
{
	return Var1.set(Var2,Var3);
}

/*
* Return sorted list
*/
public List sort(List Var1)
{
		Arrays.sort(Var1.toArray());
}

