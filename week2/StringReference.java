package week2;

public class StringReference {
    public static void main(String[] args){
        String s1 = new String("Cenker Ozkan");
        String s2 = s1;

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);

        // Now lets change s1
        s1 = "Cenker Ozkan 2";
        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);
    }
}

// Output:
//S1: Cenker Ozkan
//S2: Cenker Ozkan
//S1: Cenker Ozkan 2
//S2: Cenker Ozkan
