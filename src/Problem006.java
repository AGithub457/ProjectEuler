/*
 * Copyright © 2017 Armand Agopian
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

public class Problem006 {
    public static void main(String[] args) {
        int sumSquare = 0;
        int squareSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumSquare += Math.pow(i, 2);

            squareSum += i;
        }

        squareSum = (int) Math.pow(squareSum, 2);
        System.out.println(squareSum - sumSquare);
    }
}
