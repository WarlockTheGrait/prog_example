/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.spbu.datastructures.queue;

import com.spbu.datastructures.Entry;
import com.spbu.datastructures.linked.SinglyLinkedList;

/**
 * Interface for the adaptable priority queue ADT. The Entry instance
 * returned by the insert method can later be used to remove the
 * entry, or to modify that entry's key or value.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public interface AdaptablePriorityQueue<K,V> extends PriorityQueue<K,V> {

  /**
   * Removes the given entry from the priority queue.
   *
   * @param entry  an entry of this priority queue
   * @throws IllegalArgumentException if e is not a valid entry for the priority queue.
   */
  void remove(Entry<K, V> entry) throws IllegalArgumentException;

  /**
   * Replaces the key of an entry.
   *
   * @param entry  an entry of this priority queue
   * @param key    the new key
   * @throws IllegalArgumentException if e is not a valid entry for the priority queue.
   */
  void replaceKey(Entry<K, V> entry, K key) throws IllegalArgumentException;

  /**
   * Replaces the value of an entry.
   *
   * @param entry  an entry of this priority queue
   * @param value  the new value
   * @throws IllegalArgumentException if e is not a valid entry for the priority queue.
   */
  void replaceValue(Entry<K, V> entry, V value) throws IllegalArgumentException;

  /**
   * Realization of a FIFO queue as an adaptation of a SinglyLinkedList.
   * All operations are performed in constant time.
   *
   * @author Michael T. Goodrich
   * @author Roberto Tamassia
   * @author Michael H. Goldwasser
   * @see SinglyLinkedList
   */
  class LinkedQueue<E> implements Queue<E> {

    /** The primary storage for elements of the queue */
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();   // an empty  list

    /** Constructs an initially empty queue. */
    public LinkedQueue() { }                  // new queue relies on the initially empty list

    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue
     */
    @Override
    public int size() { return list.size(); }

    /**
     * Tests whether the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() { return list.isEmpty(); }

    /**
     * Inserts an element at the rear of the queue.
     * @param element  the element to be inserted
     */
    @Override
    public void enqueue(E element) { list.addLast(element); }

    /**
     * Returns, but does not remove, the first element of the queue.
     * @return the first element of the queue (or null if empty)
     */
    @Override
    public E first() { return list.first(); }

    /**
     * Removes and returns the first element of the queue.
     * @return element removed (or null if empty)
     */
    @Override
    public E dequeue() { return list.removeFirst(); }

    /** Produces a string representation of the contents of the queue.
     *  (from front to back). This exists for debugging purposes only.
     */
    public String toString() {
      return list.toString();
    }
  }

  /**
   * Interface for a queue: a collection of elements that are inserted
   * and removed according to the first-in first-out principle. Although
   * similar in purpose, this interface differs from java.util.Queue.
   *
   * @author Michael T. Goodrich
   * @author Roberto Tamassia
   * @author Michael H. Goldwasser
   */
  interface Queue<E> {
    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue
     */
    int size();

    /**
     * Tests whether the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Inserts an element at the rear of the queue.
     * @param e  the element to be inserted
     */
    void enqueue(E e);

    /**
     * Returns, but does not remove, the first element of the queue.
     * @return the first element of the queue (or null if empty)
     */
    E first();

    /**
     * Removes and returns the first element of the queue.
     * @return element removed (or null if empty)
     */
    E dequeue();
  }
}
