public class Pattern9 {
//      *  
//     * *
//    * * *
//   * * * *
//    * * *
//     * *
//      *

    public static void main(String[] args) {
        int n=4,n1=4;
        for(int i=1;i<=7;i++){
               if(i<=4){
                for(int s=n1;s>=0;s--){
                    System.out.print(" ");
                }n1--;
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
               }else if(i>4){
                for(int s=n1+2;s>=0;s--){
                    System.out.print(" ");
                }n1++;
                for(int k=n-1;k>=1;k--){
                    System.out.print("* ");
                }
               n--; 
               }
          
            
            System.out.println(" ");
        }
    }
}
