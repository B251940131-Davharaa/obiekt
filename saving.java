package daagi;
import java.util.Scanner;

public class saving {

	private String ner;
	private String valyut;
	private double jiliinHvv;
	private int hugatsaa;
	private double ehniiUldegdel;

	private double savingsCalcAccrued() {

		double monthlyRate = jiliinHvv / 12;
		double hvv = ehniiUldegdel * monthlyRate * hugatsaa / 100;

		return hvv;
	}

	private double savingCalc() {

		double hvv = savingsCalcAccrued();
		double etsiinUldegdel = ehniiUldegdel + hvv;

		return etsiinUldegdel;
	}

	private void savingsReport() {

		double hvv = savingsCalcAccrued();
		double etsiinUldegdel = savingCalc();

		System.out.println("Hadgalamjiin ner: " + ner);
		System.out.println("Valyut: " + valyut);
		System.out.println("Jiliin Hvv: " + jiliinHvv);
		System.out.println("Hugatsaa Sar: " + hugatsaa);
		System.out.println("Ehnii Uldegdel: " + ehniiUldegdel);
		System.out.println("Tsuglarsan Hvv: " + hvv);
		System.out.println("Etsiin Uldegdel: " + etsiinUldegdel);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		saving s = new saving();

		System.out.print("Hadgalamjiin ner: ");
		s.ner = input.nextLine();

		System.out.print("Valyut: ");
		s.valyut = input.nextLine();

		System.out.print("Jiliin Hvv: ");
		s.jiliinHvv = input.nextDouble();

		System.out.print("Hugatsaa Sar: ");
		s.hugatsaa = input.nextInt();

		System.out.print("Ehnii Uldegdel: ");
		s.ehniiUldegdel = input.nextDouble();

		s.savingsReport();
	}
}