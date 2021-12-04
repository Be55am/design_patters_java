# Builder Pattern

its a pattern that people often use and rarely create their own,
it is a great pattern for handeling the construction of objects that may contain a lot of parameters,
and we want to make the objects immutable when we are done constructing it.

## Concepts
 - handles Complex constructors 
 - Large number of parameters.
 - Immutability

### Examples
- StringBuilder
- DocumentBuilder
- Locale.builder

## Design
can't find a better design
![Singleton](https://media.geeksforgeeks.org/wp-content/uploads/uml-of-builedr.jpg)

- Flexibility over telescoping constructors (mutliple constructors with different params)
- Static inner class
- Calls appropriate constructor
- Negates the need for exposed setters (which is an anti-pattern)
- Java 1.5+ can take advantage of Generics

## Pitfalls :
Not really a big pitfalls 
- Immutable
- Inner static class
- Designed first
- Complexity

## Constrast
| Builder      | Prototype |
| ----------- | ----------- |
| Handles Complex constructors | Implemented around a clone |
| No interface required |Avoids calling complex constructors  |
| Can be a separate class |  |
| Works with legacy code | Difficult to implement in legacy code |

## Summary

- Creative way to deal with complexity
- Easy to implement
- Few drawbacks
- Can refactor in with separate class
