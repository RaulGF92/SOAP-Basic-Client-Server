# SOAP-Basic-Client-Server
Using the SOAP technologies and hibernate make a basic repository that connected by SOAP protocol using JAX-RS.

#Server side
For the serve side it use the hibernate 3.x version. It have the dependencies in the pom.xml.

#Cliente side
This side is made automated using the library wsimport. You can download in the next side [https://jax-ws.java.net/2.2.3/docs/wsimport.html](https://jax-ws.java.net/2.2.3/docs/wsimport.html). When you download the archives, you must go to /bin size. Here it is the wsimport.bat, if you like make the function to make the clases to connect the service need make this order.

> wsimport -keep http://[serverIP]/[nameOfPort]?wsdl

For this example i use this:

> wsimport -keep http://localhost:7013/videogames?wsdl

After the command was executed, apper a system of folder with all the classes for introduce in a java project, which need connect to the server.
