import java.util.Scanner;

public class App{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nama: ");
		String name = input.nextLine();
		System.out.print("Masukkan NIM: ");
		String nim = input.nextLine();
		System.out.print("Masukkan KELAS: ");
		String kelas = input.nextLine();
		
		System.out.println("-------------------");
		System.out.println("Nama : " + name);
		System.out.println("NIM : " + nim);
		System.out.println("KELAS : " + kelas);
		
	}
}
