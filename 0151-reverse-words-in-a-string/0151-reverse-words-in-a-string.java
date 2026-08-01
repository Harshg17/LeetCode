class Solution {
    public static String reverseWords(String s) {
        List<String> llist = Arrays.stream(s.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .toList();

        llist = llist.reversed();

        StringBuilder sb = new StringBuilder();

        for(String s1: llist){
            sb.append(s1);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}