public class Person{ /*untuk mendeklarasikan sebuah class dengan nama = Person dan bersifat public sehingga dapat diakses dari dalam maupun luar class*/
	public static void main(String[] args){ /*untuk mendeklarasikan suatu method bernama = main yang akan pertama diakses ketika program dieksekusi,
	method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun dan dapat diakses dari dalam maupun luar karena bersifat public*/
		int a; //untuk mendeklarasikan suatu variable dengan nama a dengan tipe data integer
		a = 1000; //untuk memasukkan nulai 1000 ke dalam variable a
		int b = 1000; //untuk mendeklarasikan suatu variable bernama = b, tipe data = integer dan bernilai 1000
		
		System.out.println("a = " + a); //untuk menampilan output berupa nilai dari variable a dalam satu baris
		System.out.println("b = " + b); //untuk menampilan output berupa nilai dari variable b dalam satu baris
		System.out.println("a + b = " + (a+b)); //untuk menampilan output berupa nilai dari variable a dan b yang telah dijumlahkan
	}
}
