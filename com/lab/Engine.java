package com.lab; 
import java.util.Scanner;

public class Engine{
	private int num;
	private int power;
	private Date createdate = new Date();
	
	public void output(){
		System.out.print("\nEngine info: ");
		System.out.printf("\nNumber: %d", num );
		System.out.printf("\nPower: %d", power );
		System.out.printf("\nCreatedate: "); 
		createdate.output();
	}
	
	public Engine(){		
	}
	
	public void init(int num, int power, Date createdate){
		this.num = num;
		this.power = power;
		this.createdate = createdate;
	}
	
	public void input(){
		int num;
		int power;
		Date createdate = new Date();
		System.out.print("\nEngine info: ");
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("Input number: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input number: ");
				in.next();
		}
		num = in.nextInt();
	}while(num <= 0);
	this.num = num;
	do{
			System.out.print("Input power: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input power: ");
				in.next();
		}
		power = in.nextInt();
	}while(power <= 0);
	this.power = power;
	createdate.input();
	this.createdate = createdate;
    }

    public void tokvt(){
		double ls=0.736, res = 0;
		res = this.power * ls;
		System.out.printf("\nPower in kVt: %.2f", res);
	}
}
