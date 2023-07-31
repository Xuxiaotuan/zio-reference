## Intorductuion
ZIO contains a few data types that can help you solve complex problems
in asynchronous and concurrent programming. ZIO data categorize into 
these sections:
1. Core Data Types
2. Contextual Data Types
3. State Management
4. Concurrency
   - Fiber Primitives
   - Concurrency Primitives
   - Synchronization Aids
   - STM
5. Resource Management
6. Streaming
7. Metrics
8. Testing
9. Miscellaneous

## Core Data Types
- **ZIO** - ZIO is a value that models an effectful program, which might fail or succed.
  - **UIO** - UIO[A] is a type alias for ZIO[Any, Nothing, A].
  - **URIO** - URIO[A] is a type alias for ZIO[R, Nothing, A].
  -  Task
  - RIO
  - IO