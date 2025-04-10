package week3;

public class StringComparison{
    private static void compareByReference(){
        String s = new String("Java");
        String s1 = new String("Java");

        if (s == s1){
            System.out.println("They are equal");
        }
        else
        System.out.println("They are not equal");
    }

    private static void compareByContent(){
        String s = new String("Java");
        String s1 = new String("Java");

        if (s.equals(s1)){
            System.out.println("They are equal by content");
        }
        else
        System.out.println("They are not equal by content");
    }
    public static void main(String[] args){
        compareByContent();
        compareByReference();
    }
}