@echo off
cls
set javav=%1
goto %javav%

:8
    setx JAVA_HOME /m "C:\Program Files\Java\jdk1.8.0_231"
    echo "Your current java version is %javav%"
    echo "Your java path -> %JAVA_HOME%"
    exit
:11
    setx JAVA_HOME /m "D:\revature\applications\jdk-11.0.2"
    echo "Your current java version is %javav%"
    echo "Your java path -> %JAVA_HOME%"
    exit