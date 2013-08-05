/**
 The MIT License (MIT)

 Copyright (c) 2013 Matthew W. Carter

 Permission is hereby granted, free of charge, to any person obtaining a copy of
 this software and associated documentation files (the "Software"), to deal in
 the Software without restriction, including without limitation the rights to
 use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 the Software, and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.mattuk.tuplelib;

/**
 * A Tuple which contains two objects.
 * @param <T1> The type of the first object.
 * @param <T2> The type of the second object.
 */
public class Tuple2<T1, T2> implements ITuple {
    public T1 item;
    public T2 item2;

    public Tuple2(T1 item, T2 item2) {
        this.item = item;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append("Tuple['")
                .append(item.getClass().getName())
                .append("' = ")
                .append(item.toString())
                .append(", '")
                .append(item2.getClass().getName())
                .append("' = ")
                .append(item2.toString())
                .append("]");
        return builder.toString();
    }

    @Override
    public int size() {
        return 2;
    }
}
