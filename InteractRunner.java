import java.util.Scanner;

/**
 * Класс для работы с калькулятором
 */
public class InteractRunner {
	
	
	public static void main(String[] args){
		System.out.println("Program is work!");		
		Calculator calc = new Calculator();
		Scanner scn = new Scanner(System.in);
		try {		
			String exit = "no";
			while(!exit.equals("yes")){
				calc.cleanResult();
				System.out.println("Enter first arg: ");
				int first = scn.nextInt();
				System.out.println("Enter second arg: ");
				int second = scn.nextInt();
				
				System.out.println("Select operation:(add,sub,mul,div)");
				String operation = scn.next();
				switch(operation){
					case "add": calc.add(first, second);
						break;
					case "sub": calc.sub(first, second);
						break;
					case "mul": calc.mul(first, second);
						break;
					case "div": calc.div(first, second);
				}
				System.out.println("Result: " + calc.getResult());
				System.out.println("Exit : yes/no");
				exit = scn.next();
			}
		} finally {
			scn.close();
		}
	}
}
	