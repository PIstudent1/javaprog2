package com.lab; 
import java.util.Scanner;

public class Bus{
	private String mark;
	private int num;
	private Engine busengine = new Engine();
	
	public void output(){
		System.out.print("\nBus info: ");
		System.out.printf("\nMark: %s", this.mark );
		System.out.printf("\nNumber: %d", this.num );
		this.busengine.output();
	}
	
	public void init(String mark, int num, Engine busengine){
		this.mark = mark;
		if(num < 0){
			this.num = 0;
		}
		else{
			this.num = num;
		}
		this.busengine = busengine;
	}
	
	public void input(){
		String mark;
		int num;
		Engine busengine = new Engine();
		System.out.print("\nBus info: ");
		Scanner in = new Scanner(System.in);
		System.out.print("\nInput mark: ");
		mark = in.nextLine();
		this.mark = mark;
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
		busengine.input();
		this.busengine = busengine;
	}
}