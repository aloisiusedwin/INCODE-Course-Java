public class OverloadFungsi {
    // Overloading
    // Nama fungsinya sama tapi parameternya berbeda

    public static void main(String[] args) {
        print("Halo nama saya Linux");
        print("Halo nama saya Linux", true);
        print();
        print(new String[]{"Jojo, Linux, Metiw"});
    }

    static void print(String message) {
        System.out.println(message);
    }

    // error karena fungsi print dengan parameter bertipe data String sudah ada
//    static void print(String a) {
//        System.out.println(a);
//    }

    static void print(String message, boolean tampil) {
        if(tampil) {
            print(message);
        }
    }

    static void print() {
        print("Halo nama saya Udin");
    }

    static void print(String[] animals) {
        for (String animal : animals) {
            System.out.print(animal);
        }
        System.out.println();
    }
}
