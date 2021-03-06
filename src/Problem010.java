/*
 * Copyright © 2016-2018 Armand Agopian
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

public class Problem010 {
    public static void main(String[] args) {
        int max = 2000000;
        long sum = 0;

        for (int i = 1; i < max; i++) {
            if (Utility.isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
