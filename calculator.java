package calculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] ags) {
		Scanner input = new Scanner(System.in);
		String x, y, sign; //get user input as strings
		double calcDouble;
		int calcInt;
		String ans = "yes";
		
		while (ans.equalsIgnoreCase("yes")) {
			
			x = input.next();
			sign = input.next();
			y = input.next();
			
			if(((x.contains(".") || y.contains("x")) || sign.equals("/"))) {
				calcDouble = performCalc(x, sign, y);
					
				if((sign.equals("/")) && (calcDouble % 2 == 0.0)) {
					calcInt = (int) calcDouble;
					System.out.println(x + " " + sign + " " + y + " = " + calcInt);
				}
				else {
				System.out.println(x + " " + sign + " " + y + " = " + calcDouble);
				}
				}
				else {
					calcInt = performCalc1(x, sign, y);
					System.out.println(x + " " + sign + " " + y + " = " + calcInt);
				}
				
				System.out.println("Would you like to continue?");
				ans = input.next();
		}
		input.close();
		System.out.println("End of program");
	}
	public static double performCalc(String x, String sign, String y) {
		double a, b, c = 0;
	
			a = Double.parseDouble(x);
			b = Double.parseDouble(y);
			
			if(sign.equals("+")) {
				c = a + b;
			}
			else if(sign.equals("-")) {
				c = a - b;
			}
			else if(sign.equals("*")) {
				c = a * b;
			}
			else {
				c = a / b;
			}
		return c;
	}
	public static int performCalc1(String s, String sign, String k) {
		int a, b, c;
		
		a = Integer.parseInt(s);
		b = Integer.parseInt(k);
		
		if(sign.equals("+")) {
			c = a + b;
		}
		else if(sign.equals("-")) {
			c = a - b;
		}
		else if(sign.equals("*")) {
			c = a * b;
		}
		else {
			c = a / b;
		}
		return c;
	}
}
