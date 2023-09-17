package main;

public class Person {

	String firstName , secondName , add; ; 
	char sex;
	int age;
	
	
	public  Person(String firstName,
			String secondName,char sex,int age,String add)
	{
		
		this.firstName=firstName;
		this.secondName=secondName;
		this.sex=sex;
		this.age=age;
		this.add=add;
		
		System.out.println(firstName + secondName);
		System.out.println(sex );
		System.out.println(age );
	}
	
}
