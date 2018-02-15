import java.util.Arrays;

public class ArrayBasedStack<T> implements StackInterface<T>{

 private T[] data;
 private int topOfStack = -1;
 private final int INITIAL_CAPACITY = 5;
 private boolean initialized;

 public ArrayBasedStack(int userValue)
  {
  if (userValue <= 0)
   {
   throw new IllegalArgumentException("Initial Capacity must be greater than 0");
   }
  data = (T[]) new Object[userValue];
  topOfStack = -1;
  }
 
 public ArrayBasedStack()
  {
  data = (T[]) new Object[INITIAL_CAPACITY];
  topOfStack = -1;
  }
 
 private void doubleArray()
  {
   data = Arrays.copyOf(data, data.length*2);
  }
 
 public void push(T newEntry)
  {
  if(data[0] != null && data[data.length - 1] != null)
   {
  // for(int i = length.data
   }
  
  }
  
 public T pop(){}
  /** Retrieves this stack's top entry.
     @return  The object at the top of the stack.
     @throws  EmptyStackException if the stack is empty. */
 public T peek(){}
  /** Detects whether this stack is empty.
     @return  True if the stack is empty. */
 public boolean isEmpty(){}
  
 /** Removes all entries from this stack. */
 public void clear(){}

 
}