package lb9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Clock c = new Clock();

        System.out.println("===== CLOCK SYSTEM =====");

        
        System.out.println("1. Manual Set Clock");
        System.out.println("2. Auto Set Clock");
        System.out.print("Choose: ");

        int choice = sc.nextInt();

        if (choice == 1) {

            int y, mon, d, h, min, s;

            System.out.print("Year: ");
            y = sc.nextInt();

            System.out.print("Month: ");
            mon = sc.nextInt();

            System.out.print("Day: ");
            d = sc.nextInt();

            System.out.print("Hour: ");
            h = sc.nextInt();

            System.out.print("Minute: ");
            min = sc.nextInt();

            System.out.print("Second: ");
            s = sc.nextInt();

            c.setClock(y, mon, d, h, min, s);

        } else {

            c.autoSetClock();
        }

        
        System.out.println("\n1. Run 1000 seconds");
        System.out.println("2. Run custom seconds");
        System.out.print("Choose: ");

        int tickChoice = sc.nextInt();

        if (tickChoice == 1) {

            c.tickClock();

        } else {

            System.out.print("Enter tick seconds: ");
            int tick = sc.nextInt();

            c.tickClock(tick);
        }

        sc.close();
    }
}