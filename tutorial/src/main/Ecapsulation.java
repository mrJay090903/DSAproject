package main;



public class Ecapsulation {

    private int  userID;
	private String userName;
	private String firstName,lastName;
	
	Ecapsulation (int userID, String userName, String firstName, String lastName){
	
	}
	void setUserID(int setUserID) {
		this.userID=userID;
		
	}
	int getUserID() {
		return userID;
	}
	
	void setuserName(String userName) {
		
		this.userName=userName;
	}
	void setfirstName(String firstName) {
		
		this.firstName=firstName;
		
	}
	
	
	String getuserName() {
		return userName;
	}
	
	
	String getfirstName() {
		return firstName;
	}
	
}
