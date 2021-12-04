# Singleton Pattern

## Concepts:

1. Only one instance will be created
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
