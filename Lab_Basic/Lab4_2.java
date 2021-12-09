public class Lab4_2 {
    public static void main(String[] args) {
        System.out.println(myStatement(-100));
    }
    public static String myStatement(int score){
        boolean isHandSome = true;
        if(isHandSome == true){
            return "Good";
        }
        else if(score >= 50){
            return "Normal";
        }
        else{
            return "Fail";
        }
    }
}
