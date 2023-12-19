import java.util.Scanner;

public class Uspeh {

	public static void metodUspeh (double  bodovi) {
	if (bodovi>=8.5) {
		System.out.println("Odlicen");
		}else if (bodovi>=7.5) {
		System.out.println("Mnogu dobra");
		}else if (bodovi>=5.5) {
			System.out.println("Dobar");
		}else if (bodovi>=3.5) {
			System.out.println ("Dovolen");
		}else {
			System.out.print("Nedovolen");
		}
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Vnesi bodovi od 1-10");
		System.out.println("Broj na bodovi");
		double bodovi=input.nextDouble();
		System.out.println ("Za broj na bodovi"+bodovi+"uspeh e: ");
		metodUspeh (bodovi);
		}
		}


