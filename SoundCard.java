package lab8;

public class SoundCard {
	private String channels;
	private int sampleRate;
	private String brand;
	private String interfaceType;
	
	public SoundCard(String channels, int sampleRate, String brand, String interfaceType) {
		this.channels = channels;
		this.brand = brand;
		this.sampleRate = sampleRate;
		this.interfaceType = interfaceType;
	}
	
	public void printInfo() {
        System.out.println("---Sound Card---");
        System.out.println("Channels: " + channels);
        System.out.println("Sample Rate: " + sampleRate + " kHz");
        System.out.println("Brand: " + brand);
        System.out.println("Interface: " + interfaceType);
	}
}
