public class FirstNonRepeatingCharacterTakeTwo {

    public static final int EXTENDED_ASCII_CODES = 256;  //00 to 255


    public static void main(String[] args) {
        String testString = "iittss  aa  ggoodd  zaawffuull   ssmmaall  aaffaaiirr";

        int[] charCountArray = new int[EXTENDED_ASCII_CODES];
        //initialise
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            charCountArray[i] = -1;
        }
        //starting at position 0, look at each character in the testString in turn
        //stores it's position in the string in the charCountArray
        //if that character has already been seen in the string set the count to -2 (not interested in these)
        char ch;
        for (int i = 0; i < testString.length(); i++) {
            ch = testString.charAt(i);
            if (charCountArray[ch] == -1) {
                charCountArray[ch] = i;
            } else charCountArray[ch] = -2;
        }
        // entries for -1 , are characters that don't appear in the string at all
        // entries for -2, are characters that appear more than once
        // +ve entries show the (only) position in the string for that character
        int position = Integer.MAX_VALUE;
        for (int i=0;i<EXTENDED_ASCII_CODES;i++){
                if (charCountArray[i]>-1) {
                    position = Math.min(position,charCountArray[i]);
                }
        }
        if (position<Integer.MAX_VALUE) {
            System.out.println("The first non-duplicate character is "+testString.charAt(position) + " at location "+ position);
        } else System.out.println("no non-duplicate character found in the string");
    }

}
