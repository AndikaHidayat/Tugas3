package mainqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    
    public void queueExample(){
        Queue<String> q = new LinkedList<String>();
        q.add("Java");
        q.add("DotNet");
        q.offer("PHP");
        q.offer("HTML");
        System.out.println("Remove: " + q.remove());
        System.out.println("Element: " + q.element());
        System.out.println("Poll: " + q.poll());
        System.out.println("Peek: " + q.peek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
    
}
