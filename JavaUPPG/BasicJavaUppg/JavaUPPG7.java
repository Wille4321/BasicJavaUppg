public class JavaUPPG7 {

    public static void main(String args[]) {
        int[] Num = {10, 20, 30, 40, 50};
        
        //Alla siffror
            for (int Num1 : Num) {
                System.out.println(Num1);
        } 
        //Första och sista siffran
            System.out.println(Num[0]);
            System.out.println(Num[4]);
        //Sum och delat
            int Sum = 0;
            int i;
            int Sum2 = 2;
              for (i = 0; i < Num.length; i++) {
                  Sum += Num[i];
              }
                    System.out.println("The sum is: " + Sum);
                        System.out.println(Sum / Sum2);
            
    }
}