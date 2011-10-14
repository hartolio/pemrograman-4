public class Perpustakaan{
	private String id;
	private String peminjam;
	private String judul;
	private static Integer Jumlah;
	
	public String getJudul(){
		return judul;
	}
	
	public void setJudul(String judul){
		this.judul = judul;
	}
	
	public String getPeminjam(){
		return peminjam;
	}
	public static Integer getJumlah(){
		return Jumlah;
	}
	
	public void setPeminjam(String peminjam){
		this.peminjam = peminjam;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public static void setJumlah(Integer Jumlah){
		Perpustakaan.Jumlah = Jumlah;
	}
}