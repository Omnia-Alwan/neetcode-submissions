public class DynamicArray {

    private int[] array;
    private int lastPopulatedIndex;
    public DynamicArray(int capacity) {
        array = new int[capacity];
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
        if (lastPopulatedIndex + 1 == array.length) {
        resize();
    }
    array[++lastPopulatedIndex] = n;
    }

    public int popback() {
        Integer ans;
        ans= array[lastPopulatedIndex];
        lastPopulatedIndex--;
        return ans;
    }

    private void resize() {
        //1.create new array
        int[] newArray= new int[array.length*2];
        //2.populate newArray with old array
        for(int i=0;i<array.length;i++)
            newArray[i]=array[i];
        //3.assign array to newArray
        this.array=newArray;
    }
//["Array", 3, "pushback", 1, "pushback", 2, "pushback", 3, "get", 0, "get", 1, "get", 2]
    public int getSize() {
        return lastPopulatedIndex+1;
    }

    public int getCapacity() {
        return this.array.length;
    }
}
