public class Pattern {
    public static void main(String[] args){
        int rows = 6;
        for(int i = 1; i <= rows; i++) {
            int num;
            if(i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }
          for(int j = 1; j <= i; j++){
            System.out.print(num);
            num = 1- num;
          }
          System.out.println();
        }
    }
}
