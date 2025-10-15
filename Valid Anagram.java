class Solution {
    public boolean isAnagram(String s, String t) {
        char[] Astr1=s.toCharArray();
        char[] Astr2=t.toCharArray();
        Arrays.sort(Astr1);
        Arrays.sort(Astr2);
        if (Arrays.equals(Astr1, Astr2)){
            return true;
        }
        else{
            return false;
        }
    }
}
