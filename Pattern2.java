public class Pattern2 {
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
    public static void main(String[] args) {
        int num=4;
        for(int n=1;n<=num;n++){
            for (int i = 1; i <=n; i++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
