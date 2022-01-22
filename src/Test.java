package Stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

public class Test {
    public static void main(String[] args){
//        Graph<Integer> myGraph=new Graph<Integer>();
//        myGraph.addVertex(1);
//        myGraph.addVertex(2);
//        myGraph.addVertex(3);
//        myGraph.addVertex(4);
//        myGraph.addVertex(5);
//        myGraph.addEdge(1,3,2);
//        myGraph.addEdge(1,5,3);
//        myGraph.addEdge(3,5,1);
//        myGraph.addEdge(3,1,1);
//        myGraph.addEdge(3,2,1);
//        myGraph.addEdge(4,5,0);
//        myGraph.addEdge(2,3,0);
////        myGraph.weight();
////        myGraph.display();
//        myGraph.findTopologicalOrderFirstPoint();
//        myGraph.outdegree(1);
//        myGraph.indegree(3);
//        myGraph.adjacencyMatrix();
        LinkedList<Integer> myList2=new LinkedList<Integer>();
        myList2.addToFront(4);
        myList2.addToFront(2);
        myList2.addToFront(5);
        myList2.addToFront(1);
        myList2.addToFront(0);
        myList2.addToFront(8);
        myList2.addToFront(3);
        myList2.addToFront(11);
        myList2.bubbleSort(myList2);
        myList2.display();


//        BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
//        myTree.insert(8);
//        myTree.insert(5);
//        myTree.insert(12);
//        myTree.insert(10);
//        myTree.insert(20);
//        myTree.insert(3);
//        System.out.println(myTree.searchRecursively(10));

    }




//        DoublyLinkedList<Integer> myList=new DoublyLinkedList<Integer>();
//
//        CircularLinkedList<Integer> myList= new CircularLinkedList<Integer>();

////        myList.addToEnd(10);
////        myList.delete(5);
//        myList.selectionSort();
//        myList.display();
//        Stack s = new Stack(5);
//        s.push(4);
//        s.push(5);
//        s.push(6);
//        s.push(2);
////        s.pop();
////
////        s.display();
////        System.out.println(StackOperations.search(s,6));
//        s.remove(5);
//        s.display();
//        s.maximum();

//        GenericStack<Integer> gs = new GenericStack<Integer>(Integer.class,5);
////        gs.push(2);
////        gs.push(5);
////        gs.push(+);
////        gs.push(3);
////        gs.push();
//        GenericStackOps<Integer> sops = new GenericStackOps<Integer>();
//        sops.search(gs,6);
//
//        // Calculate Postfix
//        String calculate = "25+3*";
//        GenericStack<Integer> postfixStack = new GenericStack<Integer>(Integer.class,5);
//        postfixStack.postFixCalculate(calculate,postfixStack);
//
//
//        // Paranthesis balance.
//        String paranthesis = "(([]))";
//        GenericStack<Character> paranthesisStack = new GenericStack<Character>(Character.class,5);
//        paranthesisStack.isBalanced(paranthesis,paranthesisStack);
//
//        Queue<Integer> q1=new Queue(Integer.class,5);
//        q1.enqueue(5);
//        q1.enqueue(15);
//        q1.enqueue(3);
//        q1.enqueue(4);
//        q1.display();
    }

