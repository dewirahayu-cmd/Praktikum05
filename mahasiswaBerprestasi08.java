public class mahasiswaBerprestasi08 {
    mahasiswa08[] listMhs = new mahasiswa08[5];
    int idx;

    void tambah(mahasiswa08 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (mahasiswa08 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }

// Bubble Sort - DESC berdasarkan IPK
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    mahasiswa08 tmp = listMhs[j];
                    listMhs[j]      = listMhs[j - 1];
                    listMhs[j - 1]  = tmp;
                }
            }
        }
    }
 
    // Selection Sort - ASC berdasarkan IPK
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            mahasiswa08 tmp   = listMhs[idxMin];
            listMhs[idxMin]   = listMhs[i];
            listMhs[i]        = tmp;
        } 
    }

     // Insertion Sort - ASC berdasarkan IPK
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa08 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }


  // Insertion Sort - DESC berdasarkan IPK (Jawaban 5.4.3)
    void insertionSortDesc() {
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa08 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

        // Sequential Searching 
        int sequentialSearching (double cari) {
            int posisi = -1;
            for (int j = 0; j < listMhs.length; j++) {
                if (listMhs [j].ipk == cari) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        void tampilPoisi (double x, int pos) {
            if (pos != -1) {
                System.out.println("data mahasiswa dengan IPK :" + x + " ditemukkan pada indeks " +pos );
            }
            else {
                System.out.println("data " + x + "tidak ditemukan");
            }   
            }

        void tampilDataSearch (double x, int pos) {
            if (pos != -1) {
                System.out.println("nim/t : " + listMhs [pos].nim);
                System.out.println("nama/t : " + listMhs [pos].nama);
                System.out.println("kelas/t : " +listMhs [pos].kelas);
                System.out.println("ipk/t : " +x);
            } 
            else {
                System.out.println("Data mahasiswa dengan IPK " + x + "tidak ditemukkan");
            }
        }

        int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
        mid = (left+right)/2;
        if (cari == listMhs[mid].ipk){
        return (mid);
        }

        else if (listMhs [mid].ipk > cari){
        return findBinarySearch(cari, left, mid-1);
        }

        else {
        return findBinarySearch(cari, mid+1, right);

        }

    }
    return -1;
}
}
 