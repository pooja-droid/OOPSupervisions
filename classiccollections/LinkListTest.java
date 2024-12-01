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

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.NoSuchElementException;

@RunWith(JUnit4.class)
public class LinkListTest {

  @Test
  public void linkList_toStringIsEmptyList_whenListEmpty() {
    // ARRANGE
    LinkList empty = new LinkList();

    // ACT
    String value = empty.toString();

    // ASSERT
    assertThat(value).isEqualTo("[]");
  }

  @Test
  public void linkList_toStringIsSingleItem_whenListContainsOneItem() {
    // ARRANGE
    LinkList list = new LinkList();
    list.addFirst(1);

    // ACT
    String value = list.toString();

    // ASSERT
    assertThat(value).isEqualTo("[1]");
  }

  @Test
  public void linkList_toStringIsTwoThenOne_whenListHasOneThenTwoAdded() {
    // ARRANGE
    LinkList list = new LinkList();
    list.addFirst(1);
    list.addFirst(2);

    // ACT
    String value = list.toString();

    // ASSERT
    assertThat(value).isEqualTo("[2,1]");
  }

  @Test
  public void linkList_createEmptyList_whenListIsEmpty() {
    // ARRANGE
    int[] elements = {};
    LinkList list = LinkList.create(elements);

    // ACT
    String value = list.toString();

    // ASSERT
    assertThat(value).isEqualTo("[]");
  }

  @Test
  public void linkList_createLinkList_whenNonEmptyArray() {
    // ARRANGE
    int[] elements = {1, 2, 3, 4};
    LinkList list = LinkList.create(elements);

    // ACT
    String value = list.toString();

    // ASSERT
    assertThat(value).isEqualTo("[1,2,3,4]");

  }

  @Test
  public void linkList_removesFirstElement_whenNonEmptyList() {
    // ARRANGE
    LinkList list = new LinkList();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);

    // ACT
    list.removeFirst();
    String value = list.toString();

    // ASSERT
    assertThat(value).isEqualTo("[2,1]");
  }

  @Test
  public void linkList_removeFirstThrowsException_whenEmptyList() {
    // ARRANGE
    LinkList list = new LinkList();

    // ACT
    // ASSERT
    assertThrows(NoSuchElementException.class, () -> list.removeFirst());

  }

  @Test
  public void linkList_getThrowsException_whenEmptyList() {
    // ARRANGE
    LinkList list = new LinkList();

    // ACT
    // ASSERT
    assertThrows(NoSuchElementException.class, () -> list.get(1));

  }

  @Test
  public void linkList_getReturnsNthElement_whenNAndList() {
    // ARRANGE
    LinkList list = new LinkList();
    list.addFirst(5);
    list.addFirst(6);
    list.addFirst(7);

    // ACT
    int value = list.get(0);

    // ASSERT
    assertThat(value).isEqualTo(7);
  }

  @Test
  public void linkList_getThrowsException_whenOutOfRangeN() {
    // ARRANGE
    LinkList list = new LinkList();
    list.addFirst(5);
    list.addFirst(6);
    list.addFirst(7);

    // ACT
    // ASSERT
    assertThrows(NoSuchElementException.class, () -> list.get(8));
  }

  @Test
  public void linkList_lengthReturns0_forEmptyList() {
    // ARRANGE
    LinkList list = new LinkList();

    // ACT
    int value = list.length();

    // ASSERT
    assertThat(value).isEqualTo(0);
  }

  @Test
  public void linkList_lengthReturnsLength_forNonEmptyList() {
    // ARRANGE
    LinkList list = new LinkList();
    list.addFirst(5);
    list.addFirst(6);
    list.addFirst(7);
    list.addFirst(8);

    // ACT
    int value = list.length();

    // ASSERT
    assertThat(value).isEqualTo(4);
  }
}