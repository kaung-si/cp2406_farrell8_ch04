// This program assigns values to two variables
// and performs mathematical operations with them
public class FixDebugFour1
{
   public static void main(String[] args) // Error cause: incorrect method name.
   {
      int x = 5;
      int y = 8;
      /* Java assumes x + y as string construction, instead of additive operation. */
      System.out.println("adding " + x + y); // Debugging process does not take care such case.

      int z = 19;
      System.out.println("subtracting "  + (z - y)); // Java assumes z - y as part of string construction

      System.out.println("dividing " + (z / x)); // Java assumes z - y as part of string construction
      System.out.println("multiplying " + (x * z)); // Java assumes z - y as part of string construction
   }
}