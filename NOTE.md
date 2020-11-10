### 如何初始化一个github项目为maven项目
步骤1: 在根节点添加一个pom.xml文件
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>xxxx</groupId>
    <artifactId>xxx</artifactId>
    <packaging>pom</packaging>
    <version>1.0-SNAPSHOT</version>

</project>
```
步骤2：鼠标右键，选择add project as maven project  
步骤3: 添加依赖