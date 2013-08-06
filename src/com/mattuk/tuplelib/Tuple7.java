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
 * A Tuple which contains seven objects.
 * @param <T1> The type of the first object.
 * @param <T2> The type of the second object.
 * @param <T3> The type of the third object.
 * @param <T4> The type of the fourth object.
 * @param <T5> The type of the fifth object.
 * @param <T6> The type of the sixth object.
 * @param <T7> The type of the seventh object.
 */
public class Tuple7<T1, T2, T3, T4, T5, T6, T7> implements ITuple {
    public T1 item;
    public T2 item2;
    public T3 item3;
    public T4 item4;
    public T5 item5;
    public T6 item6;
    public T7 item7;

    public Tuple7(T1 item, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7) {
        this.item = item;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
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
                .append(", '")
                .append(item5.getClass().getName())
                .append("' = ")
                .append(item5.toString())
                .append(", '")
                .append(item6.getClass().getName())
                .append("' = ")
                .append(item6.toString())
                .append(", '")
                .append(item7.getClass().getName())
                .append("' = ")
                .append(item7.toString())
                .append("]");
        return builder.toString();
    }

    @Override
    public int size() {
        return 7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple7 tuple7 = (Tuple7) o;

        if (item != null ? !item.equals(tuple7.item) : tuple7.item != null) return false;
        if (item2 != null ? !item2.equals(tuple7.item2) : tuple7.item2 != null) return false;
        if (item3 != null ? !item3.equals(tuple7.item3) : tuple7.item3 != null) return false;
        if (item4 != null ? !item4.equals(tuple7.item4) : tuple7.item4 != null) return false;
        if (item5 != null ? !item5.equals(tuple7.item5) : tuple7.item5 != null) return false;
        if (item6 != null ? !item6.equals(tuple7.item6) : tuple7.item6 != null) return false;
        if (item7 != null ? !item7.equals(tuple7.item7) : tuple7.item7 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = item != null ? item.hashCode() : 0;
        result = 31 * result + (item2 != null ? item2.hashCode() : 0);
        result = 31 * result + (item3 != null ? item3.hashCode() : 0);
        result = 31 * result + (item4 != null ? item4.hashCode() : 0);
        result = 31 * result + (item5 != null ? item5.hashCode() : 0);
        result = 31 * result + (item6 != null ? item6.hashCode() : 0);
        result = 31 * result + (item7 != null ? item7.hashCode() : 0);
        return result;
    }
}
