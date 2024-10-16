# Java Interview Notes

## 1. Difference between Checked and Unchecked Exceptions

### Checked Exceptions
- Checked at compile time
- Must be caught or declared to be thrown
- Examples: `IOException`, `SQLException`
- Subclasses of `java.lang.Exception` (not `RuntimeException`)

### Unchecked Exceptions (Runtime Exceptions)
- Not checked at compile time
- Do not need to be caught or declared
- Examples: `NullPointerException`, `IllegalArgumentException`
- Subclasses of `java.lang.RuntimeException`

## 2. Difference between StringBuilder and StringBuffer

### StringBuilder
- Mutable, not thread-safe
- Faster, not synchronized
- Use in single-threaded environments for performance

### StringBuffer
- Mutable, thread-safe
- Slower, synchronized
- Use in multi-threaded environments or when thread safety is needed

## 3. How Spring Boot supports RESTful APIs

- Spring MVC for RESTful APIs
- Annotations like `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`
- `@ComponentScan` for automatic component scanning
- `@Configuration` for explicit bean definitions
- Spring Data REST for CRUD operations
- Spring HATEOAS for hypermedia-driven APIs

## 4. Difference between @ComponentScan and @Configuration in Spring

### @ComponentScan
- Scans for Spring-managed components
- Used to specify packages for component scanning
- Automatic registration of components

### @Configuration
- Defines configuration classes with `@Bean` methods
- Manual bean definition and configuration
- Often used with `@ComponentScan`

## 5. Role of the `run()` method in multithreading

- `run()` method in the `Runnable` interface
- Defines the task to be executed in a separate thread
- Invoked when the thread starts
- `start()` method initiates execution of `run()` method in a new thread

## 6. Method overloading and method overriding

### Method Overloading
- Multiple methods with the same name but different parameters
- Enhances code readability and reusability
- Decision based on method signature at compile-time

### Method Overriding
- Subclass provides specific implementation of a method defined in superclass
- Dynamic polymorphism, decision at runtime
- Same method signature in both superclass and subclass

## 7. Explanation of @Repository, @Component, @Service annotations in Spring

### @Repository
- Specialized `@Component` for DAO classes
- Handles persistence-related exceptions
- Used for database access classes

### @Component
- General-purpose annotation for Spring-managed components
- Used for utility, helper, or infrastructure concerns

### @Service
- Indicates a service component in the business logic layer
- Specialized `@Component` for service-layer classes
- Used for business logic, transaction management, etc.

## 8. Explanation of synchronization in Java

- Control access to shared resources in multithreaded environment
- Prevent data corruption and ensure consistency
- `synchronized` keyword for mutual exclusion
- `volatile` keyword for visibility
- `Lock` interface for more advanced locking

## 9. Explanation of HashMap in Java

- Data structure implementing the Map interface
- Stores key-value pairs for fast retrieval
- No duplicate keys allowed
- O(1) performance for basic operations
- Used for quick lookup and storage of data

## 10. Explanation of 10th, 12th, and Graduation

- **10th (SSLC or equivalent)**: Secondary School Leaving Certificate
- **12th (PUC or equivalent)**: Pre-University Course or Higher Secondary Examination
- **Graduation**: Completion of a Bachelor's degree program

