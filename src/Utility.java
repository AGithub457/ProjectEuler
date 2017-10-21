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

public class Utility {
    public static boolean isPrime(long n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        String first = Integer.toString(n);
        String second = new StringBuilder(first).reverse().toString();

        return first.equals(second);

    }

    public static boolean isPalindrome(String s) {
        String second = new StringBuilder(s).reverse().toString();

        return s.equals(second);

    }
}
