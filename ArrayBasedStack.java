import java.util.*;

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
  if(topOfStack + 1 == data.length)
   {
   doubleArray();
   }
  data[++topOfStack] = newEntry;
  }
  
 public T pop()
  {
  if(isEmpty() == true)
   {
   throw new EmptyStackException();
   }
  T temp = data[topOfStack];
  data[topOfStack] = null;
  topOfStack--;
  return temp;  
  }
  /** Retrieves this stack's top entry.
     @return  The object at the top of the stack.
     @throws  EmptyStackException if the stack is empty. */
 public T peek()
  {
  if(isEmpty())
   {
   throw new EmptyStackException();
   }
  return data[topOfStack];
  }
  /** Detects whether this stack is empty.
     @return  True if the stack is empty. */
 public boolean isEmpty()
  {
  if(topOfStack == -1)
   {
  return true;
   }
  else
   {
   return false;
   }
  }
  
 /** Removes all entries from this stack. */
 public void clear()
  {
  while(!isEmpty())
   {
   pop();   
   }
  }

 public static void main(String[] args){
  StackInterface<String> stack = new ArrayBasedStack(1);
  System.out.println(stack.isEmpty());
  stack.push("Hello");
  stack.push("World");
  System.out.println(stack.peek());
  System.out.println(stack.pop());
  System.out.println(stack.peek());
  System.out.println(stack.pop());
  stack.push("o");
  System.out.println(stack.pop());
  System.out.println(stack.isEmpty());
  stack.pop();
  }


}