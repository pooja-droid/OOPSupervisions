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

public class Main {

  public static void main(String[] args) {
    LinkList list = new LinkList();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    System.out.println(list);
  }
}