This open source library aims to help the implementation of JSON-RPC clients in android applications.
The library provides a simple API to perform JSON-RPC service calls from an android device.

[JSON-RPC](http://json-rpc.org/) is a lightweight cross-language remote procedure call protocol that simplifies the creation of web services providers and clients. JSON serialization is typically more efficient than XML based serialization and is more suited for mobile environments like android. On the server side, several libraries exist to implement JSON-RPC services in the language of your choice (Python, Java, C#, PHP, ...).

See [Getting started](http://code.google.com/p/android-json-rpc/wiki/GettingStarted) for further information on getting the library running with android sdk

The library is distributed as source and as a jar file that you can directly import in android projects.

Version 0.3.4:
Adding function setDebug and getDebug to set the debug parameter.
When activated, the request and the response are displayed into logcat with the class name as tag.

Version 0.3.3:
Bugfix: using encoding UTF-8

Version 0.3.2:
Adding Threaded queries

New in 0.2.1 :
Bugfix for remote error handling with JSON-RPC 2.0.

New in 0.2 :
  * Support for connection and socket operations timeouts
  * HTTP 1.0 is now used by default (instead of HTTP 1.1)

For the next versions we will introduce:
- Publish a basic JSON web service, in PHP, to let developer test the library on.
- Publish the code of the web service in this project as a template
- Publish a template project on how to use the library in real
- Add http calling in a separated thread
- Add a Service class to let developer use the library as a background service in a separated thread.
- Add abstract classes to let developers create classes more easy to use in their code.


**If you have some questions about this library, feel free to ask them on [stackoverflow](http://www.stackoverflow.com) using the tag: android-json-rpc**