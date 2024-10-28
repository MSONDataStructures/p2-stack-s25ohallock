# <code>DSp2Stack</code> Stack Implementation Project

For this assignment you will implement a last-in-first-out (LIFO) stack structure.

The data in the stack will be stored in `Node` objects,
with each node storing a data element of type `T`,
and a reference to the next node. For this project, a `Node`
class has been provided, but you can choose to modify this project structure.

The goal of this project is to implement this interface, so you may not
use Java library stack implementations, such as `java.util.Vector`,
`java.util.Deque` implementations, or the Java Collections Framework.

This short project is similar to the linked list implementation that you built
for the previous project, with `push` replacing `addFirst`, and `pop` replacing
`delete` with index 0. You will again be expected to check for null exceptions.

This project uses generic types, represented by the type parameter `T`
(but you can change that variable if you like). This means that you stack
should work with any object type - you should not assume in your code
that `T` stands for `String` or `Integer` or `Rectangle`, but rather that
it could be any of those types and more.

You can find some more explanations and examples in section 4.4 of *Java
Software Structures*, and more about generics in the Oracle documentation
at [Java Tutorials: Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
