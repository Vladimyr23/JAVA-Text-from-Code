package com.textfromcode;

import com.github.javaparser.ast.Node;
 
public class NodeIterator {
    public interface Nodehandler {
        boolean handle(Node node);
    }
 
    private Nodehandler node_handler;
 
    public NodeIterator(Nodehandler nodeHandler) {
        this.node_handler = nodeHandler;
    }
 
    public void explore(Node node) {
        if (node_handler.handle(node)) {
            for (Node childNode : node.getChildNodes()) {
                explore(childNode);
            }
        }
    }
}