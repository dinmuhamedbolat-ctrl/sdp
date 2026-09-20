# Assignment 2: Factory Method & Abstract Factory

**Course:** ShP-2216 – Software Design Patterns
**Topic:** Cloud Provider Service Families (AWS & Google Cloud) - Option C

## Overview
This project demonstrates the implementation of two creational design patterns in Java:
1. **Factory Method:** Used to create a single product (`Storage`), allowing subclasses to alter the type of objects that will be created (e.g., `S3Storage` vs `GCSStorage`).
2. **Abstract Factory:** Used to create families of related objects (`Storage` and `Compute` components for AWS and GCP) without specifying their concrete classes. This ensures absolute compatibility between products in the same family.

## Project Structure
- `Storage` and `Compute` interfaces (Abstract Products)
- `StorageFactory` (Factory Method Creator)
- `CloudFactory` (Abstract Factory interface)
- Concrete implementations for AWS (`S3Storage`, `EC2Compute`) and Google Cloud (`GCSStorage`, `GCECompute`).
- `Application` (Client code)

## Clean Code Principles Applied
- Meaningful naming conventions
- Elimination of type-checking logic in client code via polymorphism
- Small, single-purpose factory methods
- Dependency inversion (client depends on abstractions)

## How to run
Compile and run the `Application.java` file. The entry point (`main` method) configures the factory and demonstrates how the client uses the abstract factory to deploy cloud infrastructure consistently.