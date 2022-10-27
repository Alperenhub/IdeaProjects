public class Main {
    public static void main(String[] args) {

        //6 1,2,3 mükemmel sayı

        int sayi = 10;
        int total =0;

        for (int i=1;i<sayi;i++){
            if(sayi% i ==0){
                total=total+i;
            }
        }
        if(total == sayi){
            System.out.println("Müko sayidir");
        }else{
            System.out.println("Müko sayi değildir");
        }

    }
}