package HomeWork1.Amfgramv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Богдан on 23.02.2017.
 */
public class AmagramV2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fullString = reader.readLine();

        disjointAndReverseString(fullString);
    }

        public static void disjointAndReverseString(String fullString) {

        for (int i = 0; i < fullString.length(); i++) {

            if ((i - 1) != fullString.lastIndexOf(" ")) {
                String partOfString = fullString.substring(i, fullString.indexOf(" ", i));
                i = fullString.indexOf(" ", i);
                System.out.print(reverseString(partOfString)+ " ");
            }
            else if((i-1)== fullString.lastIndexOf(" ")) {
                String partOfString = fullString.substring(i, fullString.length());
                System.out.print(reverseString(partOfString));
                break;
            }
        }
        }
        public static String reverseString(String partOfString){
            String newStr = "";
            for (int i = partOfString.length()-1; i >= 0; i--){
                newStr+=partOfString.charAt(i);
            }
            return newStr;
        }

    }

