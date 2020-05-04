DBS Dependency Injection with bean scope Singleton & Prototype

### Project Requirements
* JDK 1.8.

* Maven 4.

* Junit 4.12

###Design considerations
All registered Beans will be in memory after BeanContext is initiated when Spring Container is loaded, meanwhile, beans injected inside these beans will be injected according to the way of injection.

### Limitation
* Only support fields injection through @DIAutowire annotation and Bean Scope can support both Singleton and Prototype via @DIBean
* Registered Beans should be loaded when framework is loaded rather than when application retrieve Beans.

### Usage
Run unit test methods in class BeanDIExampleTest in package com.dbs.di.beans

### List of other features if their product may have given ample time
* Can support bean dependency in XML format.

* Can support injection way of both setter and constructor.

* Bean scope can support request/session/globe session.