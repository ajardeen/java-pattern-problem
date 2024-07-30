public class Pattern3 {
//      1 
//     2 2
//    3 3 3
//   4 4 4 4
    public static void main(String[] args) {
        int num=8;
        for(int n=1;n<=num;n++){
            
            for(int a=1;a<=num-n;a++){
                System.out.print(" ");
            }
            for(int b=1;b<=n;b++){
                System.out.print(n+" ");
            }
            System.out.println("");
        }
    }
}
