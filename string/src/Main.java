public class Main {
    public static void main(String[] args) {

        String mesaj = "Hava mükemmel";
        System.out.println(mesaj);
       /* System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Harika!"));
        System.out.println(mesaj.startsWith("H")); //H ile başladığı için true döndürdü
        System.out.println(mesaj.endsWith("l"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,4,karakterler,0); //0'dan 4'e karakterlerin 0. indexinden itibaren ataa
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//bu karakter kaçını sırada*/

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2,5));

        for (String kelime :mesaj.split(" ")){ //alt alta yazdırdık
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());

    }
}