# Introduction #

FAQ

# Details #

## Server Side Coding example? ##
This is not the subject of this project. The project is based on JSON-RPC, this technology can be implemented on the server side using any programming language.
You will find more informations on the this site: [JSON-RPC official web site](http://www.jsonrpc.org/)

## Does this project supports complex object like any custom object or array? ##
Currently the project can give response as JSONArray, JSONObject, int, String double, float and boolean. The project does not contain generic object parser.

You can find informations about [JSONArray](http://developer.android.com/reference/org/json/JSONArray.html) and [JSONObject](http://developer.android.com/reference/org/json/JSONObject.html) on the Android's developer website.

This feature will be added in a futur version.

## How to use the library? ##
Please refer to the [Getting Started](GettingStarted.md) page in this wiki.

## How can I pass credential in a request? ##
You can pass credential as parameters of your request. This if you need credentials in your functions. If you need credentials to access the page (.httpaccess), this library currently does not support this.
This feature will be added in Version 0.4. Thanks to stu.axon. Refer to the [Passing Credential](PassingCredential.md) page in this wiki.

## How to create your own JAR from downloaded code ##
Please refer to the [How to build your own JAR](HowBuildJar.md) page in this wiki

## Does this library support nested arrays ? ##
This feature has been added in version 0.3.1