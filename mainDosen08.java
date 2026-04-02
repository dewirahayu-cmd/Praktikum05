import java.util.Scanner;

public class mainDosen08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        dataDosen08 dd = new dataDosen08();
        int pilihan;

        do {
            System.out.println("\n MENU DATA DOSEN");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - termuda ke tertua)");
            System.out.println("4. Sorting DSC (Selection Sort - tertua ke termuda)");
            System.out.println("5. Insertion Sort (ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen        : "); String kode = sc.nextLine();
                    System.out.print("Nama Dosen        : "); String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): "); String jkStr = sc.nextLine();
                    boolean jk = jkStr.equalsIgnoreCase("L");
                    System.out.print("Usia              : "); int usia = sc.nextInt();
                    sc.nextLine();
                    dd.tambah(new dosen08(kode, nama, jk, usia));
                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    dd.tampil();
                    break;

                case 3:
                    dd.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC (termuda ke tertua):");
                    dd.tampil();
                    break;

                case 4:
                    dd.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC (tertua ke termuda):");
                    dd.tampil();
                    break;

                case 5:
                    dd.insertionSort();
                    System.out.println("Data berhasil diurutkan dengan Insertion Sort (ASC):");
                    dd.tampil();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}