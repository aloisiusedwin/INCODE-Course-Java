public class Fungsi {
    // Fungsi / Method
    // adalah sebutan untuk fungsi yang mengembalikan nilai.

    // tipe data yang mengembalikan nilai (return):
    // semua tipe data primitif(byte, short, long, dll)

    // tipe data yang tidak mengembalikan nilai (non-return):
    // void
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int jumlah1 = penjumlahan(a, b);

        a = 2;
        b = 3;
        int jumlah2 = penjumlahan(a, b);

        // kode yang banyak berulang = code bloated

        print("" + jumlah1);
        print(String.valueOf(jumlah2));
        print("Halo nama saya adalah linux");
        print("L segitiga dengan a=4 dan t=6 : " + hitungLuasSegitiga(8,2));
        print("L lingkaran dengan r=7 : " + hitungLuasLingkaran(7));

        printMenu();
    }

    static int penjumlahan(int angka1, int angka2) {
        int total = angka1 + angka2;
        return total;
    }

    int pengurangan(int angka1, int angka2) {
        int total = 0;
        total = angka1 - angka2;
        return total;
    }

    static void print(String message) {
        System.out.println(message);
    }

    static float hitungLuasSegitiga(int a, int t) {
        return (a * t) / 2f;
    }

    static float hitungLuasLingkaran(float r) {
        // phi*r^2
        return (22f/7f) * (r * r);
    }

    static void printMenu() {
        print("=====LINUX APARTMENT=====");
        print("1. Booking kamar");
        System.out.println("2. Check In");
        System.out.println("3. Check Out");
        System.out.println("4. Keluar");
        System.out.println("Pilih: ");
    }
}
