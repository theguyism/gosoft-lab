public class Lab3_1 {
    public static void main(String[] args) {
        addition();
        subtract();
    }
    public static void addition(){
        int i = 20;
        for(int j = 0; j<5; j++){
            i++;
        }
        System.out.println("i = " + i);
    }
    public static void subtract(){
        int i = 20;
        for(int j = 0; j<5; j++){
            i--;
        }
        System.out.println("i = " + i);
    }

}
