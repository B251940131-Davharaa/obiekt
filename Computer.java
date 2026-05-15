package lab8;
import java.util.Scanner;

public class Computer {
	private Processor processor;
	private Memory memory;
	private DisplayCard displayCard;
	private SoundCard soundCard;
	
	public Computer() {
		Scanner sc = new Scanner(System.in);
        System.out.println("--- CPU-ийн мэдээлэл оруулна уу ---");
        System.out.print("Brand: "); 
        String pBrand = sc.nextLine();
        System.out.print("Cores: "); 
        int cores = sc.nextInt();
        System.out.print("Speed (GHz): "); 
        double speed = sc.nextDouble();
        System.out.print("Cache (MB): "); 
        int cache = sc.nextInt();
        sc.nextLine(); 
        processor = new Processor(pBrand, cores, speed, cache);

        System.out.println("\n--- RAM-ийн мэдээлэл оруулна уу ---");
        System.out.print("Size (GB): "); 
        int mSize = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Type: "); 
        String mType = sc.nextLine();
        System.out.print("Speed (MHz): "); 
        int mSpeed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Brand: "); 
        String mBrand = sc.nextLine();
        memory = new Memory(mSize, mType, mSpeed, mBrand);

        System.out.println("\n--- GPU-ийн мэдээлэл оруулна уу ---");
        System.out.print("Memory (GB): "); 
        int gMem = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Chipset: ");
String gChip = sc.nextLine();
        System.out.print("Brand: "); 
        String gBrand = sc.nextLine();
        System.out.print("Clock Speed (MHz): "); 
        int gClock = sc.nextInt();
        sc.nextLine(); 
        displayCard = new DisplayCard(gMem, gChip, gBrand, gClock);

        System.out.println("\n--- Sound Card-ийн мэдээлэл оруулна уу ---");
        System.out.print("Channels: "); 
        String sChan = sc.nextLine();
        System.out.print("Sample Rate (kHz): "); 
        int sRate = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Brand: "); 
        String sBrand = sc.nextLine();
        System.out.print("Interface: "); 
        String sInt = sc.nextLine();
        soundCard = new SoundCard(sChan, sRate, sBrand, sInt);
        sc.close();
	}
	
	public void showInfo() {
        System.out.println("\n===============================");
        System.out.println("COMPUTER SPECIFICATIONS:");
        System.out.println("===============================");
        processor.printInfo();
        memory.printInfo();
        displayCard.printInfo();
        soundCard.printInfo();
	}
}
