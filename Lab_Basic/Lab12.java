public class Lab12 {
    public static void main(String[] args) {
        String string1 = "You and Me";
        String string2 = " you and me ";
        if(string1.equals(string2)){
            System.out.println(string1 + " is equal to " + string2);
        }
        else{
            System.out.println(string1 + " is not equal to " + string2);
        }
        String word = " you and me ";
        System.out.println(string2.contains(word));
        System.out.println("You are searching for the word: " + word);
        System.out.println("The length of the string is: " + word.length());
        String newString = word.substring(5, word.length() - 1);
        System.out.println("Your new string: " + newString);
        String trimmedWord = word.trim();
        System.out.println("Trim the spaces out, the word will become: " + trimmedWord);
        System.out.println("Trimmed word length: " + trimmedWord.length());
        System.out.println("Upper letter: " + trimmedWord.toUpperCase());

        String chaning = string2.trim().toUpperCase();
        System.out.println("Chaning:" + chaning);
    }
}
