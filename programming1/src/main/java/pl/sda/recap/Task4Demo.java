package pl.sda.recap;

public class Task4Demo {

   public static void main(String[] args){
      Run run = new Run("Marcin", 10);
      Run run1 = new Run("Ewa", 12);

      Thread thread1 = new Thread(run);
      Thread thread2 = new Thread(run1);

      thread1.start();
      thread2.start();
   }

}
