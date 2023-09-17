package CreatingObjectMethods;



public class CreatingObjectMethods {

	String name,dialog;
	int hp,mp,lvl;
	
	public  CreatingObjectMethods(String name,String dialog,int hp,int mp, int lvl){;
		
		this.name=name;
		this.dialog=dialog;
		this.name=name;
		this.hp=hp;
		this.mp=mp;
		this.lvl=lvl;
		
	}
	
public void introduce() {
	System.out.println("Hello" + name);
}
public void sayDialog() {
	System.out.println("my dialog");
	
}
}
