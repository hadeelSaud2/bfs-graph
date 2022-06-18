/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package god.please.make.it.work;

import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//        System.out.println("how many edges are there:");
//        int edge = read.nextInt();
//        BFSgraph gr = new BFSgraph(edge);
//        System.out.println("write the vertices that have connection, if you want"
//                + " to stop wrtie -1000");
//        int i = 999;
//        while (i != 0) {
//            System.out.println("first vetice or -1000 to stop:");
//            int a = read.nextInt();
//            if (a == -1000) {
//                break;
//            }
//            System.out.println("second vertice:");
//            int b = read.nextInt();
//            gr.AddNode(a, b);
//            gr.AddNode(b, a);
//            i--;
//            System.out.println("edge has been add between " + a + "," + b);
//        }
//        System.out.println("which vertice you want to explor:");
//        int explore = read.nextInt();
//        gr.BFSexplore(explore);
//        
//        
         BFSgraph g = new BFSgraph(6);
        g.AddNode(0, 2);
        g.AddNode(0, 1);
        g.AddNode(2, 3);
        g.AddNode(2, 0);
        g.AddNode(2, 4);
        g.AddNode(1, 0);
        g.AddNode(1, 3);
        g.AddNode(1, 5);
        g.AddNode(3, 5);
        g.AddNode(3, 2);
        g.AddNode(4, 2);
        g.AddNode(5, 3);
        g.AddNode(5, 1);

        g.BFSexplore(1);
    }
}

