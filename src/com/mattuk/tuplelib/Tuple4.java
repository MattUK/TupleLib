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
 * A Tuple which contains four objects.
 * @param <T1> The type of the first object.
 * @param <T2> The type of the second object.
 * @param <T3> The type of the third object.
 * @param <T4> The type of the fourth object.
 */
public class Tuple4<T1, T2, T3, T4> implements ITuple {
    public T1 item;
    public T2 item2;
    public T3 item3;
    public T4 item4;

    public Tuple4(T1 item, T2 item2, T3 item3, T4 item4) {
        this.item = item;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
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
                .append(", '")
                .append(item3.getClass().getName())
                .append("' = ")
                .append(item3.toString())
                .append(", '")
                .append(item4.getClass().getName())
                .append("' = ")
                .append(item4.toString())
                .append("]");
        return builder.toString();
    }

    @Override
    public int size() {
        return 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple4 tuple4 = (Tuple4) o;

        if (item != null ? !item.equals(tuple4.item) : tuple4.item != null) return false;
        if (item2 != null ? !item2.equals(tuple4.item2) : tuple4.item2 != null) return false;
        if (item3 != null ? !item3.equals(tuple4.item3) : tuple4.item3 != null) return false;
        if (item4 != null ? !item4.equals(tuple4.item4) : tuple4.item4 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = item != null ? item.hashCode() : 0;
        result = 31 * result + (item2 != null ? item2.hashCode() : 0);
        result = 31 * result + (item3 != null ? item3.hashCode() : 0);
        result = 31 * result + (item4 != null ? item4.hashCode() : 0);
        return result;
    }
}
