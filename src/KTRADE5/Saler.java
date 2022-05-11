package KTRADE5;
import java.util.Scanner;

public class Saler {
	private String name;
	private int sale;
	private double Bonus;{
	}
	public static Scanner s = new Scanner(System.in);
public String getname() {
	return name;
}
public void setname(String name) {
	this.name =  name;
	
}
public int getsale() {
	return sale;
}
public void setsale (int sale) {
	this.sale = sale;
}
public double getBonus() {
	setBonus();
	return Bonus;
}
public void setBonus() {
	Bonus=(sale*0.05);
}
public void intt () {
	System.out.println("ten Saler: "+setname(name));
	System.out.println("doanh so ban hang: "+setsale(sale));
	System.out.println("tien thuong them : "+setBonus());
}


}
