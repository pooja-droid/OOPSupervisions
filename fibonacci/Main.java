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

public class Main {

  public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%01d\t%d%n", i, f.fib(i));
    }

    FibonacciTable ft = new FibonacciTable();
      for (int j = 0; j <= 10; j++) {
        System.out.printf("%01d\t%d%n", j, ft.fib(j));

    }
  }
}