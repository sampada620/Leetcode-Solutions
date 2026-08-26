class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        s=new StringBuilder(s).reverse().toString();
        int i=0;
        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i>=n){
                break;
            }
            int start=i;
            while(i<n && s.charAt(i)!=' '){
                i++;
            }
            String word=s.substring(start,i);
            word=new StringBuilder(word).reverse().toString();
            
            if(ans.length()>0){
                ans.append(" ");
            } 
            ans.append(word);
        }
        return ans.toString();       

        
    }
}