test the protobuf message as described in https://blog.geoffc.nz/protobufs-go/

1. Install protoc
   https://github.com/google/protobuf/releases/download/v3.0.0-beta-2/protoc-3.0.0-beta-2-osx-x86_64.zip

2. Build protobuf-java
   download https://github.com/google/protobuf/releases/download/v3.0.0-beta-2/protobuf-java-3.0.0-beta-2.zip
   unzip protobuf-java-3.0.0-beta-2.zip
   cd protobuf-3.0.0-beta-2/
   cd java/
   mvn clean package
   cp protobuf-java-3.0.0-beta-2.jar to new project below

3. Create project protobuf
   Create QuakeData class
   protoc -I=./ --java_out=./src/ ./quake.proto

4. Create class QuakeMain for test
   run:
   java -cp ../../../lib/protobuf-java-3.0.0-beta-2.jar:./  nz.org.geonet.quake.QuakeMain


