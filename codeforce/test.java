public class test {
    public static void main(String[] args) {
        int a=2;
        int b=4;
           for(int i=a;i<b;i++){
            for(int j=b;j>a;j--){
                if(i==j)
                continue;
                System.out.println(i+" "+j);
            }
        }
    }
}
