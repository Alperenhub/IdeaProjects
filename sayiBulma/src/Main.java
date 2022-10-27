public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 41;

        boolean isTrue = false;

        for(int sayi : sayilar){
            if(sayi==aranacak){
                isTrue=true;
                break;
            }
        }
        if(isTrue){
            System.out.println("Sayi mevcuttur");
        }else {
            System.out.println("Sayi mevcut değildir");
        }

    }
}