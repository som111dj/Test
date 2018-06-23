package com.nt.test;
//import com.nt.test.Math;


public class SampleApp {

	public static void main(String[] args) {
		System.out.println("Hello !");
		for(int i=1;i<=10;++i){
			System.out.println(i);
		}// end of for loop
	//	System.out.println("Add ="+new Math().sum(100,200));
		WishGenerator generator= new WishGenerator();
		System.out.println("Message:: " +generator.generateWishMessage("SOUMYA"));
		//invoke method 
		
		new ListCountries().displayCountries();
		System.out.println(new ListCountries().print());
		

	}//end of main(-)

}// end of class
