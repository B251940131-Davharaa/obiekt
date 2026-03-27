package lab7;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		OyutanManager manager = new OyutanManager();
		 while(true) {
			 System.out.println("\n ---Menu---");
			 System.out.println("1. Oyutan nemeh");
			 System.out.println("2. Oyutan ustgah");
			 System.out.println("3. Oyutan haih");
			 System.out.println("4. Nereer erembeleh");
			 System.out.println("5. Buh oyutniig harah");
			 System.out.println("6. Garah");
			 System.out.println("Songolt:");
			 if (!sc.hasNextInt()) {
				 System.out.println("Too oruulna uu!");
				 sc.next();
				 continue;
			 }
			 int songolt= sc.nextInt();
			 sc.nextLine();
			 switch (songolt) {
			 case 1:
				 System.out.println("ner:");
				 String ner=sc.nextLine();
				 
				 System.out.println("nas:");
				 int nas=sc.nextInt();
				 
				 System.out.println("kod:");
				 String kod=sc.nextLine();
				 
				 manager.oyutannemeh(new Oyutan(ner,nas,kod));
				 break;
			 case 2:
				 System.out.println("\n ---Menu---");
				 manager.oyutanustgah(sc.nextLine());
				 break;
			 case 3:
				 System.out.println("Haih oyutnii kod:");
				 Oyutan o = manager.oyutanhaih(sc.nextLine());
				 if (o!= null) {
					 System.out.println(o);
					 
				 }
				 else {
					 System.out.println("Oyutan oldsngui!");
				 }
				 break;
			 case 4:
				 manager.nereerErembeleh();
				 break;
			 case 5:
				 manager.buhOyutniigharuulah();
				 break;
			 case 6:
				 System.out.println("Bayartai!");
				 sc.close();
				 return;
				 default:
					 System.out.println("Buruu songolt!");
			 }
		 }
	}
}
