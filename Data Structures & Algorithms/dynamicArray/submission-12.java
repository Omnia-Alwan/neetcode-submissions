public class DynamicArray {

    private Integer[] array;
    private int lastPopulatedIndex;
    public DynamicArray(int capacity) {
        array = new Integer[capacity];
        lastPopulatedIndex=-1;
    }
    public DynamicArray() {}

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }


    public void pushback(int n) {
        lastPopulatedIndex++;// 0 1 2
        if(lastPopulatedIndex<=array.length-1){
            array[lastPopulatedIndex]=n;
        }else {
            int capacity = array.length;
            resize();
            array[capacity]=n;
        }
    }

    public int popback() {
        Integer ans= null;
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
