class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r = s.length()-1;
        while(l<r){
            while(l<r&& !isAlphaNumeric(s.charAt(l))){
                l++;
            } 
            while(l<r&& !isAlphaNumeric(s.charAt(r))){
                r--;
            } 
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));
           
            if(left != right){
                return false;
            }
             l++;
             r--;
        }
        return true;
    }
        public boolean isAlphaNumeric(char ch){
                return (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z') ||
               (ch >= '0' && ch <= '9');
        }
    
}
