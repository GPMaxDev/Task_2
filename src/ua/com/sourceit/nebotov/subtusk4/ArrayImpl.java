package ua.com.sourceit.nebotov.subtusk4;

import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayImpl  implements Array {




    class IteratorImpl implements Iterator {


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer action) {
            Iterator.super.forEachRemaining(action);
        }
    }



    public static void main(String[] args) {

    }







    @Override
    public void add(Object element) {

    }

    @Override
    public void set(int index, Object element) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
