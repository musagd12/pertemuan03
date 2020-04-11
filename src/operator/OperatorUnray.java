package operator;

public class OperatorUnray {

    public static  void main (String[] args){
        int i =0;
        i++;                      //i tadinya 0 ditambahkan 1 sehinggah i = 1
        System.out.println(i);    //betulkan i nilainya 1
        i++;                      //karena i tadinya sudah bernilai 1 makan sekarang ditambahkan lagi 1 menjadi 2
        System.out.println(i);    //tuh betulkan i nilainya 2
        i=i+1;                    //bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);    // i tadi 2 sekarang jadi 3

        //Berlaku juga untuk penambahan angka  lain dan operator arimatika lain
        i+=3; //sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }



}
