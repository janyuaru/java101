/*Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
Examples:
"Hey fellow warriors"  --> "Hey wollef sroirraw" 
"This is a test        --> "This is a test" 
"This is another test" --> "This is rehtona test"*/

public class SpinWords {

  public static String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();
    
    for (String word : words) {
      if (word.length() >= 5) {
        result.append(new StringBuilder(word).reverse());
      } else {
        result.append(word);
      }
      result.append(" ");
    }
    return result.toString().trim();
  }
  
   public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));     // "Hey wollef sroirraw"
        System.out.println(spinWords("This is a test"));          // "This is a test"
        System.out.println(spinWords("This is another test"));    // "This is rehtona test"
    }
}
