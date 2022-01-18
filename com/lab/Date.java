package com.lab; 
import java.util.Scanner;


public class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	
	public void output(){
	    System.out.printf("%d.%d.%d", this.day, this.month, this.year);
	}
	public Date(){
	}

	public Date(int value){
		this.day = value;
		this.month = value;
		this.year = value;
	}

	public Date(int day, int month, int year){
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
		boolean input;
		do{
			try{
				
				System.out.print("Input day: ");
				day = in.nextInt();
				if(day < 1 || day > 31){
					throw new Exception("Wrong input. Please input number between 1 and 31");
				}
				input = false; 
				this.day = day;
			}
			catch(Exception e){
				System.out.println("Wrong input! Please retry!");
				input = true;
				
			}
		}while(input);
		do{
			try{
				
				System.out.print("Input month: ");
				month = in.nextInt();
				if(month < 1 || month > 12){
					throw new Exception("Wrong input. Please input number between 1 and 12");
				}
				input = false; 
				this.month = month;
			}
			catch(Exception e){
				System.out.println("Wrong input! Please retry!");
				input = true;
				
			}
		}while(input);
		do{
			try{
				System.out.print("Input year: ");
				year = in.nextInt();
				if(year < 1 || year > 2021){
					throw new Exception("Wrong input. Please input number between 1 and 2021");
				}
				input = false; 
				this.year = year;
			}
			catch(Exception e){
				System.out.println("Wrong input! Please retry!");
				input = true;
				
			}
		}while(input);
    }
	
	public Date clone() throws CloneNotSupportedException{
      
        return (Date) super.clone();
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
