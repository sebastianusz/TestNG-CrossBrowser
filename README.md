# TestNG - Cross Browser Testing

Simple example of cross browser testing using TestNG

## Run

```
mvn clean
mvn test
```

## Introduction

*testng.xml* file is a configuration file which organizes tests.
It allows configuring tests to run in parallel, grouping tests, passing parameters into test methods.

`<suite>` tag is a collection of test cases. A suite is represented by one *.xml* file.

`parallel` parameter is for parallel execution of tests.

`thread-count` is a number of threads to use if parallel execution is used (else it is ignored).

`<parameter>` tag is for passing parameters as String to test methods in runtime.
In this example it passes which browser to use in given test.

More about TestNG here: https://testng.org/doc/documentation-main.html


![Alt text](screens/img.png?raw=true "Optional Title")

Setup method takes in browser parameter from *testng.xml* via `@Parameters` 
annotation and creates webdriver instance accordingly.
WebDriverManager (https://github.com/bonigarcia/webdrivermanager) takes care of managing webdriver versions.

![Alt text](screens/img_1.png?raw=true "Optional Title")

After a setup, test suite runs test method. You can set execution order by specifying
annotation element `priority`

![Alt text](screens/img_2.png?raw=true "Optional Title")