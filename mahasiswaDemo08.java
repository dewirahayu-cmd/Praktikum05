public class mahasiswaDemo08 {
    public static void main(String[] args) {

        mahasiswaBerprestasi08 list = new mahasiswaBerprestasi08();

        mahasiswa08 m1 = new mahasiswa08("123", "Dewi", "2A", 3.9);
        mahasiswa08 m2 = new mahasiswa08("124", "Muji", "2A", 3.9);
        mahasiswa08 m3 = new mahasiswa08("125", "Rahayu", "2A", 4.0);
        mahasiswa08 m4 = new mahasiswa08("126", "Sita", "2A", 3.9);
        mahasiswa08 m5 = new mahasiswa08("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting (DESC IPK):");
        list.bubbleSort();
        list.tampil();
    }
}
