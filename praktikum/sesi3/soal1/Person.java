public class Person{ /*untuk mendeklarasikan sebuah class dengan nama Person. yang bersifat public, sehingga dapat
di akses dari dalam maupun luar class*/
	public static void main(String[] args){/*mendeklarasikan suatu method bernama main yang diakses pertama kali ketika program dijalankan.
	method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun dan dapat diakses dari dalam maupun luar*/
		int value = 10; //mendeklarasikan variable value dengan tipe data integer dengan nilai 10
		char x; //mendeklarasikan variable x dengan tipe data character
		x = 'A'; //meberikan nilai A ke dalam variable x
		
		System.out.println(value); //menampilan output dalam satu baris line dari nilai variable value
		System.out.println("The value of x= " + x);//menampilakan ouput berupa tulisan dan disertai nilai dari variable x
	}
}
