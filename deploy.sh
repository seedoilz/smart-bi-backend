echo "----------maven clean and install-----------"
#mvn clean
mvn install -Dmaven.test.skip=true
BUILD_ID=dontKillMe nohup java -jar target/smart_bi-0.0.1-SNAPSHOT.jar &