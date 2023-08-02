package controller;
import java.util.*;

public class CalculateBMI {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		double weight=sc.nextDouble();
		double bmi=calculate(height,weight);
		description(bmi);

	}
     public static double calculate(double height, double weight){
		 return weight/(height*height);
	 }
	 public static String description(double bmi){
		 if(bmi<18.5){
			 return "Under Weight";
		 }
		 else if(bmi>=18.5 && bmi<24.9){
			 return "Normal";
		 }
		 else if(bmi>=25 && bmi<29.9){
			 return "Over Weight";
		 }
		 else if(bmi>=30 && bmi<34.9){
			 return "Obese";
		 }
		 else if(bmi>35){
			 return "Extremely Obese";
		 }
		 else{
			 return "";
		 }
	 }
}
