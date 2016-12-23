package parametre;/**
 * Created by fatihpir on 23.12.2016.
 */
public interface Parametre {
    public int fonksiyon(int sayi1,int sayi2);
}
class ParametreUygulama {
    public int fonksiyon2(int sayi1, int sayi2, Parametre parametre){
        return parametre.fonksiyon(sayi1,sayi2)*10;
    }

    public static void main(String[] args){
        ParametreUygulama parametreUygulama = new ParametreUygulama();
        parametreUygulama.fonksiyon2(10,5,((sayi1, sayi2) -> sayi1+sayi2));

        //System.out.println(parametreUygulama.fonksiyon2(10,5,((sayi1, sayi2) -> sayi1+sayi2)););


    }
}
