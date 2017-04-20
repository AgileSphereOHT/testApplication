# Duplicated from the project readme
This project contains a simple Spring Boot web app for the purposes of proving the development
and QA environments being prepared for the Agilesphere Overseas Healthcare Alpha.

The app displays a list of a basic "Person" details from a Postgres Database.

It allows the creation of additional "Persons" and on creation returns to the list showing the added Person.

The localhost url for the "List People" page is http://localhost:8080/list.

The maven pom.xml configuration has been tested for both embedded tomcat and jetty containers.

The database access has been made externally configurable.
See the sample config in config/application.properties

Scripts have been included to generate and populate the required schema.
See scripts in postgres/scripts...
Two dbs have been included (basedb and extradb) to allow the external config to be proved.
They both assume the existence of a user called "baseuser"
The app is configured by default to point to the basedb schema.