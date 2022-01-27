import java.util.Scanner;

public class CinZodyagiHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dogumYili,kalan=0;
        String zodyak="";


        System.out.print("Dogum Yilinizi giriniz: ");
        dogumYili = input.nextInt();

        if(dogumYili>1800 && dogumYili<2999){
            kalan = dogumYili % 12;

            switch(kalan){
                case 0:
                    zodyak="Maymun";
                    break;
                case 1:
                    zodyak="Horoz";
                    break;
                case 2:
                    zodyak="Kopek";
                    break;
                case 3:
                    zodyak="Domuz";
                    break;
                case 4:
                    zodyak="Fare";
                    break;
                case 5:
                    zodyak="Okuz";
                    break;
                case 6:
                    zodyak="Kaplan";
                    break;
                case 7:
                    zodyak="Tavsan";
                    break;
                case 8:
                    zodyak="Ejderha";
                    break;
                case 9:
                    zodyak="Yilan";
                    break;
                case 10:
                    zodyak="At";
                    break;
                case 11:
                    zodyak="Koyun";
                    break;
            }

            System.out.println("Cin zodyagi burcunuz: " + zodyak);
        }else{
            System.out.println("Tarih hatali,1800-2999 araliginda olmali! Lutfen tekrar deneyin.");
        }


    }
}
