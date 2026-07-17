# 🌳 Hierarchical Inheritance in Java

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/OOP-Hierarchical%20Inheritance-blue?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

# 📚 Project Overview

This project demonstrates **Hierarchical Inheritance** in Java.

Hierarchical Inheritance occurs when **multiple child classes inherit from one parent class**. Each child receives the parent's variables and methods while maintaining its own unique properties and behaviors.

This example uses one **Parent2** class and two child classes (**Child2** and **Child3**) to demonstrate how inheritance allows code reuse while supporting different child implementations. :contentReference[oaicite:0]{index=0}

---

# 🧬 What is Hierarchical Inheritance?

Hierarchical Inheritance means:

> **One Parent Class → Multiple Child Classes**

Every child inherits the common features from the parent while adding its own unique characteristics.

---

# 🖼 Class Diagram

```text
                     Parent2
          ┌─────────────────────────┐
          │ familyCar = "Toyota"    │
          │ greet()                 │
          └─────────────┬───────────┘
                        │
             ┌──────────┴──────────┐
             │                     │
             ▼                     ▼
      ┌──────────────┐      ┌─────────────────┐
      │   Child2     │      │    Child3       │
      │ hobby        │      │ favouriteSport  │
      │ child2Method │      │ child3Method()  │
      └──────────────┘      └─────────────────┘
```

---

# 🏗 Project Structure

```
day8
│
├── Parent2
│      ├── familyCar
│      └── greet()
│
├── Child2
│      ├── hobby
│      └── child2Method()
│
├── Child3
│      ├── favouriteSport
│      └── child3Method()
│
└── HierarchicalInheritanceExample
```

---

# 🧠 Learning Objectives

After completing this project you will understand:

- ✅ What Hierarchical Inheritance is
- ✅ How multiple child classes inherit from one parent
- ✅ How inherited methods are shared
- ✅ How inherited variables are reused
- ✅ How child classes can have unique variables and methods
- ✅ Object creation using the **new** keyword

---

# 💻 Java Concepts Used

- ☕ Classes
- 🧬 Inheritance
- 👨‍👧 Parent Class
- 👦 Child Classes
- 📦 Objects
- 🔄 Method Calls
- 📚 Variables
- 🖨 Console Output

---

# 🔍 Code Walkthrough

## Step 1

Create the Parent class

```java
class Parent2
```

The parent contains:

- 🚗 familyCar
- 👋 greet()

These members become available to every child class. :contentReference[oaicite:1]{index=1}

---

## Step 2

Create Child2

```java
class Child2 extends Parent2
```

Child2 inherits:

- familyCar
- greet()

and adds:

- hobby
- child2Method() :contentReference[oaicite:2]{index=2}

---

## Step 3

Create Child3

```java
class Child3 extends Parent2
```

Child3 also inherits:

- familyCar
- greet()

and adds:

- favouriteSport
- child3Method() :contentReference[oaicite:3]{index=3}

---

## Step 4

Create Objects

```java
Child2 obj2 = new Child2();

Child3 obj3 = new Child3();
```

Each object has access to:

Its own members

PLUS

Everything inherited from Parent2. :contentReference[oaicite:4]{index=4}

---

# 🔄 Program Flow

```
Create Parent2
        │
        ▼
Create Child2 & Child3
        │
        ▼
Create Objects
        │
        ▼
Access Child Variables
        │
        ▼
Call Child Methods
        │
        ▼
Access Parent Variables
        │
        ▼
Call Parent Methods
```

---

# ▶ Sample Output

```
Painting
This is Child2
Toyota
Hello from Parent2
Toyota
Hello from Parent2
```

---

# 🌎 Real-World Example

Imagine a family.

👨 **Parent**

Owns:

- 🚗 Toyota
- 👋 Greeting

Two children inherit from the same parent.

👧 Child2

Owns:

- 🎨 Painting hobby

Also inherits:

- 🚗 Toyota
- 👋 Greeting

---

👦 Child3

Owns:

- ⚽ Favorite sport

Also inherits:

- 🚗 Toyota
- 👋 Greeting

Each child has its own personality while sharing common characteristics from the parent.

---

# 🎯 Key Takeaways

✅ One Parent Class

✅ Multiple Child Classes

✅ Code Reusability

✅ Less Duplicate Code

✅ Easier Maintenance

✅ Supports Object-Oriented Programming Principles

---

# 🚀 Technologies Used

- ☕ Java 21
- 💻 Eclipse IDE
- 🧬 Object-Oriented Programming (OOP)
- 📦 Inheritance

---

# 📖 OOP Vocabulary

| Term | Meaning |
|------|---------|
| Class | Blueprint for creating objects |
| Object | Instance of a class |
| Parent Class | Class that provides shared features |
| Child Class | Class that inherits from a parent |
| Variable | Stores data |
| Method | Performs an action |
| Inheritance | Allows one class to reuse another class's members |

---

# 💡 Why This Project Matters

Hierarchical Inheritance is one of Java's core Object-Oriented Programming (OOP) concepts. It promotes **code reuse**, improves **maintainability**, and reduces duplicate code by allowing multiple child classes to inherit common functionality from a single parent class.

Understanding this concept builds a strong foundation for advanced Java development and automation frameworks such as **Selenium**, where inheritance is commonly used to organize reusable test code.

---

## ⭐ Author

**Tracy Joseph**

*Cloudberry Java Bootcamp – Day 8*

*"Learning Java one concept at a time."* ☕🚀
