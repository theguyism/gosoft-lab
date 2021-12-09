public class Lab5 {
    public static void main(String[] args) {
        gradingSystem(80);
        
    }
    public static void gradingSystem(int score){
        switch (score){
            case(80):
                System.out.println("A");
                break;
            case(70):
                System.out.println("B");
                break;
            case(60):
                System.out.println("C");
                break;
            case(50):
                System.out.println("D");
                break;
            case(40):
                System.out.println("F");
                break;
            default:
                System.out.println("E");
                break;
        }
    }
}
