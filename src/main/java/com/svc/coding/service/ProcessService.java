package com.svc.coding.service;



import com.svc.coding.domain.ChildrenFlow;
import com.svc.coding.domain.ElementNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The core service to execute the whole game
 */
@Service
public class ProcessService {

    private int numOfChildren; // number of children in a circle
    private int counter; // number used for counting off
    private ElementNode startNode;
    private ElementNode endNode;
    private ChildrenFlow childrenFlow;
    public List resultList;

    public void initialize() {
        childrenFlow = new ChildrenFlow();
        numOfChildren = 0;
        counter = 0;
        resultList = new ArrayList();
    }

    /**
     * Setting number of children in initializing
     * @param x
     */
    public void setNumOfChildren(int x) {
        numOfChildren = x;

    }

    /**
     * Seeting initial count value for k where k determines start of game
     * @param k
     */
    public void setCounter(int k) {
        counter = k;
    }

    /**
     * Adding children in circular list as per n
     */
    public void addChildren() {
        for (int i = 1; i < numOfChildren; i++) {
            childrenFlow.insert(i);
        }
    }

    /**
     * Moving the circular flow and extracting values from node (linked list)
     */
    public void move() {

        for (int i = 0; i < counter; i++) {
            endNode = startNode;
            startNode = startNode.next;
        }
        // Keeping track of k who is out
        resultList.add(" k:  "+ startNode.element.toString());
    }

    /**
     * Core logic to circulate the n children with the child who counts ‘k’ is now out and
     * leaves the circle. The count starts again with the child immediately next to the
     * eliminated one
     */
    
    /* Explanantion of the runtime order complexity
     * The position returned by start and end node is adjusted because the recursive call  
     move() considers the original position  childrenFlow.getFirst() as position 1 */
    
    public void execute() {
        endNode = null;
        startNode = childrenFlow.getFirst();
        while (numOfChildren != 2) { // to ignore the first and last iteration
            move();
            childrenFlow.delete(startNode.element);
            endNode = endNode.next;
            startNode = startNode.next;
            numOfChildren--;
            addResult();
        }

    }

    /**
     * Save results of each iteration for circular list to keep track of each flow
     */
    public void addResult() {
        String resultStr = childrenFlow.displayList();
        resultList.add(" n:  "+resultStr);
    }

}
