# SmartSupplyChain-v2


## Objective:  Mastering Generics, OOP, Collections, Maven, and JUnit 5
### *Real-World Systems Engineering, the Modern Way*

### Project Overview
#### Description
Building the core of SmartSupplyChain, a Java-powered logistics system that models the flow of products 
— from suppliers, through warehouses, to customers — safely, scalably, and fault-tolerantly.

Each module must follow:

- OOP (Encapsulation, Abstraction, Inheritance)
- Generics (Type Safety, Bounded Types, Wildcards)
- Exception Handling (Custom Exceptions, Validation)
- Collections (List, Map)
- Maven (Dependency Management)
- JUnit 5 (Professional Testing)
- System simulation (main() entrypoint)

### Project Structure


Build this structure inside `src/main/java/`:

``` bash

SmartSupplyChain/
 ├── main/
 │    └── SmartSupplyChainApp.java
 ├── items/
 │    ├── Product.java
 │    ├── Perishable.java
 │    ├── Document.java
 │    └── Electronic.java
 ├── inventory/
 │    ├── StorageUnit.java
 │    ├── MultiStorageUnit.java
 │    ├── Package.java
 │    └── Inventory.java
 ├── people/
 │    ├── Person.java
 │    ├── Supplier.java
 │    └── Customer.java
 ├── system/
 │    └── SupplyChainUtils.java
 └── exception/
      ├── ExpiredProductException.java
      ├── EmptyStorageException.java
      └── InvalidInputException.java

```

✅ Using appropriate Java Packages (org.supplychain.items, etc).

✅ Following best OOP practices.

✅ Writing SmartSupplyChainApp.java as the simulation.


