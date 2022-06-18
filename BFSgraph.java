/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package god.please.make.it.work;

import java.util.LinkedList;
import java.util.Queue;

public class BFSgraph {

    int size;
    adjList[] array;

    public BFSgraph(int size) {
        this.size = size;
        array = new adjList[this.size];
        for (int i = 0; i < size; i++) {
            array[i] = new adjList();
            array[i].head = null;
        }
    }

    public void AddNode(int src, int dest) {
        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }

    public void BFSexplore(int startVertex) {
        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < size; i++) {
            visited[i] = false;
        }
        Queue<Integer> s = new LinkedList<Integer>();
        s.add(startVertex);
        while (!s.isEmpty()) {
            int n = s.poll();
            System.out.println("Visited " + n);
            visited[n] = true;
            Node head = array[n].head;
            while (head != null) {
                if (visited[head.dest] == false) {
                    s.add(head.dest);
                    visited[head.dest] = true;
                } else {
                    head = head.next;
                }
            }

        }
    }
}

