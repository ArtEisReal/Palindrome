package palindromeFinder;

public class PalindromeFinder {
    
    
    private String text;
    
    /**
     * 
     * constructor without param
     */
    PalindromeFinder(){
        this.text = "";
    }
    
    /**
     * 
     * constructor for one text
     * @param text
     */
    PalindromeFinder(String text) {
        this.text = text;
    }
    
    /**
     * 
     * set text
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
    
    /**
     * 
     * get text
     * @return text
     */
    public String getText() {
        return this.text;
    }
    
    /**
     * 
     * iterates through the text and uses method is Palindrom to return if it is the longest palindrome
     * @return longestpalindrome 
     */
    public String getLongestPalindrome() {
        if (this.text == null|| this.text.isEmpty()) {
            return "";
        }
        
        String longestPalindrome = "";
        
        for (int leftIndex = 0; leftIndex < this.text.length(); leftIndex++) {
            for (int rightIndex = leftIndex + 1; rightIndex <= this.text.length(); rightIndex++) {
                
                String substr = this.text.substring(leftIndex, rightIndex);
                if(isPalindrome(substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                    
                }
            }
        } 
        
        return longestPalindrome;
    }
    
    /**
     * 
     * checks if the substr is a palindrome
     * @param substr
     * @return true or false
     */
      public static boolean isPalindrome(String substr) {
          substr = substr.toLowerCase();
          int left = 0;
          int right = substr.length() - 1;

          while (left < right && substr.charAt(left) == substr.charAt(right)) {
              left++;
              right--;
          }
          
          return left >= right;
      }
  
}
