package com.svc.coding.domain;

public class ChildrenFlow {

    private ElementNode first; //head linkedlist
    private ElementNode last; //tail linkedlist
    private ElementNode current;
    private int childrenCount; // total children in the list

    public ChildrenFlow() {
        first = null;
        last = null;
        current = null;
        childrenCount = 0;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private void step() {
        current = current.next;
    }


    public ElementNode getFirst() {
        return first;
    }

    public void insert(int x) {
        ElementNode newElementNode = new ElementNode(x);

        if (isEmpty()) {
            first = newElementNode;
            current = first;
        } else {
            current.next = newElementNode;
        }

        newElementNode.next = first;
        last = newElementNode;
        step();
        childrenCount++;
    }

    public void delete(int x) {
        ElementNode prev = first;
        ElementNode curr = first.next;

        while (curr.element != x) {
            prev = curr;
            curr = curr.next;
        }
        if (childrenCount == 1) {
            first = null;
            childrenCount--;
        } else if (curr == first) {
            prev.next = curr.next;
            first = curr.next;
            childrenCount--;
        } else {
            prev.next = curr.next;
            childrenCount--;
        }

    }

    public String displayList() {
        String resultStr ="";
        int counter = 0;
        ElementNode elementNode = first;

        while (counter < childrenCount) {
            resultStr = resultStr + elementNode.element + " ";
            elementNode = elementNode.next;
            counter++;
        }
        System.out.println("");
        return resultStr;
    }
}
