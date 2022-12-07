The double colon `( :: )` operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class
directly. They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct reference to the method by
name instead of providing a delegate to the method.

Method reference or double colon operator can be used to refer:

- A static method: `(ClassName::methodName)`
- An instance method: `(objectOfClass::methodName)`
- A constructor: `(super::methodName)`
