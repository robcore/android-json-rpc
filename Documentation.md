# Introduction #

Here is a basic introduction to the documentation of this library. If you want or need more, you can access it [here](http://code.google.com/p/android-json-rpc/source/browse/#svn%2Ftrunk%2Fandroid-json-rpc%2Fdoc%253Fstate%253Dclosed) or dowload it using SVN (you will find how to do this [here](http://code.google.com/p/android-json-rpc/source/checkout)) or if you prefer you can download it as a ZIP archive [here](http://code.google.com/p/android-json-rpc/downloads/detail?name=doc-0.3.3.zip&can=2&q=#makechanges).

# Details #

## JSONEntity ##
This class inherit from [StringEntity](http://developer.android.com/reference/org/apache/http/entity/StringEntity.html), it define the entity that will be send to the serveur throught the HTTP protocol

## JSONRPCClient ##
This abstract class define function you can call as JSON calls as callJSONArray, callJSONObject, callInt, callLong and more. This class does not care about the protocol used. That must be defined by classes inheriting from it.

## JSONRPCException ##
this class inherit from Exception. This is class is used when raising an exception which is specific to this library.

## JSONRPCHttpClient ##
this class implements abstract function from JSONRPCClient. It permits to use the HTTP protocol to make your call to your JSON API.

## JSONRPCParams ##
This class contains all the parameters to initialize the library.

## JSONRPCThreadedClient ##
This is the equivalent to the JSONRPCClient but it uses a different thread than the UI one to make the calls to the JSON API.
This class is an abstract as no protocol is defined in.

## JSONRPCThreadedHttpClient ##
This class contains the implementation of the the abstract function from JSONRPCThreadedClient specific to use the HTTP protocol.
All calls are executed in a different thread than the UI one.