public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Pekiyi");
                break;
            case 'B':
                System.out.println("İyi");
                break;
            case 'C':
                System.out.println("Orta");
                break;
            case 'D':
                System.out.println("Şartlı");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}