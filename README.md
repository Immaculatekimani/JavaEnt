# JavaEnt 

## Working with OOP Concepts
This small project showcases the implementation of OOP concepts using Java. 
These concepts allow us to follow the Single Responsibility Principle where a class performs only one task or purpose.

### Inheritance
Allows child class(subclass/derived class) to inherit attributes (properties) and behaviour(methods) of a parent class (super class/base class)
The child inherits a super class by using the **extends** keyword. 
```java
public class DigitalCamera extends ElectronicDevice {

    @Override
    public void powerOn() {
        System.out.println("Camera turned on!");
    }
}
```
A child class can override methods in the super class as a form of **polymorphism**.
```java
 ElectronicDevice canon = new DigitalCamera();
        canon.powerOn(); // calling method override
```
The above will print _Camera turned on_ and not _Device switched on_ as it was implimented in the parent class.
```java
public class ElectronicDevice {

    public void powerOn(){
        System.out.println("Device switched on");
    } ... }
    
```

### Polymorphism
This means more than one form. The same entity can perform different operations in different scenarios. Under inheritance explanation 
above we have achieved polymorphism through overriding. This is a **runtime polymorphism**.

Polymorphism can also be achieved through method overloading and in this case we are using a method with the same name and different parameters thus overloading it.
```java
 public void makeCall(){
        System.out.println("A call is in progress");
    }

    public void makeCall(String callerName){
        System.out.println("You are calling "+ callerName);
    }
```
Whether the makeCall() method is called with or without a parameter, it will function accordingly. This is a **compile-time polymorphism**
```java
public class PolymorphismDemo {
    public void useOverload() {
        SmartPhone samsung = new SmartPhone();
        samsung.makeCall("Susan"); // with parameters
        samsung.makeCall(); //without parameters
    }
}
```
### Abstraction
This allows hiding of unnecessary information and provide only the needed information. A method that  does not have its body is an abstract method.
The following is an abstract method that was used:

```java
public abstract void style();
```
This method could only be implemented inside an abstract class.

```java
public abstract class HairStyle { ... }
```

When another class inherits the abstract class, the abstract method must be implemented through overriding.
```java
 @Override
    public void style() {
        System.out.println("Doing this haircut: " + getStyleName());
    }
```
When an abstract class object is created, the abstract methods for the abstract class must be implemented as well.
```java
 HairStyle conrows = new HairStyle("Short conrows") {
            @Override
            public void style() {
                System.out.println("I love doing: " + getStyleName());
            }
        };
        conrows.style();
```
Abstraction allows different classes and objects to have different implementation of the abstract method. This is **Polymorphism**

### Interfaces
An interface is a fully abstract class. It holds abstract methods -> without a body.
```java
public interface Updo {
    public void makePonytail();

}
```
An interface is used in a class through the **implements** keyword. The class has to implement the abstract methods by overriding.

```java
import com.java.ent.abstractionandinterface.HairStyle;

public class Braid extends HairStyle implements Updo {

    @Override
    public void makePonytail() {
        System.out.println("Add a ponytail to the braid");
    }
}
```
**Interface segregation principle** states that no code should be forced to depend on methods it does not use.

A braid hairstyle can have a ponytail but a haircut cannot. This is why we do not include the makePonytail() method in the parent class Hairstyle since braid and Haircut are its child classes. We are choosing to select only what applies for the Haircut class which can be applying a Dye.
```java
public class HairCut extends HairStyle implements Dye {
   
    ...

    @Override
    public void changeColor(String colorName) {
        System.out.println("Apply "+colorName+" color to the "+getStyleName());
    }
}
```

### Encapsulation
Involves grouping related fields and methods in a single class. It also allows to change the accessibility of some methods and fields in a class.
```java
public abstract class HairStyle {
    private String styleName;

    

    public String getStyleName() {
        return styleName;
    } ... }

```
The styleName string is inaccessible since it is **private**. the getter method provides read-only access to the string.
Encapsulation also allows us to achieve clean code and improve readability.

