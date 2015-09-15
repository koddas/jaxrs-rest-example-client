# About this project

This project is a very simple RESTful client demo application. It runs on
Java 1.6 or newer.

The application will send a request to my corresponding
[JAX-RS REST server demo](https://github.com/koddas/jaxrs-rest-example-server),
which is a rather silly karaoke song request service. The client will send the
name of a song (Macarena by default, but you can change this in the source
code) and then print the result in the terminal.

# How do I build this project?

You can easily build the code directly from within your IDE of choice (I'm
personally rather fond of [Eclipse](http://www.eclipse.org)), using its build
features (in Eclipse, right click the project and select *Run As* ->
*Maven build*, type *package* into the *Goals* field, then *Run*). If you
prefer doing stuff more old school, you can use the command line to build the
project as well. To do so, you need to have Maven installed on your machine.
Navigate to your project location. Then, simply type

    mvn package

in your terminal. Your generated JAR files can be found as
*./target/jaxrs-rest-example-client-1.0.0.jar* and
*./target/jaxrs-rest-example-client-1.0.0-with-dependencies.jar*.

# How do I run this project?

The easiest way of running the code is directly from within your IDE of choice,
simply by hitting the *Run* button (in Eclipse, that is). If you prefer running
your code from the command line, navigate to the project location and type

    java -jar target/jaxrs-rest-example-client-1.0.0-with-dependencies.jar

That's it.