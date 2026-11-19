import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    static class Node{
        int key,val;
        Node pre,next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    private int capacity;
    private Map<Integer, Node> map ;
    private Node dummyHead,dummyTail;
    public LRUCache(int capacity){

        this.dummyHead = new Node(-1,-1);
        this.dummyTail = new Node(-1,-1);
        this.map = new HashMap<>();
        dummyHead.next = dummyTail;
        dummyTail.pre = dummyHead;
        this.capacity = capacity;
    }
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node= map.get(key);
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            moveToHead(node);
        }else {
            Node node = new Node(key, value);
            map.put(key,node);
            addToHead(node);
            if (map.size() > capacity){
                removeTail();
            }
        }

    }

    public void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }

    public void addToHead(Node node){
        node.next = dummyHead.next;
        node.pre = dummyHead;
        dummyHead.next.pre = node;
        dummyHead.next = node;
    }
    public void removeNode(Node node){
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    public Node removeTail(){
        Node node = dummyTail.pre;
        removeNode(node);
        return node;
    }
}
