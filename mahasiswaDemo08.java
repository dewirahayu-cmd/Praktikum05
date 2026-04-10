import java.util.Scanner;
public class mahasiswaDemo08 {
    public static void main(String[] args) {
        
        // mahasiswaBerprestasi08 list = new mahasiswaBerprestasi08();
          Scanner sc = new Scanner(System.in);
        //   int jumMhs = 5;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(sc.nextLine());
        mahasiswaBerprestasi08 list = new mahasiswaBerprestasi08(jumMhs);

        // mahasiswaBerprestasi08 list = new mahasiswaBerprestasi08();
        
        // mahasiswa08 m1 = new mahasiswa08("123", "Dewi", "2A", 3.9);
        // mahasiswa08 m2 = new mahasiswa08("124", "Muji", "2A", 3.9);
        // mahasiswa08 m3 = new mahasiswa08("125", "Rahayu", "2A", 4.0);
        // mahasiswa08 m4 = new mahasiswa08("126", "Sita", "2A", 3.9);
        // mahasiswa08 m5 = new mahasiswa08("127", "Miki", "2A", 3.7);
        
        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

          
           for (int i = 0; i < jumMhs; i++) {
              System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
              System.out.print("NIM   : ");
              String nim = sc.nextLine();
              System.out.print("Nama  : ");
              String nama = sc.nextLine();
              System.out.print("Kelas : ");
              String kelas = sc.nextLine();
              System.out.print("IPK   : ");
              String ip = sc.nextLine();
              Double ipk = Double.parseDouble(ip);
              System.out.println("--------------------------------");
              list.tambah(new mahasiswa08(nim, nama, kelas, ipk));
          }
   
          list.tampil();

        //  // Bubble Sort DESC
        // System.out.println("Data mahasiswa sebelum sorting:");
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        // list.bubbleSort();
        // list.tampil();

        //  // Selection Sort ASC
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // // Insertion Sort ASC
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();

        // // Insertion Sort DESC
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        // list.insertionSortDesc();
        // list.tampil();

        // Sequential Searching
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
 
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPoisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("------------------------------------------------");
        System.out.println("menggunakkan binary search");
        System.out.println("------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs -1);
        int pss2= (int)posisi2;
        list.tampilPoisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
 
        sc.close();
    }
}
    
