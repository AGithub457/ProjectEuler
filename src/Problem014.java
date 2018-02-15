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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Problem014 {
    public static void main(String[] args) {

        ArrayList<BigInteger> arrIndex = new ArrayList<BigInteger>();
        //arrIndex.add(BigInteger.ONE);

        for (int n = 1; n < 1000001; n++) {
            arrIndex.add(getIndex(BigInteger.valueOf(n)));
        }

        BigInteger val = Collections.max(arrIndex);
        int valIndex = arrIndex.indexOf(val) + 1;

        System.out.println("Max value: " + val);
        System.out.println("Max index: " + valIndex);
    }

    static BigInteger getIndex(BigInteger n) {
        boolean isOne = false;
        BigInteger index = BigInteger.ONE;

        while (!isOne) {
            if (n.equals(BigInteger.ONE)) {
                isOne = true;
            } else {
                n = result(n);
                index = index.add(BigInteger.ONE);
            }
        }

        return index;
    }

    static BigInteger result(BigInteger num) {
        BigInteger n;

        if (num.mod(BigInteger.valueOf(2)) == BigInteger.ZERO) {
            n = num.divide(BigInteger.valueOf(2));
        } else {
            n = num.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
        }

        return n;
    }
}
