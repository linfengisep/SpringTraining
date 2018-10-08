1.add more modules, then the parent model don't need any dependencies, and change its jar to pom;
2.when creating different modules, adding their dependencies as well.
3.take care of the parent groupId and children groupId.
<parent>
    <groupId>com.coding.spring</groupId>
    <artifactId>SpringTrainingFun</artifactId>
    <version>1.0-SNAPSHOT</version>
  </parent>
  
  <groupId>com.coding.spring.SpringTrainingFun</groupId>
  <artifactId>bookshop-logic</artifactId>
  <version>1.0-SNAPSHOT</version>
  <name>bookshop-logic</name>
  <url>http://maven.apache.org</url>