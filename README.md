# Java Inheritance Examples

This repository contains Java programs that demonstrate different types of inheritance using real-world examples.

The programs included are:

1. **School Management – Single Inheritance**
2. **Hospital Staff – Hierarchical Inheritance**
3. **Library System – Hybrid Inheritance**

These examples help understand how inheritance allows one class to reuse the properties and methods of another class.

---

# 1. School Management – Single Inheritance

## Description

This program demonstrates **Single Inheritance** using a school management example.

In single inheritance, one child class inherits from one parent class.

### Class Structure

```text
Person
   ↓
Student
```

* `Person` is the parent class.
* `Student` is the child class.
* `Student` inherits common information and behavior from `Person`.

## Classes and Responsibilities

### Person.java

The `Person` class contains:

* `name`
* `age`
* `displayPersonDetails()` method

### Student.java

The `Student` class contains:

* `rollNo`
* `course`
* `displayStudentDetails()` method

It also inherits the properties and methods of `Person`.

### SchoolDemo.java

This is the main class.

It:

1. Creates a `Student` object.
2. Takes student information using `Scanner`.
3. Sets the values using setter methods.
4. Displays the details.

## Files

```text
01_Single_Inheritance/
├── Person.java
├── Student.java
└── SchoolDemo.java
```

## Run the Program

```bash
javac *.java
java SchoolDemo
```

---

# 2. Hospital Staff – Hierarchical Inheritance

## Description

This program demonstrates **Hierarchical Inheritance** using a hospital staff example.

In hierarchical inheritance, multiple child classes inherit from the same parent class.

### Class Structure

```text
          Staff
         /     \
    Doctor     Nurse
```

* `Staff` is the parent class.
* `Doctor` and `Nurse` are child classes.
* Both child classes inherit common information and behavior from `Staff`.

## Classes and Responsibilities

### Staff.java

The `Staff` class contains:

* `name`
* `staffId`
* `displayStaffDetails()` method

### Doctor.java

The `Doctor` class contains:

* `specialization`
* `displayDoctorDetails()` method

It inherits common staff details from `Staff`.

### Nurse.java

The `Nurse` class contains:

* `ward`
* `displayNurseDetails()` method

It also inherits common staff details from `Staff`.

### HospitalDemo.java

This is the main class.

It:

1. Creates a `Doctor` object.
2. Creates a `Nurse` object.
3. Takes their details using `Scanner`.
4. Displays their common and specific information.

## Files

```text
02_Hierarchical_Inheritance/
├── Staff.java
├── Doctor.java
├── Nurse.java
└── HospitalDemo.java
```

## Run the Program

```bash
javac *.java
java HospitalDemo
```

---

# 3. Library System – Hybrid Inheritance

## Description

This program demonstrates **Hybrid Inheritance** using a library system.

Hybrid inheritance combines more than one type of inheritance structure.

In this example, **Hierarchical Inheritance** and **Multilevel Inheritance** are combined.

### Class Structure

```text
             LibraryItem
             /         \
          Book       Magazine
           |
         EBook
```

### Explanation

* `LibraryItem` is the base class.
* `Book` inherits from `LibraryItem`.
* `Magazine` also inherits from `LibraryItem`.
* `EBook` inherits from `Book`.

Therefore, the program combines:

**Hierarchical Inheritance:**

```text
LibraryItem
   /    \
 Book  Magazine
```

and

**Multilevel Inheritance:**

```text
LibraryItem
    ↓
   Book
    ↓
  EBook
```

Together they form a hybrid inheritance structure.

## Classes and Responsibilities

### LibraryItem.java

Contains:

* `title`
* `itemId`
* `displayItemDetails()` method

### Book.java

Contains:

* `author`
* `displayBookDetails()` method

It inherits details from `LibraryItem`.

### Magazine.java

Contains:

* `issueNumber`
* `displayMagazineDetails()` method

It also inherits details from `LibraryItem`.

### EBook.java

Contains:

* `fileSize`
* `displayEBookDetails()` method

It inherits from `Book`, so it can access the inherited behavior from both `Book` and `LibraryItem`.

### LibraryDemo.java

This is the main class.

It:

1. Creates an `EBook` object.
2. Creates a `Magazine` object.
3. Takes information using `Scanner`.
4. Displays all the details.

## Files

```text
03_Hybrid_Inheritance/
├── LibraryItem.java
├── Book.java
├── Magazine.java
├── EBook.java
└── LibraryDemo.java
```

## Run the Program

```bash
javac *.java
java LibraryDemo
```

**Note:** Run `LibraryDemo.java`, not `Book.java` or `EBook.java`, because `LibraryDemo` contains the `main()` method.

---

# 4. Mobile Application – Multiple Inheritance

## Description

This program demonstrates **Multiple Inheritance using interfaces**.

Java does not support multiple inheritance through classes. However, Java supports multiple inheritance through interfaces.

In this example:

* `GPS` is the first interface.
* `Camera` is the second interface.
* `MobileApp` implements both interfaces.

### Structure

```text
      GPS          Camera
       \             /
        \           /
          MobileApp
```

The `MobileApp` class receives functionality from both `GPS` and `Camera`.

## Interfaces and Classes

### GPS.java

The `GPS` interface contains:

```java
void getLocation();
```

This method is used to get and display the current location.

### Camera.java

The `Camera` interface contains:

```java
void takePhoto();
```

This method is used to capture a photo.

### MobileApp.java

The `MobileApp` class implements both:

```java
implements GPS, Camera
```

It contains:

* `appName`
* `location`
* `getLocation()`
* `takePhoto()`
* `displayAppDetails()`

---

# Technologies Used

* Java
* Object-Oriented Programming
* Inheritance
* Interfaces
* Scanner for User Input

---

# Concepts Demonstrated

## Single Inheritance

One child class inherits from one parent class.

```text
Parent
  ↓
Child
```

## Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

```text
       Parent
       /    \
   Child1  Child2
```

## Hybrid Inheritance

A combination of different inheritance structures.

## Multiple Inheritance using Interfaces

A class implements multiple interfaces.

```text
Interface 1     Interface 2
      \            /
       \          /
          Class
```

---

# User Input

All main programs use Java's `Scanner` class to take input from the user.

Example:

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter name: ");
String name = sc.nextLine();
```

This makes the programs interactive instead of using fixed values.

---

# How to Compile and Run

Open the terminal inside the required folder.

For example:

```bash
cd 01_Single_Inheritance
javac *.java
java SchoolDemo
```

For the hospital program:

```bash
cd 02_Hierarchical_Inheritance
javac *.java
java HospitalDemo
```

For the library program:

```bash
cd 03_Hybrid_Inheritance
javac *.java
java LibraryDemo
```
# Learning Outcome

These programs demonstrate how Java inheritance can be used to:

* Reuse code from parent classes.
* Create specialized child classes.
* Organize related classes.
* Implement different inheritance structures.
* Use interfaces to achieve multiple inheritance.
* Take dynamic input using `Scanner`.
* Understand the basics of Object-Oriented Programming.

---

# Repository Structure

```text
java-inheritance-situations/
│
├── README.md
│
├── 01_Single_Inheritance/
│   ├── Person.java
│   ├── Student.java
│   └── SchoolDemo.java
│
├── 02_Hierarchical_Inheritance/
│   ├── Staff.java
│   ├── Doctor.java
│   ├── Nurse.java
│   └── HospitalDemo.java
│
├── 03_Hybrid_Inheritance/
   ├── LibraryItem.java
   ├── Book.java
   ├── Magazine.java
   ├── EBook.java
   └── LibraryDemo.java

```

# Author

**Navya Sri**
