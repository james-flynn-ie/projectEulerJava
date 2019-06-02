# projectEulerJava
Solutions for Project Euler Problems, written in Java.
https://projecteuler.net/archives

## Installing Java
* **Download and install Java Development Kit from the (Oracle website)[https://www.oracle.com/technetwork/java/javase/downloads/index.html].**

* Once installed, launch the command line and verify that Java is installed correctly:

```java
java -version
```
You should see output stating the Java version installed. If you see an error, check that the JDK installed correctly and that the Java path was added to the environment variables correctly. This guide is useful for configuring environment variables on (Windows) [https://javatutorial.net/set-java-home-windows-10] and on (Linux)[https://stackoverflow.com/questions/24641536/how-to-set-java-home-in-linux-for-all-users].

* git clone the repository (see "Cloning an Existing Repository" here: https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository), and then navigate into the folder containing the problem you wish to run. For example, if you cloned into the folder C:\repos\projectEulerJava and want to run problem one, then type:

```
cd C:\repos\projectEulerJava\p1MultiplesOf3And5
```

## Compiling the Java Application
In order to run the Java source code files on your machine (the *.java files in the repository), we need to convert it from the human-readable text to the language which the Java Virtual Machine (JVM) understands, which is bytecode. This is known as compilation, and results in a *.class file being outputted with the same name as the .java file that was inputted.
* To compile the Java application, execute the following command:

```java
javac Problem1.java 
```
This will compile the application for the Java Virtual Machine, and create the file Problem1.class

## Run the Java Application
* Finally, to run the Java application execute the following command:

```java
java Problem1
```

This will cause the JVM to interpret the bytecode within the *.class file into commands which are understood by your OS and version of Java.

# Have fun! :tada:
