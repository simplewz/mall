# mall
Spring Cloud实现分布式电商项目

# 开发环境
## 1.后台
  * jdk1.8及以上版本(jdk1.8.271)
  * maven3.6.1及以上版本
  * IDEA2019
  
## maven做一些项目配置：
### 1. 配置阿里云镜像（下载jar包有较快的速度）
  ```
  <mirrors>
    <mirror>
      <id>nexus-aliyun</id>
      <mirrorOf>central</mirrorOf>
      <name>Nexus aliyun</name>
      <url>https://maven.aliyun.com/repository/central</url>
    </mirror>
  </mirrors>
  ```
### 2. 配置jdk1.8编译项目

```
  <profile>
      <id>jdk-1.8</id>

      <activation>
		    <activeByDefault>true</activeByDefault>
        <jdk>1.8</jdk>
      </activation>
		
	    <properties>
		    <maven.compiler.source>1.8</maven.compiler.source>
		    <maven.compiler.target>1.8</maven.compiler.target>
		    <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
	    </properties>
  </profile>
```
### 3. IDEA配置Maven
File--->Settings--->Build,Execution,Deployment--->Build Tools--->Maven--->User Setting Files--->Maven home directory(Maven安装路径)/User settings file(选择Maven配置文件)/Local repository（本地仓库路径）

## IDEA插件安装
File--->Settins--->Plugins--->Marketplace
### 1. lombak插件
  使用注解简化Javabean代码，使用注解自动生成对应的getter/setter方法及构造函数
### 2. MyBatisX
  MyBatisPlus开发的快速从mapper文件定位到xml文件的插件

## 2.前端
  * vscode
  * nodejs(相当于jdk)
  * npm(相当于maven)
  
## vscode插件安装
### 1. Auto Close Tag（自动开闭标签）
### 2. Auto Rename Tag（自动重命名）
### 3. chinese（vscode简体中文包）
### 4. Eslint （前端语法检查）
### 5. HTML CSS Support（支持Html CSS）
### 6.JavaScript(ES6)(js语法提示)
### 7.live server（代码热部署）
### 8.open in browser（在浏览器打开页面）
### 9.Vetur（开发Vue项目的插件）
  




