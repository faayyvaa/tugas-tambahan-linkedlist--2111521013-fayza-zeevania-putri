import java.util.LinkedList;

public class linkedlist2 {
    public static void main (String[] args) throws Exception
    { 
        LinkedList <Integer> nim = new LinkedList<>();
        LinkedList <String> nama = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();

        //data awal (nim,nama,alamat mahasiswa)
        System.out.println("DATA AWAL ");
        nim.add(2111521013);
        nama.add("Fayza Zeevania Putri");
        alamat.add("Lubuk Buaya");

        System.out.println("nomor BP = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);

        System.out.println("size nim = " + nim.size());
        System.out.println("size nama = " + nama.size());
        System.out.println("size alamat = " + alamat.size());

        //add()
        System.out.println(" ");
        System.out.println("------PENAMBAHAN MAHASISWA BP GANJIL------");

        nim.add(2011522041);
        nim.add(2011521007);
        nim.add(1911522333);
        nim.addFirst(2111523033);
        nim.addLast(2111521203);
    
        nama.addFirst("Kariimah Qurrata");
        nama.add("Reybong");
        nama.add("Farhan");
        nama.add("Siti Ainul");
        nama.addLast("Siti Farraz");

        alamat.add("Jl. Khayal");
        alamat.add("Taplau");
        alamat.add("Pasa Baru Dalam");
        alamat.addFirst("Lubuk Minturun");
        alamat.addLast("Air Dingin");

        // hasil dari manipulasi penambahan data
        System.out.println("nomor BP =" + nim );
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);

        System.out.println("size nim = " + nim.size());
        System.out.println("size nama = " + nama.size());
        System.out.println("size alamat = " + alamat.size());

        //set()
        System.out.println(" ");
        System.out.println("------MENYISIPKAN DATA MAHASISWA GENAP------");

        nim.set(2,2111521002);//menyisipkan data kosong
        nim.set(5,2111521004);

        nama.set(2,"Azka"); //menyisipkan data kosong
        nama.set(5,"Adi Juanda");

        alamat.set(2,"Azka"); //menyisipkan data kosong
        alamat.set(5,"Muara Labuh");

        //hasil dari manipulasi penyisipan data
        System.out.println("nomor BP = " + nim);
        System.out.println("Nama = "+ nama );
        System.out.println("Alamat = " + alamat);

        System.out.println("size nim = " + nim.size());
        System.out.println("size nama = " + nama.size());
        System.out.println("size alamat = " + alamat.size());

        //remove()
        System.out.println(" ");
        System.out.println("------MENGHAPUS BEBERAPA DATA MAHASISWA------");

        nim.remove(2);
        nim.remove(1);
        nim.remove(0);

        nama.remove(0);
        nama.remove(2);
        nama.remove(0);

        alamat.remove(0);
        alamat.remove(1);
        alamat.remove(0);
        //hasil setelah manipulasi penghapusan beberapa data
        System.out.println("nomor BP = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);

        System.out.println("size nim = " + nim.size());
        System.out.println("size nama = " + nama.size());
        System.out.println("size alamat = " + alamat.size());

        //pop and push
        System.out.println(" ");
        System.out.println("------POP AND PUSH DATA MAHASISWA------");

        System.out.println("\t'POP'\t");

        nim.pop();
        nama.pop();
        alamat.pop();

        System.out.println("nomor BP = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);

        System.out.println("size nim = " + nim.size());
        System.out.println("size nama = " + nama.size());
        System.out.println("size alamat = " + alamat.size());

        System.out.println("\t'PUSH'\t");

        nim.push(2111521010);
        nama.push("Shabira Lala");
        alamat.push("Pekanbaru");

        System.out.println("nomor BP =\t" + nim);
        System.out.println("Nama =\t" + nama);
        System.out.println("Alamat =\t" + alamat);

        System.out.println("size nim = \t" + nim.size());
        System.out.println("size nama = \t" + nama.size());
        System.out.println("size alamat = \t" + alamat.size());

        //get()
        System.out.println(" ");
        System.out.println("------PENCARIAN INDEKS KE-1 PADA DATA MAHASISWA------");
        System.out.println("Nim index ke 1 --> "+nim.get(1));
        System.out.println("Nama index ke 1 --> "+nama.get(1));
        System.out.println("Alamat index ke 1 --> "+alamat.get(1));


        //indexOf()
        System.out.println(" ");
        System.out.println("------PENCARIAN DATA------");
        System.out.println("Apakah nim 2111521013 terdapat pada data?");
        System.out.println(nim.indexOf(2111521013) + " (tidak)");
        System.out.println("Apakah terdapat mahasiswa yang berdomisili Padang");
        System.out.println(alamat.indexOf("Pasa Baru Dalam") + " (Pasa Baru Dalam)");

        System.out.println(" ");
        System.out.println("===SELESAI===");


    }

    
}
