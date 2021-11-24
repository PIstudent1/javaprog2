package com.lab; 
import java.util.Scanner;


public class Date{
	private int day;
	private int month;
	private int year;
	
	public void output(){
	    System.out.printf("%d.%d.%d", this.day, this.month, this.year);
	}
	public Date(){
	}
	public void init(int day, int month, int year){
		if(day<0 || day>31){
			this.day = 0; 
		}
		else{
	    this.day = day;
		}
		if(month<0 || month>12){
			this.month = 0;
		}
		else{
		this.month = month;
		}
		if(year<0){
			this.year = 0;
		}
		else{
		this.year = year;
		}
	}
	public void input(){
	    Scanner in = new Scanner(System.in);
		int day;
		int month;
		int year;
		do{
			System.out.print("Input day: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input day: ");
				in.next();
		}
		day = in.nextInt();
		}while(day <= 0 || day > 31);
		this.day = day;
		do{
			System.out.print("Input month: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input month: ");
				in.next();
		}
		month = in.nextInt();
		}while(month <= 0 || month > 12);
		this.month = month;
		do{
			System.out.print("Input year: ");
			while(!in.hasNextInt()){
				System.out.println("That's not a number!");
				System.out.print("Input year: ");
				in.next();
		}
		year = in.nextInt();
		}while(year <= 0);
		this.year = year;
    }
	
	public int indays(Date date){
		int sum;
		int sum1;
		if (this.month < 3) {
		this.year--; this.month += 12;
	}
	sum=365 * this.year + this.year / 4 - this.year / 100 + this.year / 400 + (153 * this.month - 457) / 5 + this.day - 306;
	if (date.month < 3) {
		date.year--; date.month += 12;
	}
	sum1 = 365 * date.year + date.year / 4 - date.year / 100 + date.year / 400 + (153 * date.month - 457) / 5 + date.day - 306;
	if(sum < sum1){
		System.out.print("The first date is greater than the first");
	}
	return Helper.Help(sum,sum1);
	}
	
}
