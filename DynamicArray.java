public class DynamicArray<T> {
    private T[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public DynamicArray() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index eksistere ikke");
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public void remove() {
        if (size > 0) {
            size--;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index eksistere ikke");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index eksistere ikke");
        }
        array[index] = element;
    }

    public void clear() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
