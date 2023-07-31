# Welcome to my scripting language JLox!

Lox is a dynamically typed scripting language that has basic functionality such as: error detection, Scoping, Inheritance, and so much more! Below is a somewhat comprehensive list
of Lox's features. Note, every statement is terminated by a semicolon.

## Variable declaration and Instantiation
You declare variables using the "var" keyword.

```
  Var printThree = 3;
  print(printThree);
```
Will output ```3```.

## Function declarations
Functions are declared using the "fun" keyword and values are returned using the return keyword.

```
  fun deductThree(n) {
    return n-3;
  }

  print(deductThree(5));
```
Will output ```2```

## For and While loops
Both For loops and While loops are java styled
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
JLox can interpret the "truthfulness" of a statement such as:
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
Below is a snippet showcasing inheritance (Inheritance in JLox behaves like
Inheritance in java):

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
Will output

```
The German chocolate cake is delicious!
```
Additionally, classes take an initializer with keyword init:

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
Setup is simple!! Run your Lox.java file with your path to lox.txt passed as an argument and you're
all set!

## Examples of more complex programs

![Screenshot 2023-07-31 005547.png](Screenshot%202023-07-31%20005547.png)

![Screenshot 2023-07-31 005706.png](Screenshot%202023-07-31%20005706.png)

![Screenshot 2023-07-31 005729.png](Screenshot%202023-07-31%20005729.png)