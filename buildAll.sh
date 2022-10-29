export JAVA_HOME='/Users/wissale/Library/Java/JavaVirtualMachines/corretto-17.0.4.1/Contents/Home'
export PROJECT_ROOT='/Users/wissale/Desktop/TheMicroServices'


cd $PROJECT_ROOT/eureka-service
./mvnw clean package -DskipTests

cd $PROJECT_ROOT/customer-service
./mvnw clean package -DskipTests

cd $PROJECT_ROOT/billing-service
./mvnw clean package -DskipTests

cd $PROJECT_ROOT/gateway-service
./mvnw clean package -DskipTests
