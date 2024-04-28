# Order Processing System
Description
This project implements an order processing system that follows the SOLID principles of object-oriented design. The system is responsible for handling various aspects of order processing, including placing orders, generating invoices, sending notifications, and calculating totals.

# Problem Statement
The existing codebase for the order processing system violates the SOLID principles, particularly the Single Responsibility Principle (SRP) and the Interface Segregation Principle (ISP). The Order interface is too broad, and the OrderAction class is responsible for implementing all the methods defined in the interface, even though it might not need all of them.

# Refactoring Approach
To address the issues with the existing codebase and adhere to SOLID principles, the following refactoring approach was taken:

# Splitting Interfaces: The Order interface was split into smaller, more cohesive interfaces, each responsible for a single aspect of the order processing system.
# Implementing Separate Classes: Concrete implementations were provided for each interface, ensuring that each class has a single responsibility.
# Client Usage: The client code (OrderTest) was updated to use the new interfaces and classes accordingly.
