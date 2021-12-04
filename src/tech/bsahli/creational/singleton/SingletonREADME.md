# Singleton Pattern

## Concepts:

1. Guarantee only one instance will be created
2. Guarantees control of a resource.
3. Lazily loaded (not necessary).

### examples : 
- Runtime environment
- Logger (it could be a factory instead of a singleton)
- Spring Beans
- Graphic Managers

## Design :
![Singleton](https://upload.wikimedia.org/wikipedia/commons/d/dc/Singleton_pattern_uml.png)

- class is responsible for lifecycle
- Static in nature
- not implemented in a static class (because it needs to be thread safe)
- Needs to be thread safe
- Private Instance 
- Private Constructor
- No parameters required for construction (or else it will be a factory pattern)

## Pitfals :(
- often overused (if you make everything singleton it will slow ur app)
- Difficult to unit test.
- if not careful, not thread-safe
- Sometimes confused for Factory
- (not a pitfall) Java.util.Calendar is NOT a Singleton
  - its a Prototype because you get a new instance everytime you call get instance

## Contrast between singleton and factory:
| Singleton      | Factory |
| ----------- | ----------- |
| Return the same instance | Returns Various instances |
| One constructor private with no args| Multiple Constructors |
| No Interface|  Interface driven  |
| |  Adaptable to environment more easily  |

## summary

- guarantee one instance
- Easy to implement
- Solves a well-defined problem
- Don't abuse it
