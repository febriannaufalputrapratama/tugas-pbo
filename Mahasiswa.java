/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mhs;

/**
 *
 * @author ThinkPad
 */
public class Mahasiswa {
    private String nama;
	private int umur;
	
	public Mahasiswa(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public int getUmur() {
		return umur;
	}
	
	void displayinfo() {
		System.out.println("Nama saya " + getNama() + " umur saya " + getUmur());
	}
	
}

class MahasiswaLama extends Mahasiswa{
	private int angkatan;
	
	 public MahasiswaLama(String nama, int umur, int angkatan) {
	        super(nama, umur);
	        this.angkatan = angkatan;
	 }
	 
	 public void setAngkatan(int angkatan) {
		 this.angkatan = angkatan;
	 }
	 
	 public int getAngkatan() {
	        return angkatan;
	 }

	 @Override
	    void displayinfo() {
	        System.out.println("Nama saya " + this.getNama() + " umur saya " + this.getUmur() +
	                " angkatan saya " + getAngkatan());
	 } 
}

class MahasiswaBaru extends Mahasiswa{
	private int nim;
	
	 public MahasiswaBaru(String nama, int umur, int nim) {
	        super(nama, umur);
	        this.nim = nim;
	 }
	 
	 public void setNim(int nim) {
		 this.nim = nim;
	 }
	 
	 public int getNim() {
	        return nim;
	 }

	 @Override
	    void displayinfo() {
	        System.out.println("Nama saya " + this.getNama() + " umur saya " + this.getUmur() +
	                " nim saya " + getNim());
	 } 
}

 class Main {

    public static void main(String[] args) {

    	Mahasiswa[] mahasiswaArray = new Mahasiswa[3];

        mahasiswaArray[0] = new Mahasiswa("Febrian Naufal", 21);
        mahasiswaArray[1] = new MahasiswaLama("Febrian Naufal", 21, 2020);
        mahasiswaArray[2] = new MahasiswaBaru("febrian naufal", 21, 22166037);

        for (Mahasiswa mhs : mahasiswaArray) {
            mhs.displayinfo();
            System.out.println();
        }
    }
}