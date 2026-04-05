package Java_Strings;

public class Java_String1 {
    public static void main(String[] args) {
        
        String word = "My name Is Suhail";

        // charAt(int)
        char char1 = word.charAt(1);
        System.out.println("To find Char : "+char1);

        // indexOf(char 'or' String)
        int index = word.indexOf("Suhail");
        System.out.println("Index of Suhail in word is : "+index);


        // .compareTo() Compute based on **No of Character** 
        String word2 = "Suail";
        if(word2.compareTo("Suhail") == 0){ 
            System.out.println("two String are equal without 'No of Characters '");
        }
        else if(word2.compareTo("Suhail") < 0){
            System.out.println("word2 have 'low no of characters");
        }
        else{
            System.out.println("word2 have 'Many no of characters");
        }


        // .compareToIgnoreCase() **Same But Ignore Case**

        // .concat()
        String word3 = "Prince ", word4 = "Vegeta";
        String word5 = word3.concat(word4);

        System.out.println(word5);

        // .contains(String) 'return Boolean'
        boolean res = word.contains("Suhail");
        System.out.println(res);



        // ******************************(String + charArray)**********************************

        char a[] = {'h', 'e', 'l', 'l', 'o'};
        
        String AfterSliceCopy = "";
        AfterSliceCopy = AfterSliceCopy.copyValueOf(a, 0, 3); 

        System.out.println("After Slice Copy : "+AfterSliceCopy);


    }
}
