prepare:
	export PATH=/usr/local/apache-maven-3.5.0/bin:$PATH
	mvn install

build:
	mvn package

start:
	mvn exec:java
	#mvn exec:java -Dexec.mainClass="com.simpleApp.simpleMavenApp.App"

testGet:
	curl http://localhost:8080/app/v1/resource/testGet

testPost:
	curl -X POST -H "Content-Type: application/json" -d '{"id":"xyz123"}' http://localhost:8080/app/v1/resource/testPost
