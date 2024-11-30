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

/** A class to compute Fibonacci numbers using a simple recursive approach. */
class Fibonacci {

  /**
   * Compute a Fibonacci number.
   *
   * @param i the index in the Fibonacci sequence
   * @return the Fibonacci number for this index
   */
  int fib(int i) {
    if (i == 0) {
      return 0;
    } else if ((i <= 2) & (i > 0)) {
      return 1;
    } else if (i > 2) {
      return fib(i - 1) + fib(i - 2);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
