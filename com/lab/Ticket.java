package com.lab; 
import java.util.Scanner;

public class Ticket{
	private int sum;
	private String destination;
	private int hours; 
	private int minutes; 
	private Driver ticketdriver = new Driver();
	
	public void output(){
		System.out.print("\nTicket info: ");
		System.out.printf("\nDestination: %s", this.destination);
		System.out.printf("\nSum: %d", this.sum );
		System.out.printf("\nTime: %d:%d", this.hours, this.minutes); 
		this.ticketdriver.output();
	}
	public Ticket(){
	}
	public void init(String destination, int sum,  int hours, int minutes, Driver ticketdriver){
		this.destination = destination;
		if (sum<0){
			this.sum=0;
		}
		else{
			this.sum = sum;
		}
		if(hours<0 || hours>24){
			this.hours = 0;
		}
		else{
			this.hours = hours;
		}
		if(minutes<0 || minutes>60){
			this.minutes = 0;
		}
		else{
			this.minutes = minutes;
		}
	}
	public void input(){
		int sum;
		String destination;
		int hours;
		int minutes;
		Driver ticketdriver = new Driver();
		System.out.print("\nTicket info: ");
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("\nInput destination: ");
			destination = in.nextLine();
			if(destination.trim().length() == 0 || destination == " "  || destination == "\n" ){
			System.out.println("You haven't entered anything!"); 
			}
		}while(destination.trim().length() == 0 || destination == " "  || destination == "\n"  );
		this.destination = destination;
		do{
			System.out.print("Input sum: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input sum: ");
				in.next();
		}
		sum = in.nextInt();
		}while(sum < 0);
		this.sum = sum;
		do{
			System.out.print("Input hours: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input hours: ");
				in.next();
		}
		hours = in.nextInt();
		}while(hours < 0 || hours > 24);
		this.hours = hours;
		do{
			System.out.print("Input minutes: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input minutes: ");
				in.next();
		}
		minutes = in.nextInt();
		}while(minutes < 0 || minutes > 60);
		this.minutes = minutes;
		ticketdriver.input();
		this.ticketdriver = ticketdriver;
	}
	
	public void sale(){
		int sl1=0;
		double sl2=0;
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("\nInput discount percentage: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("\nInput discount percentage: ");
				in.next();
		}
		sl1 = in.nextInt();
		}while(sl1 < 0 || sl1 > 100);
		sl2 = this.sum - (this.sum * sl1/100);
		System.out.printf("\nDiscount price: %.2f", sl2);
	}
}