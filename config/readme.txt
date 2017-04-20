#testApplication
##TOMCAT VERSION

This project contains a simple Spring Boot web app for the purposes of proving the development
and QA environments being prepared for the Agilesphere Overseas Healthcare Alpha.

The app displays a list of a basic "Person" details from a Postgres Database.
It allows the creation of additional "Persons" and on creation returns to the list showing the added Person.

The localhost url for the "List People" page is http://localhost:8080/list.

The maven pom.xml configuration has been tested for both embedded tomcat and jetty containers.
**In this version the configuration is to start up the app in Tomcat.**

The database access has been made externally configurable.
See the sample config in **config/application.properties**
The config is automatically picked up from an application.properties file if the config directory is at the same root as the executable jar

Scripts have been included to generate and populate the required schema.
Two dbs have been included (basedb and extradb) to allow the external config to be proved.
They both assume the existence of a user called "baseuser" so the scripts may need tweaking if a different user is required.

See scripts in **postgres/scripts**
* 1-createdb.sql - creates user "baseuser" and database "basedb"
* 2-createtable.sql - creates and populates Person table in "basedb"
* 3-createdb-extra.sql - creates database "extradb"
* 4-createtable-extra.sql - creates and populates Person table in "extradb"

The "extra scripts" assume the existence of the user "baseuser" created in the first script.
The app is configured by default to point to the basedb schema.