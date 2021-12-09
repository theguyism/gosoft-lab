public class Lab4_1 {
    public static void main(String[] args) {
        System.out.println(myStatement(80));
    }
    public static String myStatement(int score){
        boolean isHandSome = true;
        if(score >= 80){
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
