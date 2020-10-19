//Generic queue (FIFO) class
public class ArrayQueue<E> {

    private E[] queue;
    private int front = 0;
    private int length = 0;
    private int size = 0; // capacity of the array
    int CAP = 30;

    //Empty constructor - default capacity 30
    public ArrayQueue(){
        new ArrayQueue(CAP);
        size = CAP;
    }

    //Constructor
    public ArrayQueue(int capacity){
        queue = (E[]) new Object[capacity];
        size = capacity;
    }

    //Returns current length of the queue
    public int getLength(){
        return length;
    }

    //Checks if the queue is empty
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    Adds an element to the back of the queue, throwing an exception if the queue is full
    Uses modulus operator for wraparound to see if there is room in the queue
    */
    public void enqueue(E elem) throws IndexOutOfBoundsException{
        if (length == size) {
            throw new IndexOutOfBoundsException("Queue is full!");
        }
        int idx = (front + length) % size;
        queue[idx] = elem;
        length ++;
    }

    /*
    Removes an element from the front of the queue, throwing an exception if the queue is empty already
    front = (front + 1) % queue.length is used to change the index of the front value (which represents the index of the last element in the queue)
    */
    public E dequeue(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Queue is empty!");
        }
        E first = queue[front];
        queue[front] = null;
        front = (front + 1) % size;
        length --;
        return first;
    }
}
