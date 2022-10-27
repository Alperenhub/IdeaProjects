public class Main {
    public static void main(String[] args) {

        int number=21;
        int remainder=0;

        for (int i=2;i<number;i++){
            remainder = number*number%i;
            if(remainder ==0){
                break;
            }

        }
        if (remainder==0){
            System.out.println("Asal değil");
        }
        else {
            System.out.println("Asal");
        }
    }
}