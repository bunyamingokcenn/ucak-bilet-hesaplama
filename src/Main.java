import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km,age, flightType;
        double pricePerKm=0.10, childDiscount=0.5, teenDiscount=0.9, seniorCitizenDiscount=0.7, flightTypeDiscount=0.8, totalPrice=0, discountPrice;
        boolean isError=false;

        Scanner input= new Scanner(System.in);

        System.out.println("Uçak Bileti Hesaplamaya Hoş Geldiniz");

        System.out.print("Lütfen mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        flightType = input.nextInt();

        if ( km>=1 && age>=1 && (flightType==1 || flightType==2)) {

            totalPrice = km * pricePerKm;
            if(age < 12) {
                totalPrice *= childDiscount;
            } else if (age <= 24) {
                totalPrice *= teenDiscount;
            } else if (age > 65) {
                totalPrice *= seniorCitizenDiscount;
            }

            if(flightType == 2){
                totalPrice = (totalPrice*2) * flightTypeDiscount;
            }


        } else {
            isError = true;
        }


        if (isError){
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar: " + totalPrice + " TL");
        }


    }
}