/*
 * Copyright 2024 Ben Philps <bp413@cam.ac.uk>, Andrew Rice <acr31@cam.ac.uk>, P.S. Gada
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.psg36.linkedlists;

import java.util.NoSuchElementException;


public class LinkList {

  private static class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    Node(int value) {
      this.value = value;
      this.next = null;
    }

    @Override
    public String toString() {
      if (next == null) {
        return String.valueOf(value);
      }
      return value + "," + next;
    }
  }

  private Node head;

  LinkList() {
    this.head = null;
  }

  public static LinkList create(int[] elements) {
    LinkList list = new LinkList();
    for (int i = elements.length - 1; i >= 0; i--) {
      list.addFirst(elements[i]);
    }
    return list;
  }

  public void addFirst(int element) {
    if (head == null) {
      head = new Node(element);
    } else {
      head = new Node(element, head);
    }
  }

  public int removeFirst() {
    if (head == null) {
      throw new NoSuchElementException();
    } else {
      int value = head.value;
      head = head.next;
      return value;
    }
  }

  public int get(int n) {
    if (head == null) {
      throw new NoSuchElementException();
    } else {
      int value = 0;
      Node current = head;
      for (int i = 0; i <=n; i++) {
        try {
          value = current.value;
          current = current.next;
        } catch (NullPointerException e) {
          throw new NoSuchElementException();
        }
      }
      return value;
    }
  }

  public int length() {
    if (head == null) {
      return 0;
    } else {
      int length = 1;
      Node current = head;
      while (current.next != null) {
        length++;
        current = current.next;
      }
      return length;
    }
  }

  @Override
  public String toString() {
    return String.format("[%s]", head == null ? "" : head.toString());
  }
}
