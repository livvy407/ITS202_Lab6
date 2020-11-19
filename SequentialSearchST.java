import java.util.*;

public class SequentialSearchST<Key, Value>
{
    private int n;
    private Node first;

    public SequentialSearchST()
    {
        first = null;
        n = 0;
    }

    private class Node
    {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next)
        {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public int size()
    {
        return n;
    }

    public boolean isEmpty()
    {
        if(n==0)
        {
            return true;
        }
        return false;
    }

    public boolean contains(Key key)
    {
        if(key == null) throw new IllegalArgumentException("The number is zero.");
        return get(key) != null;
    }

    public Value get(Key key)
    {
        for(Node x = first; x != null; x = x.next)
        {
            if(key == x.key)
                return x.val;
        }
        return null;
    }

    public void put(Key key, Value val)
    {
        Node newest = new Node(key, val, null);

        for(Node x = first; x != null; x = x.next)
        {
            if(key == x.key)
            {
                x.val = val;
                return;
            }
        }
       newest.next = first;
       first = newest;
       n++;
    }

    public void delete(Key key)
    {
        first = delete(first, key);
    }

    private Node delete(Node x, Key key)
    {
        if(x==null)
            return null;
        if(key==x.key)
        {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

    public Iterable<Key> keys() 
    {
        ArrayList<Key> arr = new ArrayList<Key>();

        for(Node x = first; x != null; x = x.next)
        {
            arr.add(x.key);
        }
        return arr;
    }

    public static void main(String[] args)
    {

    }
}