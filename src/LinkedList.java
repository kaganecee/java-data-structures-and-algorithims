package Stack;

public class LinkedList <T extends Comparable> {
    private Node<T> head;

    public Node<T> createNode(T val) {
        return new Node<T>(val);
    }

    public void addToFront(T val) {
        Node<T> newNode = createNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFront() {
        if (head != null) {
            head = head.next;
        }
    }

    public void addToEnd(T val) {
        Node<T> iterator = head;
        if (head == null) {
            head = createNode(val);
        } else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = createNode(val);
        }
    }

    public void deleteFromEnd() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                return;
            }
            Node<T> iterator, previous;
            iterator = previous = head;
            while (iterator.next != null) {
                previous = iterator;
                iterator = iterator.next;
            }
            previous.next = null;
        } else {
            System.out.println("List is empty.");
        }
    }

    public void display() {
        Node<T> iterator = head;
        while (iterator != null) {
            System.out.println(iterator.value);
            iterator = iterator.next;
        }
    }

    public void delete(T val) {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            if (head.value.compareTo(val) == 0) {
                head = head.next;
            } else {
                Node<T> previous = head, iterator = head;
                while (iterator.next != null) {
                    previous = iterator;
                    iterator = iterator.next;
                    if (iterator.value.compareTo(val) == 0) {
                        previous.next = iterator.next;
                    }
                }
            }
        }
    }

    public boolean search(T val) {
        Node<T> iterator = head;
        while (iterator != null) {
            if (iterator.value.compareTo(val) == 0) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public T findMin() {
        T min = null;
        if (head == null) {
            return null;
        } else {
            Node<T> iterator = head;
            min = head.value;
            while (iterator != null) {
                if (iterator.value.compareTo(min) == -1) {
                    min = iterator.value;
                }
                iterator = iterator.next;
            }
        }
        return min;
    }

    public int count() {
        int count = 0;
        Node<T> iterator = head;

        return count;
    }

    public void addToEndRecursively(T val) {
        head = addToEndRecursively(head, val);
    }

    public Node<T> addToEndRecursively(Node<T> myHead, T val) {
        if (myHead == null) {
            return createNode(val);
        } else {
            myHead.next = addToEndRecursively(myHead.next, val);
        }
        return myHead;
    }
    public int size(){
        int size=0;
        Node<T> iterator = head;
        while (iterator != null) {
            size++;
            iterator = iterator.next;
        }
        return size;
    }
    public void bubbleSort(LinkedList<T> linkedList){
        Node<T> iterator = head;
        Node<T> iterator1 = head;
        T temp;
        while (iterator1.next != null) {
            while(iterator.next!=null) {
                if (iterator.value.compareTo(iterator.next.value) == 1) {
                    temp = iterator.value;
                    iterator.value = iterator.next.value;
                    iterator.next.value = temp;
                    iterator = iterator.next;
                } else {
                    iterator = iterator.next;
                }
            }
            iterator1 = iterator1.next;
        }
    }
    public Node<T> findMinNode(Node<T> headStart){
        if(headStart!=null) {
            Node<T> iterator = headStart;
            Node<T> minNode=headStart;
            while(iterator!=null){
                if(iterator.value.compareTo(minNode.value)==-1){
                    minNode=iterator;
                }
                iterator=iterator.next;
            }
            return minNode;
        }
        return null;

    }
    public void selectionSort(){
        Node<T> headStart=head;
        while(headStart!=null) {
            Node<T> minNode = findMinNode(headStart);
            T temp = minNode.value;
            minNode.value = headStart.value;
            headStart.value = temp;
            headStart=headStart.next;
        }
    }
}
