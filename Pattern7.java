public class Pattern7 {
//  * * * *  
//   * * * *
//    * * * *
//     * * * *
//      * * * *
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int a=1;a<=i;a++){
            System.out.print(" ");
            }
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
