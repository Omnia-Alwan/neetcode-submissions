class Solution {
   public int[] replaceElements(int[] arr) {
        int mx=-1;
        int sz= arr.length;
        for(int i= sz-1;i>=0;i--){
            int current = arr[i];
            arr[i]=mx;
            mx= Math.max(mx,current);
        }
        return arr;
    }
}

