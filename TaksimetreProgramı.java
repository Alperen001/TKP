import java.util.Scanner;

public class TaksimetreProgram� {

	public static void main(String[] args) {
		int mesafe, acilis = 10;
		double tutar, toplam;
		Scanner inp = new Scanner(System.in);
		System.out.println("Ka� KM Yol Gidildi?");
		mesafe = inp.nextInt();
		tutar = mesafe * 2.20;
		toplam = acilis + tutar;
		if (toplam < 20) {
			toplam = 20;
			System.out.println("Toplam �cret: " + toplam);
		}else
			System.out.println("Toplam �cret: " + toplam);

	}

}
