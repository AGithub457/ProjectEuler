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

/**
 * Created by Armand on 11/12/16.
 */
public class Project2 {
    public static void main(String[] args) {
        int i = 1, i2 = 1, tally = 0;

        while (i <= 4000000) {
            if (i % 2 == 0)
                tally += i;
            int z = i + i2;
            i = i2;
            i2 = z;
        }
        System.out.println(tally);
    }
}
