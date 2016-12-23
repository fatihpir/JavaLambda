package BinaryOperator;

import BiFunction.BiFunction;


/**
 * Created by fatihpir on 23.12.2016.
 */

/*
    BiFunction Türünde.
    T,U,R aynı tipte ise kullanılır
 */
public interface BinaryOperator<T> extends BiFunction<T,T,T> {
}
class BinaryOperatorUygulama{
    public static void main(String[] args){
        BinaryOperator<Integer> binaryOperator = (sayi1,sayi2) ->(sayi1*sayi2);
        Integer sonuc = binaryOperator.fonksiyon(23,89);

        System.out.println(sonuc);
    }
}
