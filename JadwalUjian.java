import java.util.Scanner;
public class JadwalUjian {
    public static void main(String[] args) {
        System.out.println("==========JADWAL UJIAN AKHIR SEMESTER 1 PTI-A 2022=============");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Hari ");
        String hari = input.nextLine();
        System.out.print("Minggu ke- ");
        String m= input.next();
        
        String [][] ruangKuliah =  {
                                    {"Pendidikan Agama Islam", "F4.6"},
                                    {"Filsafat", "G1.2"},
                                    {"Perkembangan Peserta Didik", "G1.6"},
                                    {"Arsitektur dan Organisasi Komputer", "F4.2"},
                                    {"Pemrograma Dasara", "F4.7"},
                                    {"Pengantar Keilmuan Komputer","F2.1"},
                                    {"Bahasa Inggris","F3.12"}
                                   };
        
        if ("senin".equals(hari) && "1".equals(m)){
            System.out.println("Mata Kuliah \t: "+ ruangKuliah[0][0]);
            System.out.println("Ruangan \t: " + ruangKuliah[0][1]);
        }
        else if ("selasa".equals(hari) && "1".equals(m)){
             System.out.println("Mata Kuliah \t: "+ ruangKuliah[1][0]);
             System.out.println("Ruangan \t: " + ruangKuliah[1][1]);    
        }
        else if ("rabu".equals(hari) && "1".equals(m)){
             System.out.println("Mata Kuliah \t: "+ ruangKuliah[2][0]);
             System.out.println("Ruangan \t: " + ruangKuliah[2][1]);
        } 
        else if ("senin".equals(hari) && "2".equals(m)){
             System.out.println("Mata Kuliah \t: "+ ruangKuliah[3][0]);
             System.out.println("Ruangan \t: " + ruangKuliah[3][1]);
        }
        else if ("rabu".equals(hari) && "2".equals(m)){
             System.out.println("Mata Kuliah \t: "+ ruangKuliah[4][0]);
             System.out.println("Ruangan \t: " + ruangKuliah[4][1]);
        }
        else if ("kamist".equals(hari) && "2".equals(m)){
             System.out.println("Mata Kuliah \t: "+ ruangKuliah[5][0]);
             System.out.println("Ruang \t: " + ruangKuliah[5][1]);
        }
        else if ("jum'at".equals(hari) && "2".equals(m)){
             System.out.println("Mata Kuliah \t: "+ ruangKuliah[6][0]);
             System.out.println("Ruangan \t: " + ruangKuliah[6][1]);
        }
        else {
            System.out.println("Yeayyyy Liburrrr");
        }  
   }
 }

