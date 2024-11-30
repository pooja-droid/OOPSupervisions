/*
 * Copyright 2024 Andrew Rice <acr31@cam.ac.uk>, P.S. Gada
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

package uk.ac.cam.psg36.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

@RunWith(JUnit4.class)
public class FibonacciTableTest {

  @Test
  public void fib_makesUseOfCache() {
    // Hint: use CountingMap!
    // ARRANGE
    CountingMap countMap = new CountingMap();
    FibonacciTable fibonacci = new FibonacciTable(countMap);

    // ACT
    int result = fibonacci.fib(10);

    // ASSERT
    assertThat(result).isEqualTo(55);
    assertThat(countMap.getCounter()).isLessThan(10);
  }

  @Test
  public void fib_throwsIllegalArgumentException_forMinus1() {
    // ARRANGE
    FibonacciTable fibonacci = new FibonacciTable();

    // ACT
    // ASSERT
    assertThrows(IllegalArgumentException.class, () -> fibonacci.fib(-1));
  }

  @Test
  public void fib_return0_for0() {
    // ARRANGE
    FibonacciTable fibonacci = new FibonacciTable();

    // ACT
    int result = fibonacci.fib(0);

    // ASSERT
    assertThat(result).isEqualTo(0);
  }

}
