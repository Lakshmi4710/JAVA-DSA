import java.util.*;
class LRUCache{
  // Node represents key-value pair in the cache
class Node{
int key;
int value;
Node prev;
Node next;

Node(int key,int value){
this.key=key;
this.value=value;
}}
  // Hashmap uses O(1) to access a node using its key
private Map<Integer,Node> map;
  // Temporary nodes to track start and end of linked list
private Node head;
private Node tail;
  // Max Capacity of cache
private int capacity;
public LRUCache(int capacity){
this.capacity=capacity;
map=new HashMap<>();
// Intialize the empty doubly linked list
 head=new Node(0,0);
tail=new Node(0,0);
head.next=tail;
tail.prev=head;
}
  // Insert a node right after the head(most recently used)
private void insert(Node node){
node.next=head.next;
node.prev=head;
head.next.prev=node;
head.next=node;
}
  // Remove node from linked list
private void remove(Node node){
node.prev.next=node.next;
node.next.prev=node.prev;
}
public int get(int key){
  // Key not exists in cache
if(!map.containsKey(key)){
return -1;
}
Node node=map.get(key);
  // To access node and makes it most recently used
remove(node);
insert(node);
return node.value;
}
public void put(int key,int value){
  // If key already exists ,update its value
if(map.containsKey(key)){
Node node=map.get(key);
node.value=value;
  // Updated node becomes most recently used
remove(node);
insert(node);
return;
}
  // If cache full then remove the least recently used item
if(map.size()==capacity){
Node lru=tail.prev;
remove(lru);
map.remove(lru.key);
}
  // Add node as most recently used
Node node=new Node(key,value);
insert(node);
map.put(key,node);
}
  // Display method (MRU -> LRU)
public void display() {
    Node temp = head.next;
    System.out.print("Cache [MRU to LRU ]: ");
    while (temp != tail) {
        System.out.print("[" + temp.key + "=" + temp.value + "]");
        if (temp.next != tail) {
            System.out.print(" -> ");
        }
        temp = temp.next;
    }
    System.out.println();
}}
public class LRUDemo {
  // Main method
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Cache Capacity: ");
    int capacity = sc.nextInt();
    LRUCache cache = new LRUCache(capacity);
 // Menu driven code to display the LRUCache
    while (true) {
        System.out.println("\n===== LRU Cache Menu =====");
        System.out.println("1. Get");
        System.out.println("2. Put");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            //Get value related to given key
                System.out.print("Enter Key: ");
                int getKey = sc.nextInt();
               System.out.println("Value of " + getKey +  "  =  " +cache.get(getKey));                
		break;
            case 2:
            // Insert a new key-value pair or update existing one
                System.out.print("Enter Key: ");
                int putKey = sc.nextInt();
                System.out.print("Enter Value: ");
                int value = sc.nextInt();
                cache.put(putKey, value);
                System.out.println("Inserted/Updated Successfully.");
                break;
            case 3:
            // Display nodes from MRU -> LRU
                cache.display();
                break;
            case 4:
            // Exit program
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Invalid Choice!");
        }}}}
