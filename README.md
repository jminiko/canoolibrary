# canoolibrary
Simple Test Exercise
This exercise is done with [cuba platform](https://www.cuba-platform.com/)
##Run the web & REST interface
once you have downloaded the source:
get gradle version 4.10 & java 8u.131 (won't work with 9 or 7)

in the main directory (canoolibrary)
launch:

gradle buildUberJar

then upon successful compilation:
java -jar build/distributions/uberJar/canoo.jar

Now for the 
1- web tier
head up to:
[localhost](http://localhost:8080/canoo)

2- REST Tier
see the postman/canoo.postman_collection.json
it is a postman configuration file you can import in the latest version of Postman (https://www.getpostman.com/)
launch the auth request,
then the book request

- [x] web tier is complete (through to cuba/vaadin)
- [v] REST tier is almost complete, one has to check for the authorization and queries against Book entity
