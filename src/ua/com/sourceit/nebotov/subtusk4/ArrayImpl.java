package ua.com.sourceit.nebotov.subtusk4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayImpl  implements Array {

    ArrayList <Object> objectArrayList = new ArrayList<>();

    public static void main(String[] args) {

        ArrayImpl arrayImplements = new ArrayImpl();
        arrayImplements.add("A");
        arrayImplements.add("b");
        arrayImplements.add("c");

        arrayImplements.set(1, "B");


        System.out.println(arrayImplements.objectArrayList.get(1));
        System.out.println(arrayImplements.indexOf("u"));
        System.out.println(arrayImplements.iterator().hasNext()); // ?? iterator()??
        System.out.println(arrayImplements.iterator().next());
        //Object obj1 = arrayImplements.iterator().next();
        //arrayImplements.iterator().remove();
        System.out.println(arrayImplements.toString());
        System.out.println(arrayImplements.get(0));
        arrayImplements.remove(0);
        System.out.println(arrayImplements.toString());
        System.out.println(arrayImplements.size());

        arrayImplements.clear();
        System.out.println(arrayImplements.iterator().hasNext());
        System.out.println(arrayImplements.toString());


    }

    @Override
    public String toString() {
        return objectArrayList + " ";
    }

    @Override
    public void add(Object element) {

        objectArrayList.add(element);

    }

    @Override
    public void set(int index, Object element) {

        if ((index + 1) <= objectArrayList.size())

        objectArrayList.set(index, element);

    }

    @Override
    public Object get(int index) {


        if((index + 1) <= objectArrayList.size()) {

            return objectArrayList.get(index);

        }
               return null;
    }

    @Override
    public int indexOf(Object element) throws NoSuchElementException {


            if (!objectArrayList.isEmpty()){

                for(Object arrayObject : objectArrayList){

                    if(arrayObject.equals(element)){

                        return objectArrayList.indexOf(arrayObject);
                    }
                }
            }

            return -1;

    }

    @Override
    public void remove(int index) {

        if (!objectArrayList.isEmpty() && (objectArrayList.size() >= index) ){

            objectArrayList.remove(index);
        }

    }

    @Override
    public void clear() {

        if (!objectArrayList.isEmpty()){
            objectArrayList.removeAll(objectArrayList);
        }
     }

    @Override
    public int size() {
        if (!objectArrayList.isEmpty()){
            return objectArrayList.size();
        }
        return 0;
    }

    @Override
    public Iterator<Object> iterator() {

        return new IteratorImpl();

    }

    class IteratorImpl implements Iterator {


        @Override
        public boolean hasNext() {

                return objectArrayList.iterator().hasNext();
        }

        @Override
        public Object next() {

            return objectArrayList.iterator().next();
        }

        @Override
        public void remove() {
            objectArrayList.iterator().remove();
           //Iterator.super.remove(); //????? ?????????????????? ?????????? ?????? ???? remove() a clear()
            // ?????????????? ???????????? ?????? ???? ???????????? ?????????????? ?????????????????? ?????????????? ???????????????? ????????????????????
        }


    }
}
