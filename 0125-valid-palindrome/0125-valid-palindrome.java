class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder newS = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newS.append(c);
            }
        }

        String str = newS.toString();
        String rev = newS.reverse().toString();

        return str.equalsIgnoreCase(rev);
    }
}