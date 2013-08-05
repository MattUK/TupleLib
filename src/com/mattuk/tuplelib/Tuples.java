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
 * A class containing factory functions for creating different size Tuples.
 */
public abstract class Tuples {

    public static<T1> Tuple<T1> tuple(T1 item) {
        return new Tuple<T1>(item);
    }

    public static<T1, T2> Tuple2<T1, T2> tuple(T1 item1, T2 item2) {
        return new Tuple2<T1, T2>(item1, item2);
    }

    public static<T1, T2, T3> Tuple3<T1, T2, T3> tuple(T1 item, T2 item2, T3 item3) {
        return new Tuple3<T1, T2, T3>(item, item2, item3);
    }

    public static<T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> tuple(T1 item, T2 item2, T3 item3, T4 item4) {
        return new Tuple4<T1, T2, T3, T4>(item, item2, item3, item4);
    }

    public static<T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> tuple(T1 item, T2 item2, T3 item3, T4 item4, T5 item5) {
        return new Tuple5<T1, T2, T3, T4, T5>(item, item2, item3, item4, item5);
    }

    public static<T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> tuple(T1 item, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6) {
        return new Tuple6<T1, T2, T3, T4, T5, T6>(item, item2, item3, item4, item5, item6);
    }

    public static<T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> tuple(T1 item, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7) {
        return new Tuple7<T1, T2, T3, T4, T5, T6, T7>(item, item2, item3, item4, item5, item6, item7);
    }

    public static<T1, T2, T3, T4, T5, T6, T7, TRest> Tuple8<T1, T2, T3, T4, T5, T6, T7, TRest> tuple(T1 item, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, TRest rest) {
        return new Tuple8<T1, T2, T3, T4, T5, T6, T7, TRest>(item, item2, item3, item4, item5, item6, item7, rest);
    }

}
