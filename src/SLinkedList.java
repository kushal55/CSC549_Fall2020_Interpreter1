
public class SLinkedList 
{
	public void editAtIndex(int index, int newElement) {
        if (index < 0 || index >= size) {
            return;
        } else {
            Node cur = head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            cur.setElement(newElement);
        }
    }

    public static void main(String[] args) {
        Node test = new Node(5);
        test.setElement(5);

        SLinkedList myList = new SLinkedList();
        
        myList.addFirst(5);
        myList.addFirst(7);
        myList.addFirst(9);
        myList.addLast(27);
        myList.addLast(3);
        myList.addLast(453);
        myList.addLast(32);
        myList.addLast(83);
        myList.addLast(43);
        myList.addLast(10);




        myList.removeOdds();
        myList.printList();

    }

    private Node head, tail, nextNode;

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    private int size;

    public void addFirst(int element) {
        head = new Node(element, head);
        size++;
        if (size == 1) {
            tail = head;
        }
    }

    public void addLast(int element) {
        Node last = new Node(element);
        if (size == 0) {
            head = last;
            tail = last;
        } else {
            tail.setNext(last);
            tail = last;
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            return;
        }
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    public void removeLast() {
        if (size <= 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            Node cur = head;
            while (cur.next != tail) {
                cur = cur.next;
            }
            tail = cur;
            size--;
            tail.next = null;
        }
    }

    public void removeOdds() {
        if (size <= 1) {
            return;
        } else {
            Node cur = head;
            Node previous = cur;
            while (cur.next != tail) {
                cur = cur.next;
                if (cur.getElement() % 2 != 0) {
                    size--;
                    previous.next = cur.next;
                } else {
                    previous = previous.next;
                }
            }
        }
    }

    public boolean contains(int key) {
        Node cur = head;
        while (cur != null && cur.getElement() != key) {
            cur = cur.next;
        }
        if (cur == null) {
            return false;
        }
        return true;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;

    }

    private static class Node {

        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
