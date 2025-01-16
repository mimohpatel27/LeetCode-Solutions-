class Solution {
    public String orderlyQueue(String s, int k) {
        // first we write the case for k >1
        if(k>1){
            char tempA[]=s.toCharArray();
            Arrays.sort(tempA);
            return new String (tempA);
        }
        int n=s.length();
        String doubleString=s+s;
        String ans=s;
        for(int i=1;i<n;i++){
            String sub=doubleString.substring(i,n+i);
            if(ans.compareTo(sub)>0)ans=sub;
        }
        return ans;
        
    }
}
