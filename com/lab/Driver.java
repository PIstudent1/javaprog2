package com.lab; 
import java.util.Scanner;

public class Driver{
	private String name;
	private String lastname;
	private Date birthdate = new Date();
	
	public void output(){
		System.out.print("\nDriver info: ");
		System.out.printf("\nName: %s", this.name );
		System.out.printf("\nLastame: %s", this.lastname );
		System.out.printf("\nBirthdate: "); 
		this.birthdate.output();
	}
	public Driver(){
	}
	public void init(String name, String lastname, Date birthdate){
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}
	public void input(){
		String name;
		String lastname;
		System.out.print("\nDriver info: ");
		Scanner in = new Scanner(System.in);
		System.out.print("\nInput name: ");
		name = in.nextLine();
		this.name = name;
		System.out.print("Input lastname: ");
		lastname = in.nextLine();
		this.lastname = lastname;
		System.out.print("Input birthdate: ");
		Date birthdate = new Date();
		birthdate.input();
		this.birthdate = birthdate;
	}
}