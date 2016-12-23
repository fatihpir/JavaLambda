package Predicate;/**
 * Created by fatihpir on 23.12.2016.
 */

/*
    Şarta bağlı true/false döner
 */
public interface Predicate<T> {
    boolean fonksiyon(T t);
}
class PredicateUygulama{
    public static void main(String[] args){
        Predicate<Integer> predicate = sayi->(sayi%2==0);
        boolean deneme=predicate.fonksiyon(23);
        boolean deneme2=predicate.fonksiyon(120);

        System.out.println("Sonuç1: "+deneme+"\n"+"Sonuç2: "+deneme2);
    }
}
