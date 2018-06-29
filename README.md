# weldInterceptorBug

## Project containing a web application which shows not working interception in weld 3

### Project setup

* JAVA version: jdk1.8.0_151
* Maven version: 3.5.3
* Weld2 (weld-servlet) version: 2.4.5.Final
* Weld3 (weld-servlet-shaded) version: 3.0.4.Final
* JSF (javax.faces) version: 2.3.3
* Tomcat 8.5.24

* clone the repository
* run the following command:
  * mvn clean package -Pweld2 => Works as intended with interception.
  * mvn clean package -Pweld3 => Does not work, because no interception happens.
  
### Project description:
This project contains a web application which shows that the interception which worked with weld2 stops working after upgrading to weld3. Therefore there are two maven profiles "weld2" and "weld3". The "weld2" maven profile is built with weld-servlet 2.4.5.Final. The "weld3" maven profile is built with weld-servlet-shaded 3.0.4.Final.

In order to run the web application deploy the war file on the tomcat and open the following URL in the browser 
http://<host>:<port>/cditest-servlet/index.xhtml

Then click the do something button. 
In case of the "weld2" profile the following message should appear:
Successfull. Bean has been intercepted.
In case of the "weld3" profile the following message should appear:
AssertionError: Exception Expected. Bean has not been intercepted.
