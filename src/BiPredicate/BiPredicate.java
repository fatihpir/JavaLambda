package BiPredicate;

/**
 * Created by fatihpir on 23.12.2016.
 */
/*
    İki parametre alır
    Şarta göre true/false döner
 */
public interface BiPredicate<T,U> {
    boolean fonksiyon(T t,U u);
}
class BiPredicateUygulama{
    public static void main(String[] args){
        BiPredicate<Integer,Integer> biPredicate=(sayi1,sayi2)->(sayi1<(sayi2*0.2345));

        boolean deneme1=biPredicate.fonksiyon(16,78);
        boolean deneme2=biPredicate.fonksiyon(56,12);

        System.out.println("Sonuç1: "+deneme1+"\n"+"Sonuç2: "+deneme2);
    }
}
