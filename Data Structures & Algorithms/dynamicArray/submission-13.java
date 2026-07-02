public class DynamicArray {

    private Integer[] array;
    private int lastPopulatedIndex;
    public DynamicArray(int capacity) {
        array = new Integer[capacity];
        lastPopulatedIndex=-1;
    }
    public DynamicArray() {}

    public int get(int i) {
       // System.out.println("get() "+ Arrays.toString(array));
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }


    public void pushback(int n) {
        boolean isFull = true;
        //assume empty indices have a default value of null for now, if it doesn't work try 0
        for(int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                array[i]=n;
                lastPopulatedIndex = i;
                isFull = false;
                break;
            }
        }
        if(isFull) {
            int capacity = array.length;
            resize();
            array[capacity]=n;
            lastPopulatedIndex = capacity;
            //System.out.println("array has been resized");
        }
        //System.out.println("pushback "+Arrays.toString(array));
    }

    public int popback() {
        Integer ans= null;
       // System.out.println("popback "+Arrays.toString(array));
        /*for(int i = 1; i < array.length; i++) {
            if(array[i]==null) {
                ans=array[i-1];
                this.array[i]=null;
                break;
            }
        }*/
        ans= array[lastPopulatedIndex];
        this.array[lastPopulatedIndex]=null;
        lastPopulatedIndex--;
        return ans;
    }

    private void resize() {
        //1.create new array
        Integer[] newArray= new Integer[array.length*2];
        //2.populate newArray with old array
        for(int i=0;i<array.length;i++)
            newArray[i]=array[i];
        //3.assign array to newArray
        this.array=newArray;
    }

    public int getSize() {
        return lastPopulatedIndex+1;
    }

    public int getCapacity() {
        return this.array.length;
    }
}
