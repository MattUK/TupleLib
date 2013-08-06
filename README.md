TupleLib
========

A Tuple library for Java, inspired by the C# implementation.

What is a Tuple?
----------------

A Tuple is a collection of objects, each with a potentially different type. Unlike Arrays or Collections, Tuples
allow you to store Integers, Strings, and Objects all within the same container.

Why use Tuples?
---------------

Tuples are a standard language feature in many new and modern programming languages. .NET provides an implementation
to C# and Visual Basic, C++ has an implementation, D includes them, and more functional languages such as Python, Scala,
etc, include them as part of the core language.

They are useful for returning multiple values from a function, or as a neat container of objects without having to
define a new class to contain them.

Usage
-----

To create a new Tuple object, simply choose the desired size (for anything above or equal to 8, choose Tuple8),
and create it with one of the static factory methods defined in the Tuples class.

```java
// For a Tuple of 2 objects
Tuple2<String, Integer> twoLengthTuple = Tuples.tuple("Hello, World!", 1024);

// For a Tuple of 10 objects
Tuple8<Integer, Boolean, String, Integer, Float, String, Integer, Tuple2<String, String>> tenLengthTuple =
  Tuples.tuple(3, false, "Universe", 42, 3.0f, "Hello", 98, Tuples.tuple("Hello, ", "World!"));
```
In order to access items from Tuple objects, simply reference the 'item' values stored within them.

```java
// Extract the integer from twoLengthTuple
int i = twoLengthTuple.item2; // 1024

// Extract the last item from tenLengthTuple
String s = tenLengthTuple.rest.item2; // "World!"
```

Furthermore, whilst there are different classes for different length Tuples, they all implement the single ITuple
interface. This interface is mainly for convenience, and allows you to check the size of the Tuple it represents
with the size() function.
