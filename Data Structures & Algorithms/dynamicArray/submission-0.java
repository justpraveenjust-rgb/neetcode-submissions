class DynamicArray {

    private int[] iArray;
    private int size=0;
    public DynamicArray(int capacity) {
        iArray = new int[capacity];
    }

    public int get(int i) {
        return iArray[i];
    }

    public void set(int i, int n) {
        iArray[i] = n;
    }

    public void pushback(int n) {
        if(iArray.length == size){
            resize();
        }
        iArray[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return iArray[size];
    }

    private void resize() {
        int[] newArr = new int[iArray.length * 2];
        for(int iii=0;iii<size;iii++){
            newArr[iii]=iArray[iii];
        }
        iArray=newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return iArray.length;
    }
}
