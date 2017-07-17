import java.util.Scanner;

public class TugasUas {

    
    public static void main(String[] args) {
      String nama,merk;
      Tugas mobil = new Tugas();
      System.out.println("Toyota      ");
      System.out.println("Avanza      ");
      System.out.println("Mitshubisi  ");
     
      Scanner input = new Scanner(System.in);
      System.out.print("Nama Pembeli = ");
      nama = input.nextLine();
      mobil.setNamaPembeli(nama);
      
      System.out.print("merk mobil = ");
      merk = input.nextLine();
      System.out.println("-------------------");
       System.out.println("Nama Pembeli adalah "+mobil.getNamaPembeli());
       if("toyota".equals(merk)) {
           System.out.println(mobil.getToyota());
           
       }
       else if ("Avanza".equals(merk)) {
           System.out.println(mobil.getAvanza());
           
       }
       else {
           System.out.println(mobil.getMitshubisi());
       }
    }
}
