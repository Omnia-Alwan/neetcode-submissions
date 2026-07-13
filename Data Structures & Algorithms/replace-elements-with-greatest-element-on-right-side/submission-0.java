class Solution {
   public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int mx=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                mx = Math.max(mx,arr[j]);
            }
            arr[i]=mx;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}

