public class Variable
{

   public static void main(String[] args)
   {
      //Her kan vi skrive variable
      int x;
      x = 42;
      System.out.println(x);
      
      x = x - 10;
      System.out.println(x);
      
      double y;
      y = 42;
      System.out.println("y er " + y);
      
      y = y * 1.1;
      System.out.println("y er " + y);
      
      boolean isHappy;
      isHappy = true;
      System.out.println(isHappy);
      
      String s;
      s = "Hej med dig! Fredagsbar kl. 14.";
      System.out.println(s);
      
      firkant();
      firkant();
      firkant();
      firkant();
      firkant();
      firkant();
      
   }
   
   public static void firkant()
   {
      double a;
      a = 1.0;
      double b = 1.0;
      double areal;
      areal = a * b;
      System.out.println("arealet er " + areal);
   }

}