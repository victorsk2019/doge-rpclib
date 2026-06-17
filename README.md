# doge-rpclib 

Dogecoin RPC API connection library that uses HttpURLConnection to send and receive JSON content.  It is a NetBeans project and so is best to be used and compiled in that IDE using Apache ant.

## How it works

There are 3 java files:

``` 
    rpclib
     |
     -----client
     |	   |
     |	   RPCClient.java
     |    
     -----util
           |
           RPCConnect.java	
           |
           RPCProperties.java
```

RPCClient.java: This is a client-facing class whose instance is used to send and receive JSON-RPC responses.

RPCConnect.java: This class is used for "heavy lifting" connection to the Dogecoin's blockchain RPC service, in JSON content with method name and a parameter.  Using UTF-8 character encoding it writes a request to an output stream and the JSON-formatted response string is returned from RPC method call.

RPCProperties.java: This is a helper class to help encapsulate RPC connection information and provide accessor methods for a more laconic use. 
