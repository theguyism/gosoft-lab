public class Lab8_1 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }
    public static void a(){
        int count = 0;
        for(int i = 0; i <= 20; i++){
            System.out.println(count);
            count++;
        }
    }
    public static void b(){
        int count = 0;
        for(int i = 0; i <= 20; i++){
            if(count == 11){
                System.out.println(count);
                break;
            }
            else {
                System.out.println(count);
                count++;
            }
        }
    }

    public static void c(){
        int count = 0;
        for(int i = 0; i <= 20; i++){
            if(count == 11){
                System.out.println(count);
                break;
            }
            else {
                System.out.println(count);
                count++;
            }
        }

    }

}
