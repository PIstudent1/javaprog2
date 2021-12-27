import com.lab.*;

public class demo{
	static Human[] driv = new Human[2];
	public static void main(String[] args) {
		Date[] data = new Date[2];
		Date[][] data1 = new Date[3][2];
		for(int i=0; i < 2; i++){
			data[i] = new Date(12,11,2021);
			data[i].output();
		}
		for(int i=0;i < 3; i++){
			for(int j=0;j<2;j++){
				data1[i][j] = new Date(15,8,2001);
				data1[i][j].output();
				System.out.print("  ");
			}

		}

try{
		Date dte = new Date(12, 11, 2021);
		Date dte1 = dte.clone();
		dte1.output();
}	
catch(CloneNotSupportedException ex){
                  
    System.out.println("Clonable not implemented");
}
	}
}