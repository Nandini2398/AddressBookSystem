package com.bridgelabz.addressbook;
import java.util.Scanner;

	public class Person {
		static Scanner sc = new Scanner(System.in);
		static String firstName,lastName,address,state,email;
		static int zip;
		static long phoneNumber;
	    static Contact [] personDetails = new Contact[10];
		public static void main(String args[]) {
		    Contact person1 = new Contact("Nandin","Prudhvi","SaiStreet","AP",23,1416,"Prudhviraj@gmail.com");
		    Contact person2 = new Contact("Hemanth","Kumar","Devi","TS",24,8521,"vamsi@outlook.com");
		    Contact person3 = new Contact("vamis","Krishna","Spinning","TN",11,1614,"Krishna@gmail.com");
		    personDetails[0]=person1;
		    personDetails[1]=person2;
		    personDetails[2]=person3;
		    System.out.println("Created contact list is");
		    for(int i = 0; i < 3;i++) {
			   System.out.println(personDetails[i]);
		    }
		}
}