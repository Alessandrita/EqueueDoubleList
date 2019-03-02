package Queue;

import Excepciones.*;

public interface Queue<T extends Comparable<T>> extends Iterable<T> {

    boolean enqueue(T value);
    boolean removeAll();
    T       dequeue();
    T       front();
    T       last();
    void    isFull()            throws isFullException;
    void    isEmpty()           throws isEmptyException;
    

}
