import java.util.Scanner;

public class Zodyak {

	public static void main(String[] args) {
		int dogumYili;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Dogum yilinizi girin: ");
		dogumYili = inp.nextInt();
		
		if(dogumYili <= 1900 && dogumYili <= 2022) {
			System.out.println("Lütfen dogru bir deger girdiginizden emin olunuz!");
		}
		
		if(dogumYili%12 == 0) 
		{
			System.out.println("Cin zodyaginiz: Maymun");
		}
		
		if(dogumYili%12 == 1) 
		{
			System.out.println("Cin zodyaginiz: Horoz");
		}
		
		if(dogumYili%12 == 2) 
		{
			System.out.println("Cin zodyaginiz: Kopek");
		}
		
		if(dogumYili%12 == 3) 
		{
			System.out.println("Cin zodyaginiz: Domuz");
		}
		
		if(dogumYili%12 == 4) 
		{
			System.out.println("Cin zodyaginiz: Fare");
		}
		
		if(dogumYili%12 == 5) 
		{
			System.out.println("Cin zodyaginiz: Okuz");
		}
		
		if(dogumYili%12 == 6) 
		{
			System.out.println("Cin zodyaginiz: Kaplan");
		}
		
		if(dogumYili%12 == 7) 
		{
			System.out.println("Cin zodayginiz: Tavsan");
		}
		
		if(dogumYili%12 == 8) 
		{
			System.out.println("Cin zodyaginiz: Ejderha");
		}
		
		if(dogumYili%12 == 9) 
		{
			System.out.println("Cin zodyaginiz: Yilan");
		}
		
		if(dogumYili%12 == 10) 
		{
			System.out.println("Cin zodyaginiz: At");
		}
		
		if(dogumYili%12 == 11) 
		{
			System.out.println("Cin zodyaginiz: Koyun");
		}
	}

}
