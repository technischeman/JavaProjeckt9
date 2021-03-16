public class HomeworkArrays {
    public static void main(String[] args) {


    }
    public static void sumdigits(int a){
        for (int i = 0; i <1000 ; i++) {
           int yüzler=i/100;
           int onlar=(i%100)/10;
           int birler=(i%100)%100;
           a=yüzler+onlar+birler;
            System.out.println(yüzler+onlar+birler);

        }




    }
}
