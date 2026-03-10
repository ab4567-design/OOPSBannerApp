import java.util.*;
public class UC8 {

    // Function to render the banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;   // each character has 7 lines

        for (int i = 0; i < height; i++) {          // loop for each row
            for (char ch : word.toCharArray()) {    // loop for each character

                String[] pattern = patternMap.get(ch);  // get pattern from map
                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }
            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {

        // HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Word to print
        String word = "OOPS";

        // Call function
        renderBanner(word, patternMap);
    }
}