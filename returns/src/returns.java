import java.util.Scanner;
public class returns {
    public static void main(String[] args) {
        int fzk,kim,mat,muz,trk,tar;
        Scanner inx = new Scanner(System.in);
        System.out.print("fizik notunuzu giriniz:");
        fzk = inx.nextInt();
        System.out.print("kimya notunuzu giriniz:");
        kim = inx.nextInt();
        System.out.print("matetmatik notunuzu giriniz:");
        mat = inx.nextInt();
        System.out.print("müzik notunuzu giriniz:");
        muz = inx.nextInt();
        System.out.print("türkçe notunuzu giriniz:");
        trk= inx.nextInt();
        System.out.print("tarih notunuzu giriniz:");
        tar = inx.nextInt();
        int total = (fzk + tar + kim +mat +muz +trk);
        double ort= (total/6.0);
        System.out.print("Ortalamanız:"+ort);
        String zeus = ort >=60 ? " :Geçtiniz":" :KALDINIZ";
        System.out.println(zeus);
    }

}
