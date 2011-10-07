public class Person{ /*untuk mendeklarasikan sebuah class dengan nama Person. yang bersifat public, sehingga dapat
di akses dari dalam maupun luar class*/
	private String nama; /*untuk mendeklarasikan suatu variable, tipe data string, dengan nama: nama dan bersifat private sehingga hanya dapat
	diakses dalam class yang bersangkutan*/
	public static void main(String[] args){ /*untuk mendeklarasikan suatu method, dengan nama: main yang akan pertama kali diakses ketika program dijalankan,
	method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun serta bersifat public, sehingga dapat diakses dari dalam maupun luar class*/
		Person test; //untuk mendeklarasikan variable atau property dengan tipe data referensi dari class person
		test = new Person(); /*untuk mendeklarasikan sebuah objek baru, dengan referensi = class person dalam memory suatu objek atau variable referensi test*/
		test.setNama("andi"); //untuk menginisiasikan nilai andi ke dalam objek test dengan menggunakan suatu method bernama setNama
		byte b = 100; //untuk mendeklarasikan suatu variable dengan nama b yang bertipe data = byte dan memiliki nilai 100
		short s = 100; //untuk mendeklarasikan suatu variable dengan nama s yang bertipe data = short dan memiliki nilai 100
		
		Person belajarVariable = test; /*untuk mendeklarasikan suatu objek baru bernama = belajarvariable, dan memasukkan nilai property dari objek test ke dalam
		objek tersebut*/
		belajarVariable.setNama("belajar variable"); /*untuk menginisiasikan nilai belajar variable ke dalam objek belajarvariable 
		dengan menggunakan suatu method bernama setNama*/
		
		System.out.println(b+s); //untuk menampilan output berupa nilai dari variable b dan s yang telah dijumlahkan
		System.out.println("nama : " + test.getNama() + " " + b); /*untuk menampilan output berupa variable nama dengan nilai referensi dari method getNama
		sehingga nilai yang muncul adalah nilai yang terakhir kali berada dimasukkan atau terakhir
		  kali berada dalam memori disertai dengan output dari nilai variable b*/
	}
	public void setNama(String aNama){ /*untuk mendeklarasikan suatu method bernama setNama yang bersifat public 
	sehingga dapat diakses dari luar class dan memiliki argumen berupa data dengan tipe string dalam variable aNama*/
		this.nama = aNama; //untuk memasukkan nilai dari aNama ke dalam variable nama
	}
	public String getNama(){ /*untuk mendeklarasikan suatu method bernama = getNama, bersifat public 
	sehingga dapat diakses dari luar class yang berfungsi mengembalikan nilai dari variable nama dari dalam memori*/
		return this.nama;
	}
}
