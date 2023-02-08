
Trading Algorithm

Author: Anuja Pokharkar

Email Address: anujap58@gmail.com

Reference Links: stackoverflow | geeksforgeeks


Description

Team has provided a library containing all the required Trading Algo software and the job is to execute the Algo when given a ‘signal’ which is Integer value

SignalHandler Interface and Algo java class provided as third party library (that cannot be changed)

‘Application’ class has code to be able to process one of these signals. ‘Application’ class code only has three signals.

Implemented code so the application class is scalable to except new incoming signals.

Factory Design Pattern with the Strategy Design Pattern makes the code more flexible and scalable when adding new signals 

followed Single Responsibility Principle (SRP) and Open-Closed Principle (OCP) to maintain and scale


To execute Run 'AlgoApplication' in IntelliJ

REST endpoint: http://localhost:8080/api/v1/signal with signal passed in body


Dependency	Version	Description

Intellij IDEA	2022.3.1	Integrated Development Environment

Built in Maven	

Postman 10.9.3





