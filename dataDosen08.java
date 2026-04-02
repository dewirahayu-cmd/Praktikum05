public class dataDosen08 {
    dosen08[] dataDosen = new dosen08[10];
    int idx;

    void tambah(dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("------------------------------");
        }
    }

    // Sorting ASC berdasarkan usia - Bubble Sort (termuda ke tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    dosen08 tmp        = dataDosen[j];
                    dataDosen[j]       = dataDosen[j - 1];
                    dataDosen[j - 1]   = tmp;
                }
            }
        }
    }

    // Sorting DSC berdasarkan usia - Selection Sort (tertua ke termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            dosen08 tmp         = dataDosen[idxMax];
            dataDosen[idxMax]   = dataDosen[i];
            dataDosen[i]        = tmp;
        }
    }

    // Insertion Sort ASC berdasarkan usia
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            dosen08 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}