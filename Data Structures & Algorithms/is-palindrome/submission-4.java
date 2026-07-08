class Solution {
    public boolean isPalindrome(String s) {
        //ma dam
        String ss = s.toLowerCase();
        char[] arr =new  char[ss.length()];
        //012345
        //ma dam
        for (int i = 0, indx = 0; i < ss.length(); i++) {
            if((ss.charAt(i)>=65 && ss.charAt(i)<=90)||(ss.charAt(i)>=97 && ss.charAt(i)<=122)||(ss.charAt(i)>=48 && ss.charAt(i)<=57)) {
                arr[indx] = ss.charAt(i);
                //System.out.println(arr[indx]);
                indx++;
            }
        }

        String str = String.copyValueOf(arr).trim().stripTrailing();
        //System.out.println(str);
        for(int i = str.length() - 1; i >=0; i--){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
