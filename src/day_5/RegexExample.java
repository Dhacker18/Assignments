package day_5;
import java.util.Scanner;

public class RegexExample {
	

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your phone number:");
			String phoneNumber = sc.nextLine();
			Boolean regexMatched = phoneNumber.matches("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$");
			if (regexMatched)
				System.out.println("valid ");
			else
				System.out.println("invalid");
		}

	}

