class Solution {
    public static boolean pal(String f){
            int u=0;
            int w=f.length()-1;
            while(u<w){
                if(f.charAt(u)!=f.charAt(w)){
                    return false;
                }
                u++;
                w--;
            }
            return true;
         }
    public String longestPalindrome(String s) {
        int maxlen = 1;
        String sub = s.substring(0,1);

        for(int i=0;i<s.length();i++){
            for (int j=i+maxlen;j <=s.length();j++){
                if(j-i >maxlen && pal(s.substring(i , j))){
                    maxlen = j-i;
                    sub = s.substring(i ,j);
                }
            }
        }
           return sub;
    }
 
}