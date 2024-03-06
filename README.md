
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Ratan Jagath Naik          |
| Date         | 03/05/2024                 |
| Course       | Spring 2024                |
| Assignment # | 3                          |

# Assignment Overview
The objective of this assignment is to build a foundational structure for an "Email Generation" application that can automate the process of creating personalized emails for different customer segments. The assignment challenges students to think about software design and how to effectively manage variations in behavior without the need for constant code changes.

The students are expected to devise a solution that allows the application to easily adjust its output—personalized emails—in response to different customer types, such as Business, Returning, Frequent, New, and VIP. The underlying goal is to enhance the student's understanding of design patterns and their practical applications in solving common software design problems. This will be evidenced by writing unit tests that demonstrate the application’s ability to produce the correct email for each type of customer, thereby reinforcing the importance of test-driven development as a fundamental part of the software engineering process.

# GitHub Repository Link:
https://github.com/RatanJN/665_Assignment3.git

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

ANS: The implementation demonstrates a high level of flexibility through the Strategy Design Pattern, which allows for easy addition or removal of object types. In the context of the email generation system, if a new customer segment needs to be introduced, a developer can simply create a new class that implements the EmailStrategy interface. This new class will encapsulate the email generation logic for the new customer type. Conversely, removing an existing customer type is as simple as deleting a class, with no need to alter any other part of the codebase. This modular approach ensures that the application can adapt quickly to changing requirements without disrupting the existing functionality.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

ANS: The simplicity and understandability of the implementation are ensured by having each customer segment's email strategy contained within its own class. There is no complex logic determining which email template to use; instead, this is handled through polymorphism where each strategy is an interchangeable object. Furthermore, the context class (ContextEmail) abstracts the strategy execution, providing a simple interface to the rest of the application. This makes the code easy to read and maintain since each part of the system has a well-defined role, and there's a clear flow of control.

- Describe how you have avoided duplicated code and why it is important.

ANS: By leveraging the Strategy Design Pattern, duplicated code is inherently avoided. Since different email generation behaviors are encapsulated within their respective strategy classes, there is no need to repeat logic across the application. This is important not only for reducing the likelihood of bugs but also for minimizing the maintenance overhead. When changes are required, they can be made in a single location rather than in multiple places throughout the code, which reduces the risk of inconsistent behavior and defects.

- If applicable, mention any design patterns you have used and explain why they were
chosen.

ANS: The Strategy Design Pattern was employed to manage the varying email generation requirements for different customer segments. It was chosen because it provides a means to define a family of algorithms, encapsulate each algorithm, and make them interchangeable at runtime. This pattern is ideal for the application because it aligns with the need for flexibility and maintainability while keeping the codebase organized and ensuring that new types of email strategies can be added without modifying existing classes. It promotes loose coupling and high cohesion, which are hallmarks of a well-architected software application.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




