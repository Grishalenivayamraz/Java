import java.util.Scanner;

public class Calculator
{
 
	public static void main(String[] args) 
	{
		int kek = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����");
			int x = sc.nextInt();
		System.out.println("������� ������ �����");
			int y = sc.nextInt();
		System.out.println("������� ����");
			String op = sc.next();
			System.out.println("��� ��������� " );
		switch( op )
		{
		case "+": kek = x + y;
							break;
		case "-": kek = x - y;
							break;
		case "*": kek = x * y;
							break;
		case "/": kek = x / y;
							break;
		}
		System.out.println(kek);
	}
}