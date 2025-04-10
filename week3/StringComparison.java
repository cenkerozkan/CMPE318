package week3;

public class StringComparison{
    // This method compares by reference. Checks if they are pointing the same
    // Object.
    private static void compareByReference(){
        String s = new String("Java");
        String s1 = new String("Java");

        if (s == s1){
            System.out.println("They are equal");
        }
        else
        System.out.println("They are not equal");
    }
    // This method compares by content. Checks if the content of their
    // objects are equal to each other.
    private static void compareByContent(){
        String s = new String("Java");
        String s1 = new String("Java");

        if (s.equals(s1)){
            System.out.println("They are equal by content");
        }
        else
        System.out.println("They are not equal by content");
    }

    private static void compareByContentTernary(){
        String s = new String("Java");
        String s1 = new String("Java");

        System.out.println((s.equals(s1)) ? "They are equal by content" : "They are not equal" );
    }

    private static void compareByReferenceTernary(){
        String s = new String("Java");
        String s1 = new String("Java");

        System.out.println((s == s1) ? "They are equal" : "They are not equal because of reference");
    }
    public static void main(String[] args){
        compareByContent();
        compareByReference();

        compareByContentTernary();
        compareByReferenceTernary();
    }
}