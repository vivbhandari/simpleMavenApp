prepare:
	export PATH=/usr/local/apache-maven-3.5.0/bin:$PATH
	mvn install

compile:
	mvn clean compile

create-jar:
	mvn package

start:
	mvn exec:java
	#mvn exec:java -Dexec.mainClass="com.simpleApp.simpleMavenApp.App"

start-jar:
	java -jar target/simpleMavenApp-0.0.1-SNAPSHOT-jar-with-dependencies.jar

all:
	make prepare
	make compile
	make create-jar
	make start-jar

testGet:
	curl http://localhost:8080/app/v1/resource/testGet

testPost:
	curl -X POST -H "Content-Type: application/json" -d '{"id":"xyz123"}' http://localhost:8080/app/v1/resource/testPost
