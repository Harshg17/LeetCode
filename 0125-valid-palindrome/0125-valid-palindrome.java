class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder newS = new StringBuilder();
        for(Character c : s.toCharArray()){
            int i = c;
            if((i >=48 && i<=57) || (i >=65 && i<=90) || (i >=97 && i<=122) ){
                newS.append(c);
            }
        }

        return newS.toString().equalsIgnoreCase(newS.reverse().toString());
    }
}