public class Latihan2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 5;
        
        String max="";
        max = (a>=b)?""+a:(b>=c)?""+b:""+c;
            System.out.println("Mencari Nilai Terbesar");
            System.out.println("number 1 = "+a);
            System.out.println("number 2 = "+b);
            System.out.println("number 3 = "+c);
            System.out.println("Nilai tertingginya adalah angka = "+max);
            
    }
}