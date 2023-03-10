import java.util.Scanner;

public class kalkulatorPajak {
	public static void main(String[] args) {
		
		double gajiBersih, ptkp, persenPajak, pkp, golPkp, pph;
		int tanggung, golongan, tambahTanggung;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Gaji Bersih Selama Setahun?");
		gajiBersih = scnr.nextDouble();
		
		// Mencari PTKP 
		
		System.out.println("Status anda 1) Lajang 2) Menikah");
		golongan = scnr.nextInt();
		    if (golongan == 1){
		        System.out.println("Apakah anda memiliki tanggungan keluarga sedarah? *Maks 3 orang");
		        tanggung = scnr.nextInt();
		            tambahTanggung = tanggung * 4500000;
		        
		        ptkp = 54000000 + tambahTanggung;
		    } else {
		        System.out.println("Apakah anda memiliki tanggungan keluarga ? *Maks 3 orang");
		        tanggung = scnr.nextInt();
		            tambahTanggung = tanggung * 4500000;
		        ptkp = 58500000 + tambahTanggung;
		    }
		// sudah mendapatkan nilai ptkp
		
		System.out.println("Karena nilai PTKP anda adalah sebesar : " + ptkp );
		pkp = gajiBersih - ptkp;
		    
		    if (pkp < 50000000){
		        persenPajak = 0.05;
		        
		        } else if (pkp < 250000000){
		            persenPajak = 0.15;
		            		            
		            } else if (pkp < 500000000){
		                persenPajak = 0.25;     
		                } else
		                    persenPajak = 0.50;
		                    
        pph = pkp * persenPajak;
        

        System.out.println(" Maka pajak yang harus anda bayar setiap tahun nya adalah sebesar Rp." + pph);                
	}
}

