package com.test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class clock {

	public static void main(String[] args) {
		
		String[] tensNames = {
			    "",
			    " ten",
			    " twenty",
			    " thirty",
			    " forty",
			    " fifty",
			    " sixty",
			    " seventy",
			    " eighty",
			    " ninety"
			  };

			  String[] numNames = {
			    "",
			    " one",
			    " two",
			    " three",
			    " four",
			    " five",
			    " six",
			    " seven",
			    " eight",
			    " nine",
			    " ten",
			    " eleven",
			    " twelve",
			    " thirteen",
			    " fourteen",
			    " fifteen",
			    " sixteen",
			    " seventeen",
			    " eighteen",
			    " nineteen"
			  };
			  	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter time.");
		String time = scanner.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(time, ":");
		
		String t1 = stringTokenizer.nextToken();
		String t2 = stringTokenizer.nextToken();
		
		int hrs = Integer.parseInt(t1);
		int mins = Integer.parseInt(t2);
		
		String finalTimeString = "It's";
		String amPm = " am";

		
		if(hrs <= 24 && mins <= 60 && hrs>=0 && mins>=0) {
			if(hrs == 12 && mins == 0) {
				finalTimeString+= " Midday";
			}
			else if(hrs == 0 && mins ==0) {
				finalTimeString+= " Midnight";
			}
			else {
				if(hrs >= 12) {
					hrs = hrs -12;
					if(hrs == 0)
						hrs =12;
					amPm = " pm";
				}
				
				finalTimeString+=  numNames[hrs];
				if(mins != 0) {
					if(mins > 19) {
						finalTimeString += tensNames[mins/10];
						
						if(mins % 10 != 0) {
							finalTimeString+= numNames[mins%10];
						}
						
					}
					else {
						finalTimeString+= numNames[mins];
					}					
				}
				
				
				finalTimeString += amPm;
			}
			System.out.println(finalTimeString);
		}
		else {
			System.out.println("Enter valid time.");
		}
		
		scanner.close();
	}
}



