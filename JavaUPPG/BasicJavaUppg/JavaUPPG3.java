
public class JavaUPPG3 {
    
    public static void main(String args[]) {
      //int till double  
        int i=5;
        double I=i;
        System.out.println(I);
        
      //float till double
      float f = 0.1F;
      double d = f;
        System.out.println(d);
      //double till int
      double data = 5;
        System.out.println("Double - " + data);
      
      int value = (int)data;
      
        System.out.println("Integer - " + value);
      
      //char till int
      char c1 = 2;
      char c2 = 1;
      int a = c1;
      int b = c2;
        System.out.println(a);
        System.out.println(b);

      //int till dyte
      int myInt = 123;
      byte myByte = (byte) myInt;
        System.out.println(myByte);
    }
}
