import java.util.Scanner;
public class CalculatorMain {

	public static void main (String[] args) {
		double operan1, operan2;
		Calculator cal = new CalculatorZha ();
		
		Scanner input = new Scanner(System.in);
		operan1 = input.nextDouble ();
		operan2 = input.nextDouble ();
		
		System.out.println("Hasil pertambahan adalah : " + cal.hasilTambah(operan1, operan2));
		System.out.println("Hasil pengurangan adalah : " + cal.hasilKurang(operan1, operan2));
		System.out.println("Hasil perkalian adalah : " + cal.hasilKali(operan1, operan2));
		System.out.println("Hasil pembagian adalah : " + cal.hasilBagi(operan1, operan2));
	}
}