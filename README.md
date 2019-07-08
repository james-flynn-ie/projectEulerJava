# projectEulerJava

[![CircleCI](https://circleci.com/gh/james-flynn-ie/projectEulerJava.svg?style=svg)](https://circleci.com/gh/james-flynn-ie/projectEulerJava) [![codebeat badge](https://codebeat.co/badges/93b68aa4-21f6-494d-979d-feda6f8ff5a4)](https://codebeat.co/projects/github-com-james-flynn-ie-projecteulerjava-master)

## What is Project Euler?

`Project Euler is a series of challenging mathematical/computer programming problems that will require more than just mathematical insights to solve. Although mathematics will help you arrive at elegant and efficient methods, the use of a computer and programming skills will be required to solve most problems.`

_<https://projecteuler.net/about>_

The purpose of this repository is to share solutions to the [problems](https://projecteuler.net/archives), and to help each other improve as programmers by sharing solutions and suggesting ways to improve the code.

Feel free to [contribute](https://github.com/james-flynn-ie/projectEulerJava/blob/master/CONTRIBUTING.md)!

## Installing Java

* **Download and install Java Development Kit from the [Oracle website](https://www.oracle.com/technetwork/java/javase/downloads/index.html).**

* **Configure Java environment variables on your OS.** These guides are useful for configuring environment variables on [Windows](https://javatutorial.net/set-java-home-windows-10) and on [Linux](https://stackoverflow.com/questions/24641536/how-to-set-java-home-in-linux-for-all-users).

* **Launch the command line and verify that Java is installed correctly:**

```java
java -version
```

You should see output stating the Java version installed. If you see an error, check that the JDK installed correctly and that the Java path was added to the environment variables correctly.

* **git clone the repository** (see ["Cloning an Existing Repository"](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository))  

* **Open the Command Line Interface and then navigate into the folder containing the problem you wish to run.** For example, if you cloned into the folder C:\repos\projectEulerJava, then type:

```bash
cd C:\repos\projectEulerJava\
```

## Compiling the Java Application

In order to run the Java source code files on your machine (the *.java files in the repository), we need to convert it from the human-readable text to the language which the Java Virtual Machine (JVM) understands, which is bytecode. This is known as compilation, and results in a *.class file being outputted with the same name as the .java file that was inputted.

* **To compile the Java application, execute the following command from within the git repository's parent directory:**

```java
javac p1MultiplesOf3And5/Problem1.java
```

This will compile the application for the Java Virtual Machine, and create the file Problem1.class

## Run the Java Application

* **Run the Java application by executing the following command in the problem folder:**

```java
java p1MultiplesOf3And5.Problem1
```

You may notice that we need to add the package name in front of the class name when executing, `p1MultiplesOf3And5.Problem1`. Think of this as like adding the full mailing address of the class, so that the JVM can find it easily.

This command will cause the JVM to interpret the bytecode within the *.class file into commands which are understood by your OS and version of Java, and then run the program.

<span style="font-family:Papyrus; font-size:36pt;">Have Fun!</span>
