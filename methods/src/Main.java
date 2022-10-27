public class Main {
    public static void main(String[] args) {
    sayiBulmaca();
    mesajVer("alpi");

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,5,7,9,0};
        int aranacak = 6;
        boolean isTrue= false;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                isTrue= true;
                break;
            }
        }
        if (isTrue){
            System.out.println("Sayı mevcuttur"+aranacak);
        }
        else {
            System.out.println("Sayı mevcut değildir");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}