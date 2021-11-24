import com.lab.*;

public class demo{
	static Driver[] driv = new Driver[2];
	public static void main(String[] args) {
		Date data = new Date();
		Date data1 = new Date();
		int a = 0;
		data.init(12,12,2021);
		data1.init(12,12,1990);
		a = data.indays(data1);
		System.out.printf("Number days between days: %d", a);
		for (int i = 0; i<2; i++){
           driv[i] = new Driver();
        }
		driv[0].init("John", "Johnson", data1);
		driv[1].init("Ivan", "Ivanov", data);
		for (int i = 0; i<2; i++){
            driv[i].output();
        }
	}
}