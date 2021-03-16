public class homeworkforeach {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int tcarpim=1;
        for(int carpim:arr){
            tcarpim*=carpim;
            carpim++;
        }System.out.println(tcarpim);
}}
