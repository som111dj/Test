package com.nt.test;

import java.util.Locale;

public class ListCountries {
	 public void displayCountries(){
		 Locale locale[]=Locale.getAvailableLocales();
		 for(Locale l:locale)
		 {
			 System.out.println(l.getDisplayCountry()+"  "+l.getDisplayLanguage());
		 }
		 //Hello1116789

		 //abc1234

		 
		 }
	 public String print() {
		 return "Welcome";
	 }

}
