public class Lab9_1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i<=20; i++){
            if(count == 11) {
                System.out.println(count);
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}
