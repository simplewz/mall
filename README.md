# mall
Spring Cloud实现分布式电商项目

# 开发环境搭建
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

# git-ssh环境配置
## 1. 下载并安装git
[git下载地址](https://git-scm.com/)
## 2. git 常用设置
```
//配置git提交时的名字
git config --global user.name "your name"
//配置git提交时的邮箱
git config --global user.email "your email"
```
## 3.配置ssh免密登录
[gitee配置ssh免密登录](https://gitee.com/help/articles/4191#article-header0)
### 3.1 ssh-keygen -t rsa -C "yours@email.com" 生成秘钥,邮箱地址为注册码云/github时使用的邮箱地址
### 3.2 将生成好的秘钥完整的复制到码云/github
### 3.3 使用ssh -T git@gitee.com/ssh -T git@github.com测试连接是否成功





