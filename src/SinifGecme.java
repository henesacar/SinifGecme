import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fiz, trk, kim, muz;
        Scanner scn = new Scanner(System.in);
        System.out.print("Matematik notunuzu girin: ");
        mat = scn.nextInt();
        if (mat == 0|| mat>= 100){
            mat=0;
        }
        System.out.print("Fizik notunuzu girin: ");
        fiz = scn.nextInt();
        if(fiz == 0 || fiz >= 100 ){
            fiz=0;
        }
        System.out.print("Kimya notunuzu girin: ");
        kim = scn.nextInt();
        if(kim == 0 || kim >= 100 ){
            kim=0;
        }
        System.out.print("Türkçe notunuzu girin: ");
        trk = scn.nextInt();
        if(trk == 0 || trk >= 100 ){
            trk=0;
        }
        System.out.print("Müzik notunuzu girin: ");
        muz = scn.nextInt();
        if(muz == 0 || muz >= 100 ){
            muz=0;
        }
        int ortalama = (mat+fiz+kim+trk+muz)/5;
        if(ortalama>=55){
            System.out.println("Sınıfı geçtiniz. \nNotunuz: "+ortalama);

        }else{
            System.out.println("Sınıfta kaldınız.\nNotunuz: "+ortalama);
        }
    }
}
