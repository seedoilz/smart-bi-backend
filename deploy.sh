echo "----------maven clean and install-----------"
mvn clean
mvn install -Dmaven.test.skip=true
java -jar target/smart_bi-0.0.1-SNAPSHOT.jar