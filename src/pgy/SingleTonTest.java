package pgy;

public class SingleTonTest {

   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         SingleTon s = SingleTon.getInstance();
         System.out.println(i + " : " + s.hashCode());
      }
      
   }

}
