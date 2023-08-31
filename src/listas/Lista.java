/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Iterator;

/**
 *
 * @author DIEGO
 */
public class Lista<Item extends Comparable<? super Item>> implements Iterable<Item> {

    //Atributos
    Node<Item> first;

    private class Node<Item> {

        //Atributos
        Item item;
        Node<Item> next;

        //Constructor
        public Node(Item item) {
            this.item = item;
            this.next = null;
        }
        //get y set

        public Node() {
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

    }
    //Constructor

    public Lista() {
        first = null;
    }

    public boolean search(Item item) {

        if (isEmpty()) {
            return false;
        } else {
            Node<Item> tmp = first;
            while (tmp != null) {
                if (tmp.getItem().equals(item)) {
                    return true;
                }
                tmp = tmp.next;
            }
            return false;

        }
    }

    public Item maxItem() {

        if (isEmpty()) {
            return null;
        }
        Node<Item> tmp = first;
        Item candidato = tmp.getItem();
        while (tmp != null) {
            if (candidato.compareTo(tmp.getItem()) < 0) {
                candidato = tmp.getItem();
            }
            tmp = tmp.next;
        }
        return candidato;

    }

    public void addLast(Item item) {
        Node<Item> nuevo = new Node<Item>(item);
        if (isEmpty()) {
            first = nuevo;
        } else {
            Node<Item> tmp = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = nuevo;

        }
    }

    public void addFirst(Item item) {
        Node<Item> nuevo = new Node<Item>(item);
        if (isEmpty()) {
            first = nuevo;
        } else {
            nuevo.next = first;
            first = nuevo;
        }
    }

    public void addMiddle(Item item, int posicionLista) {
        Node<Item> nuevo = new Node<Item>(item);

        if (isEmpty()) {
            nuevo.next = first;
            first = nuevo;
        }
        
        Node<Item> tmp = first;
        int Posicion = 0;

        while (tmp.next != null && Posicion < posicionLista - 1) {
            tmp = tmp.next;
            Posicion++;
        }
        nuevo.next = tmp.next;
        tmp.next = nuevo;
    }

    public Item removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            Node<Item> tmp = first;
            Node<Item> before = null;
            while (tmp.next != null) {
                before = tmp;
                tmp = tmp.next;
            }
            if (before != null) {
                before.next = null;
            }
            return tmp.item;
        }

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        Node<Item> tmp = first;
        int i = 0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        return i;
    }

    public void showList() {

        Node<Item> tmp = first;
        while (tmp != null) {
            System.out.println(tmp.getItem());
            tmp = tmp.next;
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {

        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                return null;
            }
            Item item = current.item;
            current = current.next;
            return item;
        }

    }
}
