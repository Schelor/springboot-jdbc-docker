## 使用openjdk8的基础镜像,从DockerHub仓库下载
From openjdk:8

## 复制当前工程编译打包后的jar包到 Docker引擎工作目录中
copy ./target/springboot-jdbc-1.0.0-SNAPSHOT.jar springboot-jdbc-1.0.0-SNAPSHOT.jar

## 容器启动的默认命令
CMD ["java","-jar","springboot-jdbc-1.0.0-SNAPSHOT.jar"]