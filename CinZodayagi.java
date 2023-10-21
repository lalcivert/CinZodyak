package day01;
import java.util.Scanner;
public class CinZodayagi {
    public static void main(String[] args) {

        int dogumYili;

        Scanner input=new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        dogumYili=input.nextInt();

        if(dogumYili%12==0){
            System.out.println("Çin zodyağınız MAYMUN.");
        }else if(dogumYili%12==1){
            System.out.println("Çin zodyağınız HOROZ");
        }else if(dogumYili%12==2){
            System.out.println("Çin zodyağınız KÖPEK");
        }else if(dogumYili%12==3){
            System.out.println("Çin zodyağınız DOMUZ");
        }else if(dogumYili%12==4){
            System.out.println("Çin zodyağınız FARE");
        }else if(dogumYili%12==5){
            System.out.println("Çin zodyağınız ÖKÜZ");
        }else if(dogumYili%12==6){
            System.out.println("Çin zodyağınız KAPLAN");
        }else if(dogumYili%12==7){
            System.out.println("Çin zodyağınız TAVŞAN");
        }else if(dogumYili%12==8){
            System.out.println("Çin zodyağınız EJDERHA");
        }else if(dogumYili%12==9){
            System.out.println("Çin zodyağınız YILAN");
        }else if(dogumYili%12==10){
            System.out.println("Çin zodyağınız AT");
        }else if(dogumYili%12==11){
            System.out.println("Çin zodyağınız KOYUN");
        }
    }
}
