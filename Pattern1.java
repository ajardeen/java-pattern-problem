public class Pattern1 {
// * * * * * 
// *       * 
// *       * 
// *       * 
// *       * 
// * * * * * 

    public static void main(String[] args) {


        int n=5;
       for(int row=1;row<=n+1;row++){
        if(row==1 || row==n+1){
            for (int i = 1; i<=n; i++) {
               System.out.print("* ");
        }
        System.out.println("");
       }else{
        for (int i = 1; i <=n; i++) {
            if(i==1 || i==n){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            
        }
        System.out.println("");
       }
    }
    }
}