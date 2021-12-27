package com.lab; 
import java.util.Scanner;

public class Human{
	private String name;
	private String lastname;
	private Date birthdate = new Date();
	
	public String toString() {
        return "\nName: " + this.name + "\n"
		+ "Lastname: " + this.lastname + "\n"
		+ "\nBirthdate: " + this.birthdate + "\n" ;
	}
	public Human(){
	}

	public Human(String value){
        this.name = value;
	}
	public Human(String name, String lastname, Date birthdate){
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}
	public void input(){
		String name;
		String lastname;
		
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("\nInput name: ");
			name = in.nextLine();
			if(name.trim().length() == 0 || name == " "  || name == "\n" ){
			System.out.println("You haven't entered anything!"); 
			}
		}while(name.trim().length() == 0 || name == " "  || name == "\n"  );
		this.name = name;
		do{
			System.out.print("\nInput lastname: ");
			lastname = in.nextLine();
			if(lastname.trim().length() == 0 || lastname == " "  || lastname == "\n" ){
			System.out.println("You haven't entered anything!"); 
			}
		}while(lastname.trim().length() == 0 || lastname == " "  || lastname == "\n"  );
		this.lastname = lastname;
		System.out.print("Input birthdate: ");
		Date birthdate = new Date();
		birthdate.input();
		this.birthdate = birthdate;
	}
}

class Driver extends Human{
 
protected Bus driversbus = new Bus();

public Driver(){
}

public Driver(String name, String lastname, Date birthdate, Bus driversbus){
	super(name,lastname, birthdate);
	this.driversbus = driversbus;
}

public void Input(){
	System.out.print("\nDriver info: ");
	this.input();
	System.out.print("\nBus info: ");
	driversbus.input();
}

public String toString() {
	return "\nDriver info: " + this + "\n"
	+ "Bus info: " + driversbus + "\n";
}

}

class Passenger extends Human{
public Passenger(){
}
}