package math;

/**
 * Created by fatihpir on 23.12.2016.
 */
public class MatUygulama {

    interface mat {
        int islem(int a, int b);
    }

    interface string {
        void mesaj(String mesaj);
    }

    private int operate(int a, int b, mat islemi){
        return islemi.islem(a, b);
    }
    public static void main(String args[]){
        MatUygulama matUygulama=new MatUygulama();

        mat toplama = (int sayi1,int sayi2) ->sayi1+sayi2;

        mat cikar =(int sayi1,int sayi2) ->sayi1-sayi2;

        mat carp = (int sayi1,int sayi2) ->{return sayi1*sayi2;};

        mat bol = (int sayi1,int sayi2) -> sayi1/sayi2;

        string fonksiyon1 = message -> System.out.println("Merhaba "+message);

        System.out.println("19+05=" + matUygulama.operate(19,05,toplama));
        System.out.println("19-05=" + matUygulama.operate(19,05,cikar));
        System.out.println("19*05=" + matUygulama.operate(19,05,carp));
        System.out.println("1900/5="+ matUygulama.operate(1900,5,bol));

        fonksiyon1.mesaj("ATBank");
    }
}
