## Description 
Proof of concept: The idea is to have components that can be deployed as microservices or as part as a monolithic application with very little configuration. Even better, without no changes in the components, just in the monolithic app
 but trying to minimize de extra code and sharing the main configuration.
 
 For this, we are using more bean declaration, rather than package scan, in order to have 
 a more controlled configuration and dependency injection.

Also, as part of the proof of concept, modules are in Java and Kotlin
