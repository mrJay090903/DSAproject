package main;

import math.arithmetic;
import CreatingObjectMethods.CreatingObjectMethods;
import Product.*;

public class main {

	public static void main(String[] args) {

		int sum = arithmetic.add(4, 5);
	
		int sub=arithmetic.multi(6, 2);
		System.out.println(sub + sum);
	
		

Person p=new Person("Jayar ","Cope",'M',19,"Itaran Polangui Albay");
Person p0=new Person("Diana June ","Abanel",'F',20,"ZOne 3, Itaran Polangui Albay");



product product = new product("Burger",15f);
product product1 = new product("Spaghetti",20f);
product product2 = new product("Palamig",5f);
product product3 = new product("Fita",6f);
product product4 = new product("BBQ",10f);
product product5= new product("Tuna",80f);

CreatingObjectMethods cbm = new CreatingObjectMethods("Bong bong","Hello madlang ppl",100,50,4);

cbm.introduce();
cbm.sayDialog();


Ecapsulation  u= new Ecapsulation(8700,"ar","jayar","Cope");

u.setuserName("ar");
u.setfirstName("Jayar");

String user=u.getuserName();
String Fname=u.getfirstName();

System.out.println("UserName: "+ user + "\n FirstName: " + Fname );



 


}
	
}
