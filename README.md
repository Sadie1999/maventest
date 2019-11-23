# maventest
### 1.项目开发

通过github拉取本项目到本地；
git clone https://github.com/Sadie1999/maventest.git
使用IDEA打开项目；

### 2.持续集成测试方法

在本地项目中进行bug修复，之后将该项目再次push到这个github；
我购买的阿里云服务器IP:47.100.63.141
在浏览器上打开地址：http://47.100.63.141:8080/
登录后进入jenkins页面（前提是已经配置好整个开发环境）
新建一个MAVEN项目：

项目的具体配置如下：

git里包括两个分支，master里是不包括testNG的，（之前不知道怎样添加测试用例）branch3里有testNG:

![1574517866468](C:\Users\THINKPAD\AppData\Roaming\Typora\typora-user-images\1574517866468.png)

RootPOM是我自己的阿里云服务器下的pom.xml目录（我的这个不能直接默认，默认会找不到pom.xml文件，所以就直接自己设了路径）

![1574517970138](C:\Users\THINKPAD\AppData\Roaming\Typora\typora-user-images\1574517970138.png)

TestNG Result里也要自己改一下路径，不然会找不到这个文件，然后显示没有测试用例：

![1574518079044](C:\Users\THINKPAD\AppData\Roaming\Typora\typora-user-images\1574518079044.png)

之后立即构建即可，可以查看TestResult(需要在jenkins上安装TestNG插件)

### 3.缺陷提交步骤



使用缺陷管理工具Redmine(jira破解版在本机上极其不稳定，应该是本机的内存太小的原因)

浏览器输入http://47.100.63.141/redmine/进入；

登录自己的账号密码；

可以在里面相应的任务下新建子任务和新建问题提交之前发现的缺陷，并指派给开发者；

