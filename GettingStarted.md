## Forewords ##
Please use [stackoverflow](http://www.stackoverflow.com) using the tag "android-json-rpc" for your questions on the library. Thank you

## Introduction ##

This open source library aims to help the implementation of JSON-RPC clients in android applications.
For those who ask, this is only an Android client, there is no server side in there. You can use any server side JSON RPC library or language. For any question about a JSON RPC server for Java you can look at this project: https://code.google.com/p/jsonrpc4j/

## Installation ##
Download [latest android-json-rpc.jar](http://android-json-rpc.googlecode.com/files/android-json-rpc-0.2.jar) to the directory of your choice.
In eclipse, right-click on your android project and select
**Build Path -> Add external archives**
then selected the downloaded jar file.

Since ADT 17, there is another way to include external JAR files.
In your project, at the root, create a folder named "libs", without quotes. Copy the downloaded jar in this folder.
That's all.


## Getting started ##
The library provides the class JSONRPCClient to perform JSON-RPC method calls on remote services.

```
// Create client specifying JSON-RPC version 2.0
JSONRPCClient client = JSONRPCClient.create("http://service/uri", JSONRPCParams.Versions.VERSION_2);
client.setConnectionTimeout(2000);
client.setSoTimeout(2000);
try 
{
  String string = client.callString("mymethod");
  double d = client.callDouble("pow", x, y);
  int i = client.callInt("add", 56, 25); ...
}
catch (JSONRPCException e)
{
  e.printStackTrace();
}
```

For Complete documentation, download it on this site or look at [documentation](Documentation.md) page on this wiki.

Currently the library supports only JSON-RPC call over HTTP.
Support for TCP/IP would be interesting for creating efficient web services


## Donations ##
If you want to support our project, don't hesitate to make a donation via the following web site: [Donate](http://android-json-rpc.blogspot.ch/2013/07/donations.html)