# Welcome to JLox: A Dynamically Typed Scripting Language

JLox is a versatile and dynamically typed scripting language that offers a rich set of features to simplify your coding experience. From error detection to scoping and inheritance, JLox empowers developers to build expressive and powerful applications with ease. Every statement in JLox is elegantly terminated by a semicolon, ensuring clean and organized code.

## Variable declaration and Instantiation
In JLox, variable declaration is straightforward using the ```var``` keyword. Let's see an example:

```
  Var printThree = 3;
  print(printThree);
```
Will output ```3```.

## Function declarations
Functions are a fundamental building block in JLox, and they are declared using the ```fun``` keyword. The ```return``` keyword is used to return values from functions. Let's explore an example:

```
  fun deductThree(n) {
    return n-3;
  }

  print(deductThree(5));
```
Will output ```2```

## For and While loops
Lox supports both ```for``` and ```while``` loops, following the familiar Java syntax. Let's take a look at examples of both:
```
  var s = "*";
  for(var i = 3; i > 0; i = i-1){
    print(s);
    s = s + "*";
  }
```
Will output:
```
*
**
***
```


```
var i = 3;
var s = "*";
while(i>0){
    print(s);
    s = s + "*";
    i=i-1;
}
```
Will output:

```
*
**
***
```


## "if" and "else" statements
JLox allows you to evaluate the "truthfulness" of statements using ```if``` and ```else``` constructs. Check out the example below:
```
var n = 5;
var m = 4;
if (n < m) {
    print("5 is less than 4!");
}
else {
    print("4 is less than 5!");
}

```
The above output is:
```
4 is less than 5!
```



## Classes, Objects, and Inheritance
JLox supports object-oriented programming with classes, objects, and inheritance, similar to Java. Here's an example demonstrating inheritance:

```
class A {
    method() {
        print("A method");
    }
}

class B < A {
    method() {
        print("B method");
    }
    test() {
        super.method();
    }
}
class C < B {}
C().test();
```
Will output:

```
A method
```

One can instantiate their own fields within an object
```
class Cake {
    taste() {
        var adjective = "delicious";
        print("The " + this.flavor + " cake is " + adjective + "!");
    }
}
var cake = Cake();
cake.flavor = "German chocolate";
cake.taste();
```
Will output:

```
The German chocolate cake is delicious!
```
Additionally, classes can have initializers defined using the ```init``` keyword:

```
class Foo {
    init() {
        print("Foo");
    }
}
var foo = Foo();
```
Will output:
```
Foo
```
## Setup
Setup is simple!! Run your ```Lox.java``` file with your path to ```lox.txt``` passed as an argument and you're
all set!

## Examples of more complex programs

![Screenshot 2023-07-31 005547.png](Screenshot%202023-07-31%20005547.png)

![Screenshot 2023-07-31 005706.png](Screenshot%202023-07-31%20005706.png)

![Screenshot 2023-07-31 005729.png](Screenshot%202023-07-31%20005729.png)
