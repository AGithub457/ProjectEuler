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

fun main(args: Array<String>) {
    var i = 1
    var i2 = 1
    var tally = 0

    while (i <= 4000000) {
        if (i % 2 == 0) tally += i

        val z = i + i2
        i = i2
        i2 = z
    }

    println(tally)
}