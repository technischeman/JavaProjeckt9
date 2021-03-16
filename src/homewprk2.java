public class homewprk2 {
    public static void main(String[] args) {
        //tüm sayilarin karesinin toplami
        int[]arr={1,3,5,7};
        int kareler=1;
        int karelertoplam=0;
        for(Integer kare:arr){
            kareler=kare*kare;
            karelertoplam+=kareler;
            kare++;
        }
        System.out.println(karelertoplam);


    }
}
