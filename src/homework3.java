public class homework3 {
    public static void main(String[] args) {
        String[] arr = {"calisma", "liyakat", "sabir", "inanc"};
        String[] arr2 = {"sabir","özgürlük", "vesile"};
        String sonuc;
        for (String ilk : arr) {
            for (String iki : arr2) {
                {
                    if (ilk.equals(iki)) {
                        sonuc = iki;
                        System.out.println(iki);
                    }
                }

            }
        }

    }}






