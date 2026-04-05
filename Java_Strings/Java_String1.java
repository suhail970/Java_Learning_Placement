package Java_Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

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


        // .isEmpty()

        String word6 = "";

        System.out.println(word6.isEmpty());
        
        // ******************************(String + charArray)**********************************


        // String.join(delimiter, arr (or) Direct words)
        String arr[] = {"Suhail", "Nasrin"};

        String word11 = String.join(" ", arr);

        System.out.println(word11);

        // spltit()    ******************(((IIMMPP)))*******************

        String word22 = "My name is Suhail";
        String arr11[] = word22.split(" ");

        
        System.out.println(Arrays.toString(arr11));
        


        // .copyValueOf( String, StartInd(int), count(int) )
        char a[] = {'h', 'e', 'l', 'l', 'o'};
        
        String AfterSliceCopy = "";
        AfterSliceCopy = AfterSliceCopy.copyValueOf(a, 0, 3); 

        System.out.println("After Slice Copy : "+AfterSliceCopy);

        // String.replace(original, change)

        String AfterReplace = word.replace("Suhail", "Nasrin");
        System.out.println("After Replacement of Word : "+AfterReplace);

        // replaceAll() *********** replaceFirst()




        


    }
}
