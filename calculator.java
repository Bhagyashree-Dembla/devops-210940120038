mport java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		boolean exit = false;
		do{
			System.out.println("****Choose Operation****");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			
			switch(sc.nextInt()){
				case 1: System.out.println("Enter first number : ");
						num1 = sc.nextInt();
						System.out.println("Enter second number : ");
						num2 = sc.nextInt();
						System.out.println("Addition is : "+(num1 + num2));
						exit = true;
						break;
				case 2: System.out.println("Enter first number : ");
						num1 = sc.nextInt();
						System.out.println("Enter second number : ");
						num2 = sc.nextInt();
						System.out.println("Subtraction is : "+(num1 - num2));
						exit = true;
						break;
				case 3: System.out.println("Enter first number : ");
						num1 = sc.nextInt();
						System.out.println("Enter second number : ");
						num2 = sc.nextInt();
						System.out.println("Multiplication is : "+(num1 * num2));
						exit = true;
						break;
				case 4: System.out.println("Enter first number : ");
						num1 = sc.nextInt();
						System.out.println("Enter second number : ");
						num2 = sc.nextInt();
						System.out.println("Division is : "+(num1/num2));
						exit = true;
						break;
				case 5: exit = false;
						break;
				default : System.out.println("Choose number from the menu!!");
						break;
			}
		}while(exit);
		sc.close();
	}
}
