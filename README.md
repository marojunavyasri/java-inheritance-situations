# java-inheritance-situations
This repository contains three simple Java programs demonstrating different types of inheritance using real-world examples.

## 📚 Programs Included

| Level     | Situation         | Inheritance Type         |
| --------- | ----------------- | ------------------------ |
| 🟢 Simple | School Management | Single Inheritance       |
| 🟡 Medium | Hospital Staff    | Hierarchical Inheritance |
| 🔴 High   | Library System    | Hybrid Inheritance       |

---

## 🟢 1. Simple Level – School Management

### Inheritance Type

**Single Inheritance**

### Structure

```text
Person
  ↓
Student
```

### Classes

* `Person` – Parent class
* `Student` – Child class
* `SchoolDemo` – Main class

### Description

The `Student` class inherits common information and behavior from the `Person` class.

The `Person` class contains:

* Name
* Age

The `Student` class contains:

* Roll Number
* Course

### Files

```text
01_Simple_Single_Inheritance/
├── Person.java
├── Student.java
└── SchoolDemo.java
```

### Run

```bash
javac *.java
java SchoolDemo
```

---

## 🟡 2. Medium Level – Hospital Staff

### Inheritance Type

**Hierarchical Inheritance**

### Structure

```text
       Staff
       /   \
   Doctor  Nurse
```

### Classes

* `Staff` – Parent class
* `Doctor` – Child class
* `Nurse` – Child class
* `HospitalDemo` – Main class

### Description

Both `Doctor` and `Nurse` inherit common information and behavior from the `Staff` class.

The `Staff` class contains:

* Name
* Staff ID

The `Doctor` class contains:

* Specialization

The `Nurse` class contains:

* Ward

### Files

```text
06_Medium_Hierarchical_Inheritance/
├── Staff.java
├── Doctor.java
├── Nurse.java
└── HospitalDemo.java
```

### Run

```bash
javac *.java
java HospitalDemo
```

---

## 🔴 3. High Level – Library System

### Inheritance Type

**Hybrid Inheritance**

### Structure

```text
          LibraryItem
          /        \
       Book      Magazine
        ↓
      EBook
```

### Classes

* `LibraryItem` – Base class
* `Book` – Child class
* `Magazine` – Child class
* `EBook` – Child class of `Book`
* `LibraryDemo` – Main class

### Description

The Library System combines **Hierarchical and Multilevel Inheritance**.

`Book` and `Magazine` inherit from `LibraryItem`.

`EBook` inherits from `Book`.

The `LibraryItem` class contains:

* Title
* Item ID

The `Book` class contains:

* Author

The `Magazine` class contains:

* Issue Number

The `EBook` class contains:

* File Size

### Files

```text
05_High_Hybrid_Inheritance/
├── LibraryItem.java
├── Book.java
├── Magazine.java
├── EBook.java
└── LibraryDemo.java
```

### Run

```bash
javac *.java
java LibraryDemo
```

> **Important:** Run `LibraryDemo.java`, not `Book.java`, `EBook.java`, or `Magazine.java`, because `LibraryDemo` contains the `main()` method.

---

## 💻 Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Inheritance

## 🎯 Learning Objectives

Through these programs, we can understand:

* Single Inheritance
* Hierarchical Inheritance
* Multilevel Inheritance
* Hybrid Inheritance
* Parent and child classes
* Code reusability
* Creating and using objects
* Methods and setters in Java

## 📂 Repository Structure

```text
java-inheritance-situations/
│
├── README.md
│
├── 01_Simple_Single_Inheritance/
│   ├── Person.java
│   ├── Student.java
│   └── SchoolDemo.java
│
├── 06_Medium_Hierarchical_Inheritance/
│   ├── Staff.java
│   ├── Doctor.java
│   ├── Nurse.java
│   └── HospitalDemo.java
│
└── 05_High_Hybrid_Inheritance/
    ├── LibraryItem.java
    ├── Book.java
    ├── Magazine.java
    ├── EBook.java
    └── LibraryDemo.java
```

## 👩‍💻 Author

**Navya Sri**
