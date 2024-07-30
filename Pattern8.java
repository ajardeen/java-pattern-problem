public class Pattern8 {
//       1  
//     2 1 2
//   3 2 1 2 3
// 4 3 2 1 2 3 4
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int s=4;s>i;s--){
                System.out.print("  ");
            }
            for(int k=i;k>=2;k--){
                System.out.print(k+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
