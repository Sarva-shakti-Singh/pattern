public class Patterntriangle {
    public static void printPattern(int n){
        int i,j;
        for(i=0;i<=n;i++){
            for(j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");

                }
                else{
                    System.out.print(0+" ");
                }
            }
             System.out.println();
        }
       

    }
    public static void main(String[] args) {
        int n=6;
        printPattern(n);
    }
    
}
