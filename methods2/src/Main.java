public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        int sayi = topla();
        int toplam = topla2(1,2,3,4,5,6);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");

    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static int topla(){
     return 5;
    }
}