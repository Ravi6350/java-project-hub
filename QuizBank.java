import java.util.Scanner;

public class QuizBank {
   public QuizBank() {

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = 0;
      System.out.println("Welcome to the QuizBank!");
      System.out.println("1) What is the capital of India?");
      System.out.println("a) Mumbai\nb) Delhi\nc) Kolkata\nd) Chennai");
      String var3 = var1.nextLine();
      if (var3.equalsIgnoreCase("b")) {
         ++var2;
      }

      System.out.println("2) Which planet is known as the Red Planet?");
      System.out.println("a) Earth\nb) Venus\nc) Mars\nd) Jupiter");
      String var4 = var1.nextLine();
      if (var4.equalsIgnoreCase("c")) {
         ++var2;
      }

      System.out.println("3) Who wrote 'Ramayana'?");
      System.out.println("a) Valmiki\nb) Tulsidas\nc) Ved Vyasa\nd) Kalidas");
      String var5 = var1.nextLine();
      if (var5.equalsIgnoreCase("a")) {
         ++var2;
      }

      System.out.println("4) Where is the 'Taj Mahal located'?");
      System.out.println("a) agara\nb) Ayodhya\nc) Lucknow \nd) delhi");
      String var6 = var1.nextLine();
      if (var6.equalsIgnoreCase("a")) {
         ++var2;
      }

      System.out.println("Your Score: " + var2 + "/4");
      var1.close();
   }
}
