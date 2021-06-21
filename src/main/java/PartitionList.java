import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * unmodifiable List
 * @param <T>
 */

public class PartitionList<T> extends AbstractList<List<T>>  {

    private final List<T> liste;
    private final int sublistSize;
    private final int listSize;

    /**
     *
     * @param liste
     * @param sublistSize
     */
    public PartitionList(List<T> liste, int sublistSize) {

        if (liste == null)
            throw new NullPointerException("liste ne doit pas etre null !");
        if (sublistSize <= 0)
            throw new IllegalArgumentException("sublistSize ne doit pas etre negatif !");

        this.liste = liste;
        this.sublistSize = sublistSize;
        listSize = this.liste.size();

    }
    public static<T> PartitionList<T> partition(List<T> liste, int sublistSize) {
        return new PartitionList<T>(liste, sublistSize);
    }


    @Override
    public List<T> get(int index) {
        int start = index * sublistSize;
        if (index < 0)
            throw new IndexOutOfBoundsException("index " + index + " doit etre positif");

        int end = Math.min(start + sublistSize, listSize);
        if (index > size()-1){
            throw new IndexOutOfBoundsException();
        }
        return new ArrayList<>(liste.subList(start, end));
    }


    @Override
    public int size() {
        return   listSize / sublistSize + ((listSize % sublistSize == 0) ? 0 : 1);

    }


    @Override
    public boolean isEmpty() {
        return liste.isEmpty();
    }



}
