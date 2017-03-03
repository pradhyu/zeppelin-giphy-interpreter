# Zeppelin Giphy Interpreter

Who doesn't love an interpreter which displays Giphy gifs :) ? 
This is a demo project to see how to create a new Zeppelin interpreter.

## Build

It's a Maven project :

`mvn clean package`
 
You should have a zeppelin-giphy-interpreter-jar-with-dependencies.jar in the target directory.

## Install

If `ZEPPELIN_HOME` is your Zeppelin installation directory.

* Create a directory  in <ZEPPELIN_HOME>/interpreter:
```bash
cd <ZEPPELIN_HOME>/interpreter
mkdir giphy
```

* Copy the jar of giphy-interpreter in the directory `<ZEPPELIN_HOME>/interpreter/giphy`

* Start Zeppelin:
```bash
<ZEPPELIN_HOME>/bin/zeppelin-daemon.sh start
```

* Create the Giphy interpreter